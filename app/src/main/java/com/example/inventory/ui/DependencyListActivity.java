package com.example.inventory.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.inventory.R;
import com.example.inventory.adapter.DependencyAdapter;

public class DependencyListActivity extends AppCompatActivity {

    private ListView lvDependencies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dependency_list);

        lvDependencies = findViewById(R.id.lvDependencies);

        //Ejemplo A: Utilizamos el xml R.layout.simple_list_item_1
//        ArrayAdapter<Dependency> arrayAdapter = new ArrayAdapter<Dependency>(this, android.R.layout.simple_list_item_1, DependencyRepository.getSectionRepository().getAll());
//        lvDependencies.setAdapter(arrayAdapter);


        //Ejemplo B: Utilizamos un xml personalizado para el adapter dependency_item.xml
        DependencyAdapter dependencyAdapter = new DependencyAdapter(this);
        lvDependencies.setAdapter(dependencyAdapter);
        lvDependencies.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Snackbar.make(view, adapterView.getAdapter().getItem(position).toString(), Snackbar.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * Método que crea el menú al inflar el XML.
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.dependency_list_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /**
     * Método que se ejecuta cuando se selecciona un elemento del menú
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.action_dependency_edit:
                intent = new Intent(DependencyListActivity.this, DependencyEditActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
