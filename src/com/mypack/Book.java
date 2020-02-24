package com.mypack;

public class Book {
    protected int bookCode;
    protected String name;
    protected int price;
    protected String author;
    public static int totalBook = 0;
    public static int getTotalBook(){
        return totalBook;
    }


    public Book (){
        totalBook++;

    }

    public Book (int bookCode, String name , int price, String author){
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
        totalBook++;
    }

    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookCode=" + bookCode +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
