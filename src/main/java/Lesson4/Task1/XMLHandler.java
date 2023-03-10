package Lesson4.Task1;

import Lesson4.Task1.AbstractHandler;

public class XMLHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("XML file opened");
    }

    @Override
    void create() {
        System.out.println("XML file created");
    }

    @Override
    void change() {
        System.out.println("XML file changed");
    }

    @Override
    void save() {
        System.out.println("XML file saved");
    }
}
