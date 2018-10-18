package com.example.inventory;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.regex.Pattern;

public class SectorEditActivity extends AppCompatActivity {

    public static final int SHORTNAME_MAXLENGTH = 10;
    FloatingActionButton btGuardar;

    TextInputLayout tilLongName, tilShortName, tilDescription;
    TextInputEditText tiedLongName, tiedShortName, tiedDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sector_edit);

        initialize();

        btGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validate()){
                    finish();
                }else {
                    //TODO Mostrar error
                }
            }
        });
    }

    private void initialize() {
        tilLongName = findViewById(R.id.tilLongName);
        tilShortName = findViewById(R.id.tilShortName);
        tilDescription = findViewById(R.id.tilDescription);
        tiedLongName = findViewById(R.id.tiedLongName);
        tiedShortName = findViewById(R.id.tiedShortName);
        tiedDescription = findViewById(R.id.tiedDescription);

        btGuardar = findViewById(R.id.btGuardar);
    }

    /**
     * REGLAS DE NEGOCIO
     * Se debe comprobar que el usuario introduce los datos correctamente y
     * cumple las siguientes reglas de negocio:
     * -Nombre, nombre corto y descripción no pueden estar vacios.
     * -Nombre corto solo puede tener carácteres alfabéticos.
     * -Nombre corto debe contener de 1 a 10 carácteres.
     */

    private boolean validate() {
        return validateName() && validateShortName() && validateDescription();
    }

    /**
     * Comprueba que el nombre cumple las reglas de negocio.
     * @return
     */
    private boolean validateName() {
        boolean result = true;
        if (tiedLongName.getText().toString().trim().isEmpty()){
            tiedLongName.setError(getString(R.string.err_msg_name_empty));
            result = false;
        }
        return result;
    }

    private boolean validateShortName() {

        boolean result = false;
        if (tiedShortName.getText().toString().trim().isEmpty()){
            tiedShortName.setError(getString(R.string.err_msg_short_name_empty));
        } else if (tiedShortName.getText().toString().trim().length() > SHORTNAME_MAXLENGTH){
            tiedShortName.setError(getString(R.string.err_msg_short_name_too_long));
        } else if (!Pattern.matches("^[a-zA-ZñÑ]+$", tiedShortName.getText().toString().trim())){
            tiedShortName.setError(getString(R.string.err_msg_short_name_invalid_format));
        } else {
            result = true;
        }
        return result;
    }

    private boolean validateDescription() {
        boolean result = true;
        if (tiedDescription.getText().toString().trim().isEmpty()){
            tiedDescription.setError(getString(R.string.err_msg_description_empty));
            result = false;
        }
        return result;
    }


}
