package com.example.inventory.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.inventory.R;
import com.example.inventory.adapter.DependencyAdapterA;

public class DependencyListActivity extends AppCompatActivity {

    private ListView lvDependencies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dependency_list);

        lvDependencies = findViewById(R.id.lvDependencies);

        //Ejemplo A: Utilizamos el xml R.layout.simple_list_item_1
//        ArrayAdapter<Dependency> arrayAdapter = new ArrayAdapter<Dependency>(this, android.R.layout.simple_list_item_1, DependencyRepository.getDependencyRepository().getAll());
//        lvDependencies.setAdapter(arrayAdapter);


        //Ejempl B: Utilizamos un xml personalizado para el adapter dependency_item.xml
        DependencyAdapterA dependencyAdapterA = new DependencyAdapterA(this);
        lvDependencies.setAdapter(dependencyAdapterA);
    }
}
