/* Autor: Philipp Hartenfeller */

package com.apphdw_entertainment.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import android.provider.ContactsContract;

import java.util.List;

@Dao
public interface NoteTagDao {
    @Query("select * from note_tags")
    List<NoteTag> getAllNoteTags();

    @Query("select * from note_tags where fk_ten_id = :tenId")
    List<NoteTag> getNoteTagsWithId(long tenId);

    @Insert
    void insertNoteTag(NoteTag noteTag);

    @Update
    void updateNoteTag(NoteTag noteTag);

    @Delete
    void deleteNoteTag(NoteTag noteTag);
}
