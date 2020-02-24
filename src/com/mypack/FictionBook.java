package com.mypack;

public class FictionBook extends Book {
    protected String category;


    public FictionBook(String category){
        this.category = category;

    }

    public FictionBook(int bookCode , String name , int price, String author, String category){
        super(bookCode, name, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "FictionBook{" +
                "category='" + category + '\'' +
                '}';
    }
}
