/* Autor: Philipp Hartenfeller */

package com.apphdw_entertainment;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class GlobalConstants {
    static final int REQUESTCODEONE = 1;

    public static final int YEAR = 0;
    public static final int MONTH = 1;
    public static final int DAYOFMONTH = 2;
    public static final int HOUR_OF_DAY = 3;
    public static final int MINUTE = 4;

    public static final String DATEFORMAT = "dd.MM.yyyy";
    public static final String TIMEFORMAT = "HH:mm";

    private static final String DATETIMEFORMAT = "dd.MM.yyyy HH:mm";
    public static final DateFormat SDFDATETIEM = new SimpleDateFormat(DATETIMEFORMAT, Locale.GERMANY);

    public static final Class<?> ACTIVITYGAME = com.apphdw_entertainment.Game.MainGame.class;

    // class cannot get instanciated
    private GlobalConstants() {}
}
