/* Autor: Philipp Hartenfeller */

package com.apphdw_entertainment.database;

import android.arch.persistence.room.TypeConverter;

import java.sql.Date;


public class TimestampConverter {

    @TypeConverter
    public static Date fromTimestamp(Long dateLong) {
        if (dateLong == null) {
            return null;
        }
        else {
            return new Date(dateLong);
        }
    }

    @TypeConverter
    public static Long dateToTimestamp(Date date) {
        if (date == null) {
            return null;
        }
        else {
            return date.getTime();
        }
    }

    // class cannot get instanciated
    private TimestampConverter() {}

}