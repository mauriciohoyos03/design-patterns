package com.mauricio.design_patterns.creational.abstract_factory;

public class WinToolBar implements ToolBar{

    // Representa un toolbar al estilo Windows
    @Override
    public void paint() {
        System.out.println("Toolbar to Windows GUI");
    }
}
