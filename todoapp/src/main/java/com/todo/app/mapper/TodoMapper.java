package com.todo.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.todo.app.entity.Todo;

/**
 * DBを操作するメソッドを呼び出すためのインターフェース。
 * このインターフェースから、メソッドを呼び出す。
 * このインターフェースの具象クラスは、MyBatis が XML の SQL情報から自動で作成してくれる。
 */


@Mapper
public interface TodoMapper {

    public List<Todo> selectAll();

    public List<Todo> selectIncomplete();

    public List<Todo> selectComplete();

    public void add(Todo todo);

    public void update(Todo todo);
    
    public void delete();

}