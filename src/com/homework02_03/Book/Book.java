package com.homework02_03.Book;

public class Book {
    private String title;
    private String authorName;
    private int year;
    private String publisher;
    private String genre;
    private int pageCount;


    public Book() {}

    public Book(String title, String authorName){
        this(title, authorName,0);
    }

    public Book(String title, String authorName, int year){
        this(title, authorName,year,"","",0);
    }

    public Book(String title, String authorName, int year, String publisher, String genre, int pageCount) {
        this.title = title;
        this.authorName = authorName;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
        this.pageCount = pageCount;
    }

    public void ShowBook() {
        System.out.println("Назва книги: " + getTitle());
        System.out.println("Автор: " + getAuthorName());
        System.out.println("Рік: " + getYear());
        System.out.println("Назва видавництва: " + getPublisher());
        System.out.println("Жанр книги: " + getGenre());
        System.out.println("Кількість сторінок: " + getPageCount());
    }

    // Getter&Setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
