package com.example.inventory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * <p>Clase que muestra el logo del proyecto y que se conectará al repositorio de los datos.</p>
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }
}
