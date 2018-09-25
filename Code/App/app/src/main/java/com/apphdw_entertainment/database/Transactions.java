/* Autor: Philipp Hartenfeller */

package com.apphdw_entertainment.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Transaction;
import com.apphdw_entertainment.Game.MainGame;

import java.util.ArrayList;
import java.util.List;

@Dao
public abstract class Transactions {

    @Transaction
    public static List<Long> insertEvents(Ten ten, List<Event> eventList)
    {
        List<Long> eventIdsArray = new ArrayList<>(3);

        long tenId = MainGame.getDb().tenDao().insertTen(ten);

        for (Event event: eventList) {
            event.setFkTenId(tenId);
            long eventId = MainGame.getDb().eventDao().insertEvent(event);
            eventIdsArray.add(eventId);
        }

        return eventIdsArray;

    }

    @Transaction
    public static long insertTodo(Ten ten, Todo todo, List<SubTodo> subTodoList) {
        long tenId = MainGame.getDb().tenDao().insertTen(ten);

        todo.setFkTenId(tenId);
        long todoId = MainGame.getDb().todoDao().insertTodo(todo);


        for (SubTodo subTodo: subTodoList) {
            subTodo.setFkTodoId(todoId);
            MainGame.getDb().subTodoDao().insertSubTodo(subTodo);
        }

        return todoId;
    }

    @Transaction
    public static void insertNote(Ten ten, List<NoteTag> noteTagList, List<NoteImage> noteImagesList) {
        long tenId = MainGame.getDb().tenDao().insertTen(ten);

        for (NoteTag noteTag : noteTagList) {
            noteTag.setFkTenId(tenId);
            MainGame.getDb().noteTagDao().insertNoteTag(noteTag);
        }

        for (NoteImage noteImage : noteImagesList) {
            noteImage.setFkTenId(tenId);
            MainGame.getDb().noteImageDao().insertNoteImage(noteImage);
        }
    }

    // class cannot get instanciated
    private Transactions() {}

}
