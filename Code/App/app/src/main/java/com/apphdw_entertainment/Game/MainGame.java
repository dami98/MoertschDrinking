/* Autor: Colin Schneider */

package com.apphdw_entertainment.Game;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.apphdw_entertainment.database.AppDatabase;
import com.apphdw_entertainment.ten_manager.R;

import java.util.ArrayList;


public class MainGame extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    static AppDatabase db;
    private MainGui mainGui;
    private MainApplicationLogic mainApplicationLogic;

    public int site;
    public static ArrayList<String> myList;
    public static int View_ID = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        site = 1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myList = (ArrayList<String>) getIntent().getSerializableExtra("listOfPlayer");

        initMainGui();
        initMainApplicationLogic();
        initListeners();
    }

    private void initListeners() {
        MainClickListener mainclickListener = new MainClickListener(mainApplicationLogic, this);

        mainGui.getTaskToDo().setOnClickListener(mainclickListener);
    }

    public void initMainGui() {
        mainGui = new MainGui(this);
    }


    private void initMainApplicationLogic() {
        mainApplicationLogic = new MainApplicationLogic(mainGui, this);
    }

    public static AppDatabase getDb() {
        return db;
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.nav_home) {
            View_ID = 0;
            site = 1;
            initMainGui();

        } else if (id == R.id.nav_todos) {
            View_ID = 1;
            site = 1;
            initMainGui();

        } else if (id == R.id.nav_events) {
            View_ID = 2;
            site = 1;
            initMainGui();

        } else if (id == R.id.nav_notes) {
            View_ID = 3;
            site = 1;
            initMainGui();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        View_ID = 0;
        initMainGui();
    }

    public static ArrayList<String> getMyList() {
        return myList;
    }
}

