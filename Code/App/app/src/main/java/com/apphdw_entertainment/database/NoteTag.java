/* Autor: Philipp Hartenfeller */

package com.apphdw_entertainment.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity(
        tableName = "note_tags",
        foreignKeys = @ForeignKey(entity = Ten.class, parentColumns = "ten_id", childColumns = "fk_ten_id")
)
public class NoteTag {
    @ColumnInfo(name = "note_tag_id")
    @PrimaryKey(autoGenerate = true)
    private long noteTagId;

    @ColumnInfo(name = "fk_ten_id", index = true)
    private long fkTenId;

    private String tag;

    public NoteTag(String tag) {
        this.tag = tag;
    }

    public long getNoteTagId() {
        return noteTagId;
    }

    public void setNoteTagId(long noteTagId) {
        this.noteTagId = noteTagId;
    }

    public long getFkTenId() {
        return fkTenId;
    }

    public void setFkTenId(long fkTenId) {
        this.fkTenId = fkTenId;
    }

    public String getTag() {
        return tag;
    }

}
