package 종합.콘솔기반도서관리시스템.model.dto;

public class BookDto {
    private int id;
    private String title;
    private String author;
    private boolean isRented;

    public BookDto(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isRented = isRented;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isRented=" + isRented +
                '}';
    }
}
