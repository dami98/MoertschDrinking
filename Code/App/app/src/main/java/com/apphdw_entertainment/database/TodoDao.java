/* Autor: Philipp Hartenfeller */

package com.apphdw_entertainment.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface TodoDao {
    @Query("select * from todos where fk_ten_id = :tenId")
    Todo getTodoWithId(long tenId);

    @Insert
    long insertTodo(Todo todo);

    @Update
    void updateTodo(Todo todo);

    @Delete
    void deleteTodo(Todo todo );
}
