package com.mauricio.design_patterns.creational.abstract_factory;

public class LinuxDialogBox implements DialogBox{

    // Representa una diálogo en estilo Linux
    @Override
    public void paint() {
        System.out.println("Dialogbox to Linux GUI");
    }
}
