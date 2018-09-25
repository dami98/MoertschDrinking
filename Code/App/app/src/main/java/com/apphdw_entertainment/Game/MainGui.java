/* Autor: Colin Schneider */

package com.apphdw_entertainment.Game;

import android.widget.TextView;

import com.apphdw_entertainment.ten_manager.R;


public class MainGui {

    private TextView taskToDo;

    MainGui(MainGame initMain)
    {
        taskToDo = initMain.findViewById(R.id.taskToDo);
    }

    //setter
    public void setTaskToDo(String task)
    {
        this.taskToDo.setText(task);
    }


    //getter
    public TextView getTaskToDo()
    {
        return this.taskToDo;
    }

}
