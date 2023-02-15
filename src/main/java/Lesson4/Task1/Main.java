package Lesson4.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AbstractHandler handler;
        System.out.println("Enter document type:");
        String document = scan.next();
        String type =  document.substring(document.lastIndexOf(".")+1);
        switch (type){
            case "xml": handler = new XMLHandler();
                break;
            case "txt": handler = new TXTHandler();
                break;
            case "doc": handler = new DOCHAndler();
                break;
            default:
                System.out.println("Error! Document of this format cannot be continued.");
                return;
        }
        handler.open();
        handler.create();
        handler.change();
        handler.save();
    }
}
