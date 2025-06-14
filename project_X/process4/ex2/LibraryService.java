package project_X.process4.ex2;

public interface LibraryService {
    Book addBook(String title, String author);
    void removeBook(Book book);
}
