package com.example.inventory.ui;

import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.example.inventory.R;

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
                if (validate()) {
                    finish();
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
        /**Inicialización del Listener**/
//        textWatcher = new EditTextWatcher();

        /**Asignación dl Listener a los componentes**/
        tiedLongName.addTextChangedListener(new EditTextWatcher(tiedLongName));
        tiedShortName.addTextChangedListener(new EditTextWatcher(tiedShortName));
        tiedDescription.addTextChangedListener(new EditTextWatcher(tiedDescription));
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
        return validateDescription() & validateShortName() & validateName();
    }

    /**
     * Comprueba que el nombre cumple las reglas de negocio.
     *
     * @return
     */
    private boolean validateName() {
        if (isEmpty(tiedLongName)) {
            tilLongName.setError(getString(R.string.err_msg_name_empty));/*Se puede poner tambien al EditText
            *y aparece el icono a la derecha. Lo ideal es aplicarlo al TextInputLayout
            */
            requestFocus(tiedLongName);
            return false;
        }
        tilLongName.setErrorEnabled(false);
        return true;
    }

    private boolean validateShortName() {

        if (isEmpty(tiedShortName) || isShortNameTooLong() || isFormatInvalid()) {
            requestFocus(tiedShortName);
            return false;
        }
        tilShortName.setErrorEnabled(false);
        return true;
    }

    private boolean isFormatInvalid() {
        if (!Pattern.matches("^[a-zA-ZñÑ]+$", tiedShortName.getText().toString().trim())) {
            tilShortName.setError(getString(R.string.err_msg_short_name_invalid_format));
            return true;
        }
        return false;

    }

    private boolean isShortNameTooLong() {
        if (tiedShortName.getText().toString().trim().length() > SHORTNAME_MAXLENGTH) {
            tilShortName.setError(getString(R.string.err_msg_short_name_too_long));
            return true;
        }
        return false;
    }

    private boolean isEmpty(TextInputEditText tiedShortName) {
        if (tiedShortName.getText().toString().trim().isEmpty()) {
            tilShortName.setError(getString(R.string.err_msg_short_name_empty));
            return true;
        }
        return false;
    }

    private boolean validateDescription() {
        if (isEmpty(tiedDescription)) {
            tilDescription.setError(getString(R.string.err_msg_description_empty));
            requestFocus(tiedDescription);
            return false;
        }
        tilDescription.setErrorEnabled(false);
        return true;
    }

    /**
     * Este método coloca el foco en el componente View que se pasa por parámetro y abre el método
     * de entrada por defecto.
     *
     * @param view
     */
    private void requestFocus(View view) {
        if (view.requestFocus()) {
//            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
            ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE)).showSoftInput(view, InputMethodManager.SHOW_IMPLICIT);
        }
    }

    /**
     * Esta clase comprueba el texto que se introduce y nos avisa de los errores
     */
    private class EditTextWatcher implements TextWatcher {

        private View view;

        private EditTextWatcher(View view){
            this.view = view;
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            switch (view.getId()) {
                case R.id.tiedLongName:
                validateName();
                    break;
                case R.id.tiedShortName:
                    validateShortName();
                    break;
                case R.id.tiedDescription:
                    validateDescription();
                    break;
            }
        }
    }


}
