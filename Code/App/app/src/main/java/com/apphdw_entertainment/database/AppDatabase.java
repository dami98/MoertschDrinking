/* Autor: Philipp Hartenfeller */

package com.apphdw_entertainment.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;

@Database(entities = {Ten.class, Event.class, NoteImage.class, NoteTag.class, SubTodo.class, Todo.class}, version = 2, exportSchema = false)
@TypeConverters({TimestampConverter.class, ImageConverter.class})
public abstract class AppDatabase extends RoomDatabase {
    public abstract TenDao tenDao();
    public abstract EventDao eventDao();
    public abstract NoteImageDao noteImageDao();
    public abstract NoteTagDao noteTagDao();
    public abstract TodoDao todoDao();
    public abstract SubTodoDao subTodoDao();
}
