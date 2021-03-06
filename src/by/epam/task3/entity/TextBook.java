package by.epam.task3.entity;

import java.util.HashMap;
import java.util.Map;

public class TextBook implements IGoods {
    public static final String TITLE = "TITLE";
    public static final String SUBJECT = "SUBJECT";
    public static final String AUTHOR = "AUTHOR";
    public static final String NUMBER_OF_PAGES = "NUMBER_OF_PAGES";

    private String title;
    private String subject;
    private String author;
    private int numberOfPages;

    public TextBook() {
    }

    public TextBook(String title, String subject, String author, int numberOfPages) {
        this.title = title;
        this.subject = subject;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Text Book : " +
                "Title=" + title +
                ", Subject=" + subject +
                ", Author=" + author +
                ", Number of pages=" + numberOfPages
                + "\n";
    }

    @Override
    public void setValues(Map<String, Object> value) {
        for (Map.Entry<String, Object> aValue : value.entrySet()) {
            if (TextBook.TITLE.equals(aValue.getKey().toUpperCase())) {
                setTitle(aValue.getValue().toString());
            }
            if (TextBook.SUBJECT.equals(aValue.getKey().toUpperCase())) {
                setSubject(aValue.getValue().toString());
            }
            if (TextBook.AUTHOR.equals(aValue.getKey().toUpperCase())) {
                setAuthor(aValue.getValue().toString());
            }
            if (TextBook.NUMBER_OF_PAGES.equals(aValue.getKey().toUpperCase())) {
                setNumberOfPages(Integer.parseInt(aValue.getValue().toString()));
            }
        }
    }

    @Override
    public Map<String, Object> getValues() {
        Map<String, Object> map = new HashMap<>();
        map.put(TITLE, getTitle());
        map.put(SUBJECT, getSubject());
        map.put(AUTHOR, getAuthor());
        map.put(NUMBER_OF_PAGES, getNumberOfPages());
        return map;
    }

    public boolean isTitleContains(String value) {
        return value.isEmpty() || getTitle() != null && getTitle().equals(value);
    }

    public boolean isSubjectContains(String value) {
        return value.isEmpty() || getSubject() != null && getSubject().equals(value);
    }

    public boolean isAuthorContains(String value) {
        return value.isEmpty() || getAuthor() != null && getAuthor().equals(value);
    }

    public boolean isNumberOfPagesContains(String value) {
        return value.isEmpty() || getNumberOfPages() != 0 && getNumberOfPages() == Integer.valueOf(value);
    }

}