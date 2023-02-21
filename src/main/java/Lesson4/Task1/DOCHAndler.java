package Lesson4.Task1;

public class DOCHAndler extends  AbstractHandler{

    @Override
    void open() {
        System.out.println("DOC file opened");
    }

    @Override
    void create() {
        System.out.println("DOC file created");
    }

    @Override
    void change() {
        System.out.println("DOC file changed");
    }

    @Override
    void save() {
        System.out.println("DOC file saved");
    }
}
