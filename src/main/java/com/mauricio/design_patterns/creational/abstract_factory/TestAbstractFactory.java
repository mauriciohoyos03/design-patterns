package com.mauricio.design_patterns.creational.abstract_factory;

public class TestAbstractFactory {

    public static void main(String[] args) {
    // La aplicación elige el tipo de fábrica dependiendo de los ajustes del entorno
        GUIFactory guiFactory = new LinuxFactory();
        DialogBox dialogBox = guiFactory.createDialogBox();
        ToolBar toolBar = guiFactory.createToolbar();

        dialogBox.paint();
        toolBar.paint();
    }
}
