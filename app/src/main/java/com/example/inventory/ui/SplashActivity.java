package com.example.inventory.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.inventory.R;

/**
 * <p>Clase que muestra el logo del proyecto y que se conectará al repositorio de los datos.</p>
 */
public class SplashActivity extends AppCompatActivity {
    private static final long WAIT_TIME = 2000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


    }

    @Override
    protected void onStart() {
        super.onStart();

        final Handler uiHandler = new Handler();


        /**
         * Este objeto se ejecuta en el hilo de la UI.
         */
        final Runnable onUI = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                SplashActivity.this.startActivity(intent);
                SplashActivity.this.finish();
            }
        };

        uiHandler.postDelayed(onUI, WAIT_TIME);
        Toast.makeText(this, "Cargando...", Toast.LENGTH_SHORT).show();

        /**
         * Este objeto se ejecuta en un hilo diferente al de la UI.
         * Envía un mensaje a un manejador (Handler)
         */
//        Runnable background = new Runnable() {
//
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(WAIT_TIME);
//                    uiHandler.post(onUI);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        };
//        new Thread(background).start();


    }
}
