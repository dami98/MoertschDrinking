package com.apphdw_entertainment.start_game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.apphdw_entertainment.Game.MainGame;
import com.apphdw_entertainment.GlobalConstants;
import com.apphdw_entertainment.Utilities;

class MainApplicationLogic extends AppCompatActivity {
    private MainGui gui;
    private MainActivity activity;

    public MainApplicationLogic(MainGui gui, MainActivity activity) {
        this.gui = gui;
        this.activity = activity;
    }


    public void addNameToList() {
        if (gui.getListPlayers().size() <= 5) {
            if (gui.getPlayerName().length() != 0) {
                gui.setButtonVisibility(true);
                gui.addPlayerToList(gui.getPlayerName());
                gui.setPlayerName("");
            }
        }else{
            gui.setPlayerName("Maximale Anzahl");
        }

    }

    public void startTheGame() {
        if (gui.getListPlayers().size()>0){
        long key = 2;
        Utilities.startActivity(activity,GlobalConstants.ACTIVITYGAME,key,gui.getListPlayers());
        }
    }
}
