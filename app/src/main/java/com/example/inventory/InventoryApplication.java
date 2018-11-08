package com.example.inventory;

import android.app.Application;

import com.example.inventory.repository.SectionRepository;

public class InventoryApplication extends Application {

    /**
     * Fuentes de datos en el objeto Application porque está
     * disponible para cualquier objeto que acceda al contexto
     */
    private SectionRepository sectionRepository;

    @Override
    public void onCreate() {
        super.onCreate();
        sectionRepository = new SectionRepository();
    }

    public SectionRepository getSectionRepository() {
        return sectionRepository;
    }

}
