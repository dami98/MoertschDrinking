package com.apphdw_entertainment.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity(
        tableName = "sub_todos",
        foreignKeys = @ForeignKey(entity = Todo.class, parentColumns = "todo_id", childColumns = "fk_todo_id")
)
public class SubTodo {
    @ColumnInfo(name = "sub_todo_id")
    @PrimaryKey(autoGenerate = true)
    private long subTodoId;

    @ColumnInfo(name = "fk_todo_id", index = true)
    private long fkTodoId;

    @ColumnInfo(name = "description")
    private String description;

    @ColumnInfo(name = "done")
    private int done;

    public SubTodo(String description) {
        this.description = description;
        this.done = 0;
    }

    public long getSubTodoId() {
        return subTodoId;
    }

    public void setSubTodoId(long subTodoId) {
        this.subTodoId = subTodoId;
    }

    public long getFkTodoId() {
        return fkTodoId;
    }

    public void setFkTodoId(long fkTodoId) {
        this.fkTodoId = fkTodoId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDone() {
        return done;
    }

    public void setDone(int done) {
        this.done = done;
    }
}
