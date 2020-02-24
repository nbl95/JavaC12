package com.mypack;

public class TestBook {
    public static void main(String[] args) {
        ProgrammingBook book1 = new ProgrammingBook(1,"abc1", 50000,"linh1","java","GWT");
        ProgrammingBook book2 = new ProgrammingBook(2,"abc2", 60000,"linh2","java","GWT");
        ProgrammingBook book3 = new ProgrammingBook(3,"abc3", 70000,"linh3","java","GWT");

        FictionBook book4 = new FictionBook(4,"abc4",80000,"linh4","sience");
        FictionBook book5 = new FictionBook(5,"abc5",90000,"linh5","sience");
        FictionBook book6 = new FictionBook(6,"abc6",100000,"linh6","sience");

        Book[] library = {book1,book2,book3, book4,book5,book6};
        double cost = 0;
        for (Book book : library){
            cost = cost + book.getPrice();

        }
        System.out.println("price: " + cost);
        System.out.println("Total: " + Book.getTotalBook());


    }
}
