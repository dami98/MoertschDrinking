/* Autor: Philipp Hartenfeller */

package com.apphdw_entertainment.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface EventDao {

    @Query("select * from event where fk_ten_id = :tenId")
    Event getEventWithId(long tenId);

    @Query("select * from event where fk_ten_id = :tenId")
    List<Event> getEventsWithId(long tenId);

    @Insert
    long insertEvent(Event event);

    @Delete
    void deleteEvent(Event event);
}
