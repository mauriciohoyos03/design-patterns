package com.mauricio.design_patterns.creational.abstract_factory;

/* Las fábricas concretas producen una familia de productos que
 pertenecen a una única variante. La fábrica garantiza que los
 productos resultantes sean compatibles. Las firmas de los
 métodos de las fábricas concretas devuelven un producto
 abstracto mientras que dentro del método se instancia un
 producto concreto.
*/
public class LinuxFactory implements GUIFactory{
    @Override
    public ToolBar createToolbar() {
        return new LinuxToolBar();
    }

    @Override
    public DialogBox createDialogBox() {
        return new LinuxDialogBox();
    }
}
