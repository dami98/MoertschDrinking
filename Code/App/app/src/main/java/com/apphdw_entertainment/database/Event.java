/* Autor: Philipp Hartenfeller */

package com.apphdw_entertainment.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import java.sql.Date;

@Entity(
        tableName = "event",
        foreignKeys = @ForeignKey(entity = Ten.class, parentColumns = "ten_id", childColumns = "fk_ten_id")
)
public class Event {
    @ColumnInfo(name = "event_id")
    @PrimaryKey(autoGenerate = true)
    private long eventId;

    @ColumnInfo(name = "fk_ten_id", index = true)
    private long fkTenId;

    @ColumnInfo(name = "alert_date")
    private Date alertDate;

    public Event(Date alertDate) {
        this.alertDate = alertDate;
    }

    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public long getFkTenId() {
        return fkTenId;
    }

    public void setFkTenId(long tenId) {
        this.fkTenId = tenId;
    }

    public Date getAlertDate() {
        return alertDate;
    }

    public void setAlertDate(Date alertDate) {
        this.alertDate = alertDate;
    }
}
