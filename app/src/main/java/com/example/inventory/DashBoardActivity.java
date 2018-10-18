package com.example.inventory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashBoardActivity extends AppCompatActivity {

    Button btDependencies;
    Button btSectors;

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
    }

    public class MyListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btDependencies:
                    intent = new Intent(DashBoardActivity.this, DependencyEditActivity.class);
                    break;
                case R.id.btSectors:
                    intent = new Intent(DashBoardActivity.this, SectorEditActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
