/* Autor: Philipp Hartenfeller */

package com.apphdw_entertainment.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface NoteImageDao {
    @Query("select * from note_images e")
    List<NoteImage> getAllNoteImages();

    @Query("select * from note_images where fk_ten_id = :tenId")
    List<NoteImage> getNoteImagesWithId(long tenId);

    @Insert
    void insertNoteImage(NoteImage noteImage);

    @Update
    void updateNoteImage(NoteImage noteImage);

    @Delete
    void deleteNoteImage(NoteImage note);
}
