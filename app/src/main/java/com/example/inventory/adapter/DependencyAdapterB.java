package com.example.inventory.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.inventory.R;
import com.example.inventory.pojo.Dependency;
import com.example.inventory.repository.DependencyRepository;
import com.github.ivbaranov.mli.MaterialLetterIcon;

public class DependencyAdapterB extends ArrayAdapter {
    public DependencyAdapterB(@NonNull Context context) {
        super(context, R.layout.dependency_item, DependencyRepository.getDependencyRepository().getAll());
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        MaterialLetterIcon icon;
        TextView tvShortName;
        TextView tvDescription;
        Dependency dependency;

        if (view == null) {
            //1. Obtener el servicio del sistema LayoutInflater para poder despues inflar (crear) la vista
            LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            //2. Inflar/Crear la vista. Crea en memoria un objeto View que contienes los widget
            // que se han creado en el XML.
            view = layoutInflater.inflate(R.layout.dependency_item, null);
        }
        //3. Inicializar las variables con los objetos widget de View que están en memoria. ¡¡ CUIDADO!!: view.findViewById();
        icon = view.findViewById(R.id.mlIcon);
        tvShortName = view.findViewById(R.id.tvShortName);
        tvDescription = view.findViewById(R.id.tvDescription);

        //4. Mostrar los datos del ArrayList en los widget.
        dependency = (Dependency) getItem(position);
        icon.setLetter(dependency.getShortName().substring(0,1));
        tvShortName.setText(dependency.getShortName());
        tvDescription.setText(dependency.getDescripcion());

//        5. Devolvemos la View que hemos construido.
        return view;
    }
}
