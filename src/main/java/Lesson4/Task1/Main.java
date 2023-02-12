package Lesson4.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AbstractHandler handler;
        System.out.println("Enter document type:");
        String type = scan.next();
        switch (type){
            case "XML": handler = new XMLHandler();
                break;
            case "TXT": handler = new TXTHandler();
                break;
            case "DOC": handler = new DOCHAndler();
                break;
            default: handler = new XMLHandler();
                System.out.println("Default file");
        }
        handler.open();
        handler.create();
        handler.change();
        handler.save();
    }
}
