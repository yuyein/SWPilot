package project_X.process4.ex2;

class Manager extends User {
    /*
    매니저 : 도서관의 관리자로 책과 회원을 관리한다. 책을 대출/반납할 수 있다. 새로운 책을 등록하거나 기존 책을 삭제 할 수 있다.
     */
    public Manager(String userId, String name) {
        super(userId, name);
        System.out.printf("새로운 관리자 '%s'를 등록합니다.\n",name);

    }
    @Override
    public void borrowBook(Book book) {
        if(!book.isBorrowed) {
            book.isBorrowed = true;
            bookList.add(book);
            System.out.printf("[관리자] '%s' '%s' 대출합니다.\n",getName(),book.getTitle());
        }
        else{
            System.out.printf("'%s'은 대출 중입니다.\n",book.getTitle());
        }

    }

    @Override
    public void returnBook(Book book) {
        if(book.isBorrowed) {
            book.isBorrowed = false;
        }
        bookList.remove(book);
        System.out.printf("[관리자] '%s' '%s' 반납합니다.\n",getName(),book.getTitle());
    }

    @Override
    void addBook(Book book, Library library) {
        library.addBook(book);
        System.out.printf("[관리자] '%s'가 책을 추가합니다: '%s', '%s'\n",getName(),book.getTitle(),book.getAuthor());
    }

    @Override
    void removeBook(Book book, Library library) {
        library.removeBook(book);
        if(!book.isBorrowed){
            System.out.printf("[관리자] '%s'은 대출 중이라 삭제할 수 없습니다\n",book.getTitle());
        }
        else {
            System.out.printf("[관리자] '%s'가 책을 삭제합니다: '%s', '%s'\n", getName(), book.getTitle(), book.getAuthor());
        }
    }

    public void addBook(String title, String author, LibraryService service) {
        Book book = service.addBook(title, author);
        System.out.printf("[관리자] '%s' 책 추가합니다: %s (%s)\n",getName(), book.getTitle(), book.getAuthor());
    }

    public void removeBook(Book book, LibraryService service) {
        service.removeBook(book);
    }
}
