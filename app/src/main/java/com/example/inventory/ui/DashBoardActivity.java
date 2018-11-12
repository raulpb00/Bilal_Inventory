package com.example.inventory.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.inventory.R;

public class DashBoardActivity extends AppCompatActivity {

    Button btDependencies;
    Button btSectors;
    Button btSettings;

    Intent intent;
    MyListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        listener = new MyListener();

        btDependencies = findViewById(R.id.btDependencies);
        btDependencies.setOnClickListener(listener);

        btSectors = findViewById(R.id.btSectors);
        btSectors.setOnClickListener(listener);

        btSettings = findViewById(R.id.btSettings);
        btSettings.setOnClickListener(listener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.dashboard_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_account_preferences:
                intent = new Intent(DashBoardActivity.this, AccountPreferencesActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_settings:
                intent = new Intent(DashBoardActivity.this, SettingsActivity.class);
                startActivity(intent);
                return true;
            default:
                    return false;
        }
    }

    public class MyListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btDependencies:
                    intent = new Intent(DashBoardActivity.this, DependencyListActivity.class);
                    break;
                case R.id.btSectors:
                    intent = new Intent(DashBoardActivity.this, SectionListActivity.class);
                    break;
                case R.id.btSettings:
                    intent = new Intent(DashBoardActivity.this, SettingsSelectorActivity.class);
                    break;
                case R.id.btHelp:
                    intent = new Intent(DashBoardActivity.this, AboutActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
