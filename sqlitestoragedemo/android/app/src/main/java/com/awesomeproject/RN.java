package com.awesomeproject;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import com.facebook.react.bridge.ReadableMap;

public class RN {
    SQLiteDatabase db;
    public RN(SQLiteDatabase db) {
        this.db = db;
    }
    public void insert(ReadableMap map) {
        String sql = "insert into user(name,age) values('"+map.getString("name")+"',"+map.getInt("age")+")";
        db.execSQL(sql);

        SQLiteStatement stmt = db.compileStatement(sql);
        int insertId = (int) stmt.executeInsert();
    }
}
