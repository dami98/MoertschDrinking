/* Autor: Philipp Hartenfeller */

package com.apphdw_entertainment.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.graphics.Bitmap;

@Entity(
        tableName = "note_images",
        foreignKeys = @ForeignKey(entity = Ten.class, parentColumns = "ten_id", childColumns = "fk_ten_id")
)
public class NoteImage {
    @ColumnInfo(name = "note_image_id")
    @PrimaryKey(autoGenerate = true)
    private long noteImageId;

    @ColumnInfo(name = "fk_ten_id", index = true)
    private long fkTenId;

    @ColumnInfo(typeAffinity = ColumnInfo.BLOB)
    private byte[] image;

    public long getNoteImageId() {
        return noteImageId;
    }

    public void setNoteImageId(long noteImageId) {
        this.noteImageId = noteImageId;
    }

    public long getFkTenId() {
        return fkTenId;
    }

    public void setFkTenId(long fkTenId) {
        this.fkTenId = fkTenId;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public NoteImage(Bitmap imageBmp) {
        this(ImageConverter.toByteArray(imageBmp));
    }

    NoteImage(byte[] image) {
        this.image = image;
    }
}
