/* Autor: Philipp Hartenfeller */

package com.apphdw_entertainment.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.sql.Date;

@Entity(tableName = "ten")
public class Ten {

    @ColumnInfo(name = "ten_id")
    @PrimaryKey(autoGenerate = true)
    private long tenId;

    private String title;

    private String description;

    @ColumnInfo(name = "type_id")
    private int typeId;

    @ColumnInfo(name = "created_ts")
    private Date createdTs;

    public Ten(String title, String description, int typeId) {
        Date sqlDate = new java.sql.Date(System.currentTimeMillis());

        this.title = title;
        this.description = description;
        this.typeId = typeId;
        this.createdTs = sqlDate;
    }



    //getters

    public long getTenId() {
        return tenId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getTypeId() {
        return typeId;
    }

    public Date getCreatedTs() {
        return createdTs;
    }

    // setters

    public void setTenId(long entityId) {
        this.tenId = entityId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public void setCreatedTs(Date createdTs) {
        this.createdTs = createdTs;
    }
}

