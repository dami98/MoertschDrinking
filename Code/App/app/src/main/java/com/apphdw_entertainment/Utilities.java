/* Autor: Philipp Hartenfeller */

package com.apphdw_entertainment;

import android.app.Activity;
import android.content.Intent;
import com.apphdw_entertainment.database.AppDatabase;
import com.apphdw_entertainment.database.Ten;
import com.apphdw_entertainment.database.TenDao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Utilities {

    public static void startActivity(Activity activity, Class<?> activityClass) {
        Intent intent = new Intent();
        intent.setClass(activity, activityClass);

        activity.startActivityForResult(intent, GlobalConstants.REQUESTCODEONE);
    }

    // start activity with key
    public static void startActivity(Activity activity, Class<?> activityClass, long key, ArrayList<String> playerList) {
        Intent intent = new Intent();
        intent.setClass(activity, activityClass);

        intent.putExtra("Key", key);
        intent.putExtra("listOfPlayer",playerList);

        activity.startActivityForResult(intent, GlobalConstants.REQUESTCODEONE);
    }

    public static int[] getCurrentDate() {
        int[] arr = new int[5];

        Calendar c = Calendar.getInstance();
        arr[GlobalConstants.YEAR] = c.get(Calendar.YEAR);
        arr[GlobalConstants.MONTH] = c.get(Calendar.MONTH);
        arr[GlobalConstants.DAYOFMONTH] = c.get(Calendar.DAY_OF_MONTH);
        arr[GlobalConstants.HOUR_OF_DAY] = c.get(Calendar.HOUR_OF_DAY);
        arr[GlobalConstants.MINUTE] = c.get(Calendar.MINUTE);

        return arr;
    }

    // class cannot get instanciated
    private Utilities() {}

}
