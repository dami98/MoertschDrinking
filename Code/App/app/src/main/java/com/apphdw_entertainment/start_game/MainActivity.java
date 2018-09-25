package com.apphdw_entertainment.start_game;

import android.app.Activity;
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

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Activity activity = this;
    static AppDatabase db;
    private MainGui mainGui;
    private MainApplicationLogic mainApplicationLogic;
    public int site;
    public static int View_ID = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.initial_activity);

        // Initialize db
        //db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "prod").allowMainThreadQueries().build();

        // Initialization and Visulization
        initMainGui();
        initMainApplicationLogic();
        initListeners();
    }

    private void initListeners() {
        MainClickListener mainclickListener = new MainClickListener(mainApplicationLogic, this);
        mainGui.getAddButton().setOnClickListener(mainclickListener);
        mainGui.getMoertschenButton().setOnClickListener(mainclickListener);
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
            super.onBackPressed();
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
}