package Lesson3.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DocumentWorker worker;
        System.out.println("Enter key(NoKey,ProKey,ExpertKey)");
        String key = scan.next();
        switch (key){
            case "ProKey":
                worker = new ProDocumentWorker();
                break;
            case "ExpertKey":
                worker = new ExpertDocumentWorker();
                break;
            default:
                worker = new DocumentWorker();
        }
        worker.openDocument();
        worker.editDocument();
        worker.saveDocument();
    }
}
