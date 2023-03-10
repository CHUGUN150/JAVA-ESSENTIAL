package Lesson4.Task1;

public class TXTHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("TXT file opened");
    }

    @Override
    void create() {
        System.out.println("TXT file created");
    }

    @Override
    void change() {
        System.out.println("TXT file changed");
    }

    @Override
    void save() {
        System.out.println("TXT file saved");
    }
}
