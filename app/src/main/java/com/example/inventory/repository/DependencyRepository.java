package com.example.inventory.repository;

import com.example.inventory.pojo.Dependency;

import java.util.ArrayList;

public class DependencyRepository {
    private ArrayList<Dependency> dependencies;

    private static DependencyRepository dependencyRepository;

    //Inicialización estática o de clase:
    static {
        dependencyRepository = new DependencyRepository();
    }


    public DependencyRepository() {
        this.dependencies = new ArrayList<>();
        initialice();
    }

    private void initialice() {
        addDependency();
    }

    /**
     * Método que añade una dependencia al repositorio
     */
    private void addDependency(Dependency dependency) {

    }

    public static DependencyRepository getDependencyRepository() {
        return dependencyRepository;
    }

    public ArrayList<Dependency> getAll(){
        return this.dependencies;
    }
}
