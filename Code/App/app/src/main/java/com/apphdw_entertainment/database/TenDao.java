/* Autor: Philipp Hartenfeller */

package com.apphdw_entertainment.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface TenDao {
    @Query("select * from Ten order by created_ts desc")
    List<Ten> getAllTens();

    @Query("select * from Ten where type_id = 1 order by created_ts desc")
    List<Ten> getAllToDo();

    @Query("select * from Ten where type_id = 2 order by created_ts desc")
    List<Ten> getAllEvent();

    @Query("select * from Ten where type_id = 3 order by created_ts desc")
    List<Ten> getAllNote();

    @Query("select count(*) from Ten")
    int getTenCount();

    @Query("select count(*) from Ten where type_id = 1")
    int getToDoCount();

    @Query("select count(*) from Ten where type_id = 2")
    int getEventCount();

    @Query("select count(*) from Ten where type_id = 3")
    int getNoteCount();

    @Query("select * from ten where ten_id = :tenId")
    Ten getTenWithId(long tenId);

    @Insert
    long insertTen(Ten ten);

    @Update
    void updateTen(Ten ten);

    @Delete
    void deleteTen(Ten ten);

}
