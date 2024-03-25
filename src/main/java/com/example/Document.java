package com.example;

public class Document implements Cloneable {
    private User author;
    private String title;
    private String content;

    public Document(User author, String title, String content) {
        this.author = author;
        this.title = title;
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Document document = (Document) super.clone();
        document.author = (User) author.clone();
        return document;
    }
}
