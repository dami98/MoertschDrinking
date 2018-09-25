/* Autor: Philipp Hartenfeller */

package com.apphdw_entertainment.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import java.sql.Date;
import java.util.Calendar;

@Entity(
        tableName = "todos",
        foreignKeys = @ForeignKey(entity = Ten.class, parentColumns = "ten_id", childColumns = "fk_ten_id")
)
public class Todo {
    @ColumnInfo(name = "todo_id")
    @PrimaryKey(autoGenerate = true)
    private long todoId;

    @ColumnInfo(name = "fk_ten_id", index = true)
    private long fkTenId;

    @ColumnInfo(name = "begin_date")
    private Date beginDate;

    @ColumnInfo(name = "end_date")
    private Date endDate;

    public Todo(Calendar beginDate, Calendar endDate) {
        this(TimestampConverter.fromTimestamp(beginDate.getTimeInMillis()), TimestampConverter.fromTimestamp(endDate.getTimeInMillis()));
    }

    public Todo(Date beginDate, Date endDate) {
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public long getTodoId() {
        return todoId;
    }

    public void setTodoId(long todoId) {
        this.todoId = todoId;
    }

    public long getFkTenId() {
        return fkTenId;
    }

    public void setFkTenId(long fkTenId) {
        this.fkTenId = fkTenId;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
