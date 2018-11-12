package com.example.inventory.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.inventory.InventoryApplication;
import com.example.inventory.R;
import com.example.inventory.pojo.Section;

import java.util.ArrayList;

public class SectionAdapter extends RecyclerView.Adapter<SectionAdapter.SectionViewHolder> implements View.OnClickListener {

    private ArrayList<Section> sections;
    private Context context;
    private View.OnClickListener listener;

    public SectionAdapter(Context context) {
        this.context = context;
        this.sections = ((InventoryApplication) context.getApplicationContext()).getSectionRepository().getAll();
    }

    @NonNull
    @Override
    public SectionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.section_item, parent, false);
        SectionViewHolder sectionViewHolder = new SectionViewHolder(view);
        view.setOnClickListener(this);//Asignamos el propio objeto SectionAdapter como listener (this)
        return sectionViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SectionViewHolder holder, int position) {
        holder.tvShorName.setText(sections.get(position).getShortName());
        holder.tvDescription.setText(sections.get(position).getDescripcion());
    }

    @Override
    public int getItemCount() {
        return sections.size();
    }

    public Section getItem(int position){
        return sections.get(position);
    }

    //TODO comentar
    @Override
    public void onClick(View view) {
        listener.onClick(view);//Lanzamos el evento para que se trate fuera.
    }

    /**
     * Método que vincula el listener del Adapter con la clase que implente la interfaz
     * View.OnClickListener
     */
    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;
    }

    public class SectionViewHolder extends RecyclerView.ViewHolder {

        TextView tvShorName;
        TextView tvDescription;

        public SectionViewHolder(View itemView) {
            super(itemView);
            tvShorName = itemView.findViewById(R.id.tvShortName);
            tvDescription = itemView.findViewById(R.id.tvDescription);
        }
    }
}
