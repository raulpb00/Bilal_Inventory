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
        //llenar el array
        add(new Dependency(1, "1º Ciclo Formativo Grado Superior", "1CFGS", "Primer curso del Ciclo Formativo de Grado Superior","img"));
        add(new Dependency(1, "2º Ciclo Formativo Grado Superior", "2CFGS", "Segundo curso del Ciclo Formativo de Grado Superior","img"));

    }

    /**
     * Método que añade una dependencia al repositorio
     */
    private void add(Dependency dependency) {
        dependencies.add(dependency);
    }

    public static DependencyRepository getDependencyRepository() {
        return dependencyRepository;
    }

    public ArrayList<Dependency> getAll(){
        return this.dependencies;
    }
}
