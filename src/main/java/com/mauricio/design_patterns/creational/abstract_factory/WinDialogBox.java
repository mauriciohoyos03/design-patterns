package com.mauricio.design_patterns.creational.abstract_factory;

public class WinDialogBox implements DialogBox{

    // Representa una diálogo en estilo Windows.
    @Override
    public void paint() {
        System.out.println("DialogBox to Windows GUI");
    }
}
