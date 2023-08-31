package com.todo.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.todo.app.entity.Todo;
import com.todo.app.mapper.TodoMapper;


/**
 * このクラスから、Mapperインターフェースのメソッドを呼び出し、
 * そのメソッドによってDBからデータを取得し、
 * そのデータを埋め込んで、ブラウザに表示します。
 */

@Controller
public class TodoController {

	// フィールドインジェクション（非推奨）
    @Autowired
    TodoMapper todoMapper;

    @RequestMapping(value="/")
    public String index(Model model) {
    	/**
    	 * todoMapper.メソッド名()でインターフェースのメソッドを実行し、
    	 * xml内のSQLの結果を戻り値として変数に格納。
    	 * listの値にtodosという名前を付けて、ビュー(index.html側)に渡します。
    	 * 　→Thymeleafの${todos}の部分。
    	 * returnでindex.htmlを指定。
    	 */
//      List<Todo> list = todoMapper.selectAll();
        List<Todo> list = todoMapper.selectIncomplete();
        List<Todo> doneList = todoMapper.selectComplete();
        model.addAttribute("todos",list);
        model.addAttribute("doneTodos",doneList);
        return "index";
    }

    /**
     * 「/add」で呼び出すメソッドを作成します。
     * 呼び出しと同時にビュー側から渡される値を、Mapperのaddメソッドの引数に渡しています。
     * メソッドを実行した後、indexメソッドにリダイレクトしています。
     * @param todo
     * @return indexメソッドにリダイレクト
     */
    @RequestMapping(value="/add")
    public String add(Todo todo) {
        todoMapper.add(todo);
        return "redirect:/";
    }

    @RequestMapping(value="/update")
    public String update(Todo todo) {
        todoMapper.update(todo);
        return "redirect:/";
    }
    
    @RequestMapping(value="/delete")
    public String delete() {
    	todoMapper.delete();
    	return "redirect:/";
    }

}
