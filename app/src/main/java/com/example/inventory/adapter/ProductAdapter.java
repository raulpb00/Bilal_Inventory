package com.example.inventory.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.inventory.R;
import com.example.inventory.pojo.Product;
import com.example.inventory.repository.ProductRepository;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private ArrayList<Product> products; //listado de productos
    private Context context; //contesto de la aplicacion recibido en el constructor

    /*
    Constructor que recibe el contexto de la app necesario para inflar el layout
     */
    public ProductAdapter(Context context) {
        this.context = context;
        products = ProductRepository.getProductRepository().getProducts();//se obtiene la lista de productos del repositorio
    }

    /*
    Método que infla el layout y devuelve la vista.
     */
    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProductViewHolder(((LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.product_item, parent, false));
    }

    /*
    Método que vincula los datos con las vistas
     */
    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.tvShortName.setText(products.get(position).getShortName());
        holder.tvSerialNumber.setText(products.get(position).getSerialNumber());
        holder.tvVendor.setText(products.get(position).getVendor());
        holder.tvModelCode.setText(products.get(position).getModelCode());
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    /*
    Objeto que contiene las vistas
     */
    public class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView tvShortName;
        TextView tvSerialNumber;
        TextView tvVendor;
        TextView tvModelCode;

        public ProductViewHolder(View itemView) {
            super(itemView);
            tvShortName = itemView.findViewById(R.id.tvShortName);
            tvSerialNumber = itemView.findViewById(R.id.tvSerialNumber);
            tvVendor = itemView.findViewById(R.id.tvVendor);
            tvModelCode = itemView.findViewById(R.id.tvModelCode);
        }
    }
}
