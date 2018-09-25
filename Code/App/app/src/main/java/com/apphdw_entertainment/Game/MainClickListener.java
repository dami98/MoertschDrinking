/* Autor: Colin Schneider */

package com.apphdw_entertainment.Game;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.apphdw_entertainment.ten_manager.R;

public class MainClickListener extends AppCompatActivity implements View.OnClickListener {

    private MainApplicationLogic applicationLogic;
    private MainGame main;

    public MainClickListener(MainApplicationLogic applicationLogic, MainGame main) {
        this.applicationLogic = applicationLogic;
        this.main = main;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            //Entities
            case R.id.taskToDo:
                applicationLogic.loadNewTaskToDo();
                break;

        }
    }
}
