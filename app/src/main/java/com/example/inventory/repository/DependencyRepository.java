package com.example.inventory.repository;

import com.example.inventory.pojo.Dependency;

import java.util.ArrayList;

public class DependencyRepository {
    /*
    Creando un objeto SingleTon
     */

    private ArrayList<Dependency> dependencies;
    private static DependencyRepository dependencyRepository;

    //Inicialización estática o de clase: se inicializa el objeto de la misma clase de forma estatica
    static {
        dependencyRepository = new DependencyRepository();
    }

    //No se pueden crear objetos de la clase fuera de ella, gracias al constructor privado.
    private DependencyRepository() {
        this.dependencies = new ArrayList<>();
        initialice();
    }

    private void initialice() {
        //llenar el array
        add(new Dependency(1, "1º Ciclo Formativo Grado Superior", "1CFGS", "Primer curso del Ciclo Formativo de Grado Superior","img"));
        add(new Dependency(2, "2º Ciclo Formativo Grado Superior", "2CFGS", "Segundo curso del Ciclo Formativo de Grado Superior","img"));
        add(new Dependency(3, "1º Ciclo Formativo Grado Superior", "1CFGS", "Primer curso del Ciclo Formativo de Grado Superior","img"));
        add(new Dependency(4, "2º Ciclo Formativo Grado Superior", "2CFGS", "Segundo curso del Ciclo Formativo de Grado Superior","img"));
        add(new Dependency(5, "1º Ciclo Formativo Grado Superior", "1CFGS", "Primer curso del Ciclo Formativo de Grado Superior","img"));
        add(new Dependency(6, "2º Ciclo Formativo Grado Superior", "2CFGS", "Segundo curso del Ciclo Formativo de Grado Superior","img"));
        add(new Dependency(7, "1º Ciclo Formativo Grado Superior", "1CFGS", "Primer curso del Ciclo Formativo de Grado Superior","img"));
        add(new Dependency(8, "2º Ciclo Formativo Grado Superior", "2CFGS", "Segundo curso del Ciclo Formativo de Grado Superior","img"));
        add(new Dependency(9, "1º Ciclo Formativo Grado Superior", "1CFGS", "Primer curso del Ciclo Formativo de Grado Superior","img"));
        add(new Dependency(10, "2º Ciclo Formativo Grado Superior", "2CFGS", "Segundo curso del Ciclo Formativo de Grado Superior","img"));
        add(new Dependency(11, "1º Ciclo Formativo Grado Superior", "1CFGS", "Primer curso del Ciclo Formativo de Grado Superior","img"));
        add(new Dependency(12, "2º Ciclo Formativo Grado Superior", "2CFGS", "Segundo curso del Ciclo Formativo de Grado Superior","img"));
        add(new Dependency(13, "1º Ciclo Formativo Grado Superior", "1CFGS", "Primer curso del Ciclo Formativo de Grado Superior","img"));
        add(new Dependency(14, "2º Ciclo Formativo Grado Superior", "2CFGS", "Segundo curso del Ciclo Formativo de Grado Superior","img"));
        add(new Dependency(15, "1º Ciclo Formativo Grado Superior", "1CFGS", "Primer curso del Ciclo Formativo de Grado Superior","img"));
        add(new Dependency(16, "2º Ciclo Formativo Grado Superior", "2CFGS", "Segundo curso del Ciclo Formativo de Grado Superior","img"));
        add(new Dependency(17, "1º Ciclo Formativo Grado Superior", "1CFGS", "Primer curso del Ciclo Formativo de Grado Superior","img"));
        add(new Dependency(18, "2º Ciclo Formativo Grado Superior", "2CFGS", "Segundo curso del Ciclo Formativo de Grado Superior","img"));
        add(new Dependency(19, "1º Ciclo Formativo Grado Superior", "1CFGS", "Primer curso del Ciclo Formativo de Grado Superior","img"));
        add(new Dependency(20, "2º Ciclo Formativo Grado Superior", "2CFGS", "Segundo curso del Ciclo Formativo de Grado Superior","img"));
        add(new Dependency(21, "1º Ciclo Formativo Grado Superior", "1CFGS", "Primer curso del Ciclo Formativo de Grado Superior","img"));
        add(new Dependency(22, "2º Ciclo Formativo Grado Superior", "2CFGS", "Segundo curso del Ciclo Formativo de Grado Superior","img"));
        add(new Dependency(23, "1º Ciclo Formativo Grado Superior", "1CFGS", "Primer curso del Ciclo Formativo de Grado Superior","img"));
        add(new Dependency(24, "2º Ciclo Formativo Grado Superior", "2CFGS", "Segundo curso del Ciclo Formativo de Grado Superior","img"));
        add(new Dependency(25, "1º Ciclo Formativo Grado Superior", "1CFGS", "Primer curso del Ciclo Formativo de Grado Superior","img"));
        add(new Dependency(26, "2º Ciclo Formativo Grado Superior", "2CFGS", "Segundo curso del Ciclo Formativo de Grado Superior","img"));
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
