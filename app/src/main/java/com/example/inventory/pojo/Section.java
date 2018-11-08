package com.example.inventory.pojo;

public class Section {
    private int id;
    private int dependency;
    private String name;
    private String shortName;
    private String descripcion;
    private String image;

    public Section(int id, String name, String shortName, String descripcion, String image) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.descripcion = descripcion;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public int getDependency() {
        return dependency;
    }


    public String getName() {
        return name;
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

    public void setDependency(int dependency) {
        this.dependency = dependency;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return shortName;
    }
}
