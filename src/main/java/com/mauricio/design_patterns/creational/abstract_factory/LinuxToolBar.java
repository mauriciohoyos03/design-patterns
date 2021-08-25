package com.mauricio.design_patterns.creational.abstract_factory;

public class LinuxToolBar implements ToolBar{

    // Representa un toolbar al estilo Linux
    @Override
    public void paint() {
        System.out.println("Toolbar to Linux GUI");
    }
}
