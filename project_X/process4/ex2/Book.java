package project_X.process4.ex2;

class Book {
    /*
     책 정보 : 제목, 저자, ISBN 넘버, 대출 가능 여부를 포함한다. 책의 대출 가능 여부를 변경하는 기능이 있다. 책의 정보를 출력하는 기능이 있다.
    */
    public String isbn;
    public String title;
    public String author;
    public boolean isBorrowed;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public void printBookInfo(){
        System.out.printf("%s, %s\n",getTitle(),isBorrowed?"대출 불가":"대출가능");
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}

