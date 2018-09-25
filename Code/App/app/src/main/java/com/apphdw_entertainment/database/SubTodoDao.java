/* Autor: Philipp Hartenfeller */

package com.apphdw_entertainment.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface SubTodoDao {
    @Query("select * from sub_todos e where fk_todo_id = :todoId")
    List<SubTodo> getSubTodosWithId(long todoId);

    @Insert
    void insertSubTodo(SubTodo subTodo);

    @Update
    void updateSubTodo(SubTodo subTodo);

    @Delete
    void deleteSubTodo(SubTodo subTodo);
}
