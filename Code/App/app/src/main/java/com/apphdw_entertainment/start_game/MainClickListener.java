package com.apphdw_entertainment.start_game;

import android.view.View;

import com.apphdw_entertainment.ten_manager.R;

class MainClickListener  implements View.OnClickListener {

    MainApplicationLogic appLogic;


    public MainClickListener(MainApplicationLogic logic, MainActivity activity) {
        appLogic = logic;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.addPlayerButton:
                appLogic.addNameToList();
                break;
            case R.id.moertschen:
                appLogic.startTheGame();
                break;
        }
    }
}