package com.example.inventory.ui;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.inventory.R;
import com.example.inventory.adapter.ProductAdapter;

public class ProductListActivity extends AppCompatActivity {
    RecyclerView rvProducts;
    FloatingActionButton btAddProduct;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);

        rvProducts = findViewById(R.id.rvProducts);
        rvProducts.setAdapter(new ProductAdapter(this));
        rvProducts.setLayoutManager(new LinearLayoutManager(this));

        btAddProduct = findViewById(R.id.btAddProduct);
        btAddProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(ProductListActivity.this, ProductActivity.class);
                startActivity(intent);
            }
        });
    }
}
