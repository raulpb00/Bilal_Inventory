package com.example.inventory.repository;

import com.example.inventory.pojo.Section;
import com.example.inventory.pojo.Section;

import java.util.ArrayList;

public class SectionRepository {

    private ArrayList<Section> sections;

    public SectionRepository() {
        this.sections = new ArrayList<>();
        initialice();
    }

    private void initialice() {
        //llenar el array
        add(new Section(1, "Armario nº 1", "Armario 1", "Armario de madera","img"));
        add(new Section(2, "Armario nº 2", "Armario 2", "Armario de metal","img"));
        add(new Section(3, "Estantería nº 1", "Estanteria 1", "Estantería de metal","img"));
        add(new Section(3, "Estantería nº 2", "Estanteria 2", "Estantería de metal","img"));
    }

    /**
     * Método que añade una dependencia al repositorio
     */
    private void add(Section Section) {
        sections.add(Section);
    }
    public ArrayList<Section> getAll(){
        return this.sections;
    }
}
