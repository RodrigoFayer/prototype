package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DocumentTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        User author = new User("John Doe", "john@doe");
        Document document = new Document(author, "title", "content");

        Document clonedDocument = (Document) document.clone();
        clonedDocument.setTitle("title 1");
        clonedDocument.getAuthor().setName("Jane Doe");

        assertEquals(document.getContent(), clonedDocument.getContent());
        assertNotEquals(document.getTitle(), clonedDocument.getTitle());
        assertNotEquals(document.getAuthor().getName(), clonedDocument.getAuthor().getName());
        assertEquals(document.getAuthor().getEmail(), clonedDocument.getAuthor().getEmail());
    }
}
