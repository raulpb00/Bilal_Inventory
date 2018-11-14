package com.example.inventory.repository;

import com.example.inventory.pojo.Product;

import java.util.ArrayList;

public class ProductRepository {
    private ArrayList<Product> products;
    //Estático para que sea de clase.
    private static ProductRepository productRepository;

    //Inicializazión estática
    static {
        productRepository = new ProductRepository();
    }

    /*
    Constructor privado para que solo pueda existir el objeto inicializado de forma estatica en
    esta misma clase (Objeto Singleton)
     */
    private ProductRepository() {
        products = new ArrayList<>();
        initialice();
    }

    /*
    Método público y estático que devuelve el repositorio
     */
    public static ProductRepository getProductRepository() {
        return productRepository;
    }


    /*
    Llenamos los datos en el array.
     */
    private void initialice() {
        add(new Product("SG S7", "Galaxy S7", "Samsung Galaxy S7", Product.ProductType.Inventorial, Product.Category.Hardware, Product.Subcategory.Other, "Samsung"));
        add(new Product("SG S8", "Galaxy S8", "Samsung Galaxy S8", Product.ProductType.Inventorial, Product.Category.Hardware, Product.Subcategory.Other, "Samsung"));
        add(new Product("SG S9", "Galaxy S9", "Samsung Galaxy S9", Product.ProductType.Inventorial, Product.Category.Hardware, Product.Subcategory.Other, "Samsung"));
        add(new Product("SG N7", "Galaxy Note 7", "Samsung Note 7", Product.ProductType.Inventorial, Product.Category.Hardware, Product.Subcategory.Other, "Samsung"));
        add(new Product("SG N8", "Galaxy Note 8", "Samsung Note 8", Product.ProductType.Inventorial, Product.Category.Hardware, Product.Subcategory.Other, "Samsung"));
        add(new Product("SG N9", "Galaxy Note 9", "Samsung Note 9", Product.ProductType.Inventorial, Product.Category.Hardware, Product.Subcategory.Other, "Samsung"));
        add(new Product("SG S7", "Galaxy S7", "Samsung Galaxy S7", Product.ProductType.Inventorial, Product.Category.Hardware, Product.Subcategory.Other, "Samsung"));
        add(new Product("SG S8", "Galaxy S8", "Samsung Galaxy S8", Product.ProductType.Inventorial, Product.Category.Hardware, Product.Subcategory.Other, "Samsung"));
        add(new Product("SG S9", "Galaxy S9", "Samsung Galaxy S9", Product.ProductType.Inventorial, Product.Category.Hardware, Product.Subcategory.Other, "Samsung"));
        add(new Product("SG N7", "Galaxy Note 7", "Samsung Note 7", Product.ProductType.Inventorial, Product.Category.Hardware, Product.Subcategory.Other, "Samsung"));
        add(new Product("SG N8", "Galaxy Note 8", "Samsung Note 8", Product.ProductType.Inventorial, Product.Category.Hardware, Product.Subcategory.Other, "Samsung"));
        add(new Product("SG N9", "Galaxy Note 9", "Samsung Note 9", Product.ProductType.Inventorial, Product.Category.Hardware, Product.Subcategory.Other, "Samsung"));
        add(new Product("SG S7", "Galaxy S7", "Samsung Galaxy S7", Product.ProductType.Inventorial, Product.Category.Hardware, Product.Subcategory.Other, "Samsung"));
        add(new Product("SG S8", "Galaxy S8", "Samsung Galaxy S8", Product.ProductType.Inventorial, Product.Category.Hardware, Product.Subcategory.Other, "Samsung"));
        add(new Product("SG S9", "Galaxy S9", "Samsung Galaxy S9", Product.ProductType.Inventorial, Product.Category.Hardware, Product.Subcategory.Other, "Samsung"));
        add(new Product("SG N7", "Galaxy Note 7", "Samsung Note 7", Product.ProductType.Inventorial, Product.Category.Hardware, Product.Subcategory.Other, "Samsung"));
        add(new Product("SG N8", "Galaxy Note 8", "Samsung Note 8", Product.ProductType.Inventorial, Product.Category.Hardware, Product.Subcategory.Other, "Samsung"));
        add(new Product("SG N9", "Galaxy Note 9", "Samsung Note 9", Product.ProductType.Inventorial, Product.Category.Hardware, Product.Subcategory.Other, "Samsung"));
        add(new Product("SG S7", "Galaxy S7", "Samsung Galaxy S7", Product.ProductType.Inventorial, Product.Category.Hardware, Product.Subcategory.Other, "Samsung"));
        add(new Product("SG S8", "Galaxy S8", "Samsung Galaxy S8", Product.ProductType.Inventorial, Product.Category.Hardware, Product.Subcategory.Other, "Samsung"));
        add(new Product("SG S9", "Galaxy S9", "Samsung Galaxy S9", Product.ProductType.Inventorial, Product.Category.Hardware, Product.Subcategory.Other, "Samsung"));
        add(new Product("SG N7", "Galaxy Note 7", "Samsung Note 7", Product.ProductType.Inventorial, Product.Category.Hardware, Product.Subcategory.Other, "Samsung"));
        add(new Product("SG N8", "Galaxy Note 8", "Samsung Note 8", Product.ProductType.Inventorial, Product.Category.Hardware, Product.Subcategory.Other, "Samsung"));
        add(new Product("SG N9", "Galaxy Note 9", "Samsung Note 9", Product.ProductType.Inventorial, Product.Category.Hardware, Product.Subcategory.Other, "Samsung"));
    }

    /*
    Añade un proucto al repositorio
     */
    private void add(Product product){
        products.add(product);
    }

    /*
    Método que devuelve la lista de productos que contiene el repositorio.
     */
    public ArrayList<Product> getProducts() {
        return products;
    }
}
