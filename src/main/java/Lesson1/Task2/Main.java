package Lesson1.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Book book = new Book();
        System.out.println("Enter Title");
        book.title = new Title(scan.next());
        System.out.println("Enter Author");
        book.author = new Author(scan.next());
        System.out.println("Enter Content");
        book.content = new Content(scan.next());
        book.print();
    }
}
