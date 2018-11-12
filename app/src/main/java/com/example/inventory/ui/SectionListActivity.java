package com.example.inventory.ui;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.inventory.R;
import com.example.inventory.adapter.SectionAdapter;
import com.example.inventory.pojo.Section;

public class SectionListActivity extends AppCompatActivity {

    private RecyclerView rvSections;
    FloatingActionButton btAdd;
    Intent intent;
    SectionAdapter sectionAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_list);

        rvSections = findViewById(R.id.rvSections);
        sectionAdapter = new SectionAdapter(this);
        sectionAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Section: " + (sectionAdapter.getItem(rvSections.getChildAdapterPosition(view))).getShortName(), Snackbar.LENGTH_SHORT).show();
            }
        });
        rvSections.setAdapter(sectionAdapter);
        //Añadir un layout al recyclerview
        rvSections.setLayoutManager(new LinearLayoutManager(this));

        btAdd = findViewById(R.id.btAdd);
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(SectionListActivity.this, SectorEditActivity.class);
                startActivity(intent);
            }
        });
    }
}
