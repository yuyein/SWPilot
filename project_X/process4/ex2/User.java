package project_X.process4.ex2;

import java.util.ArrayList;
import java.util.List;

abstract class User {
    /*
    사용자 정보 : 사용자 아이디, 이름, 대출 책 목록을 포함하며, 사용자는 아래 분류 중 하나에 속한다. 멤버 : 도서관을 이용하는 일반 회원 - 책을 대출/반납할 수 있다.
    매니저 : 도서관의 관리자로 책과 회원을 관리한다. 책을 대출/반납할 수 있다. 새로운 책을 등록하거나 기존 책을 삭제 할 수 있다. */
    public String userId;
    public String name;
    public List<Book> bookList;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
        bookList = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if(!book.isBorrowed) {
            book.isBorrowed = true;
        }
    }

    public void returnBook(Book book) {
        if(book.isBorrowed) {
            book.isBorrowed = false;
        }
    }

    public String getName() {
        return name;
    }

    abstract void addBook(Book book, Library library);
    abstract void removeBook(Book book, Library library);

}


