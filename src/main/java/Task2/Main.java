package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter title");
        String title = scan.next();
        Tilte tilte1 = new Tilte(title);
        System.out.println("Enter author");
        String author = scan.next();
        Author author1 = new Author(author);
        System.out.println("Enter content");
        String content = scan.next();
        Content content1 = new Content(content);
        tilte1.show();
        author1.show();
        content1.show();
    }
}
