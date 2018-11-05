package com.example.inventory.pojo;

public class Dependency {
    private int id;
    private String longName;
    private String shortName;
    private String descripcion;
    private String image;

    public Dependency(int id, String longName, String shortName, String descripcion, String image) {
        this.id = id;
        this.longName = longName;
        this.shortName = shortName;
        this.descripcion = descripcion;
        this.image = image;
    }

    public Dependency(String longName, String shortName, String descripcion, String image) {
        this.longName = longName;
        this.shortName = shortName;
        this.descripcion = descripcion;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getLongName() {
        return longName;
    }

    public String getShortName() {
        return shortName;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImage() {
        return image;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
