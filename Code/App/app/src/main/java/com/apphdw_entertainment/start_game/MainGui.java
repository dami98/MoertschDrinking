package com.apphdw_entertainment.start_game;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import com.apphdw_entertainment.ten_manager.R;

import java.util.ArrayList;

class MainGui {

    private EditText addPlayerName;
    private ImageButton addButton;
    public ListView nameOfPlayers;

    private ArrayAdapter<String> adapter;

    ArrayList<String> listPlayers = new ArrayList<>();

    private Button moertschButton;


    public MainGui(MainActivity activity) {
    addPlayerName = activity.findViewById(R.id.playerName);
    addButton = activity.findViewById(R.id.addPlayerButton);
    nameOfPlayers = activity.findViewById(R.id.listOfPlayers);

    adapter = new ArrayAdapter<String>(activity,android.R.layout.simple_list_item_1,listPlayers);

    nameOfPlayers.setAdapter(adapter);

    moertschButton = activity.findViewById(R.id.moertschen);


    }

    //getter
    EditText getAddPlayerName()
    {return addPlayerName;}

    ImageButton getAddButton()
    {
        return addButton;
    }

    ListView getListOfPlayers()
    {
        return nameOfPlayers;
    }

    //setter
    void setPlayerName(String name)
    {
        addPlayerName.setText(name);
    }

    void addPlayerToList(String name)
    {
        nameOfPlayers.setAdapter(adapter);
        listPlayers.add(name);
    }

    ArrayList<String> getListPlayers()
    {
        return listPlayers;
    }


    public String getPlayerName() {
        return addPlayerName.getText().toString();
    }

    public Button getMoertschenButton() {
        return moertschButton;
    }

    public void setButtonVisibility(boolean bool) {
        if (bool) {
            moertschButton.setVisibility(View.VISIBLE);
        }
    }
}
