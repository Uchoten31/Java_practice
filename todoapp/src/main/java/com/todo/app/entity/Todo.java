package com.todo.app.entity;

import java.sql.Date;

import lombok.Data;

/**
 * テーブルのデータを保持するためのもの
 */


// @Data lombokのGetter・Setter自動生成のためのもの
@Data
public class Todo {

    private long id;
    private String title;
    private int done_flg;
    private String time_limit;
}

