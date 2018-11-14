package com.example.inventory.pojo;

public class Product {

    public enum ProductType {Inventorial, Consumable}
    public enum Category {Office_Supplies, Hardware, Software, Furniture, Tools, Peripherals}
    public enum Subcategory {Monitor, Case, Motherboard, Mouse, Keyboard, CPU, GPU, ExpansionCard, RAM, Fan, Laptop, Other}

    private String serialNumber;
    private String modelCode;
    private String shortName;
    private String description;
    private ProductType productType;
    private Category category;
    private Subcategory subcategory;
    private int section;
    private String estado;
    private float precio;
    private String vendor;
    private String imagen;
    private String fecha;
    private String url;
    private String notas;

    public Product(String serialNumber, String modelCode, String shortName, ProductType productType, Category category, Subcategory subcategory, String vendor) {
        this.serialNumber = serialNumber;
        this.modelCode = modelCode;
        this.shortName = shortName;
        this.productType = productType;
        this.category = category;
        this.subcategory = subcategory;
        this.vendor = vendor;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Subcategory getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(Subcategory subcategory) {
        this.subcategory = subcategory;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
}
