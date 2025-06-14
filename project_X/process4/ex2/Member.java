package project_X.process4.ex2;

class Member extends User {
    /*
    사용자 정보 : 사용자 아이디, 이름, 대출 책 목록을 포함하며, 사용자는 아래 분류 중 하나에 속한다. 멤버 : 도서관을 이용하는 일반 회원 - 책을 대출/반납할 수 있다.
     */
    public Member(String userId, String name) {
        super(userId, name);
        System.out.printf("새로운 이용자 '%s'를 등록합니다.\n",name);
    }
    @Override
    public void borrowBook(Book book) {
        if(!book.isBorrowed) {
            book.isBorrowed = true;
            bookList.add(book);
            System.out.printf("[이용자] '%s' '%s' 대출합니다.\n",getName(),book.getTitle());
        }
        else{
            System.out.printf("'%s'은 대출 중입니다.\n",book.getTitle());
        }

    }

    @Override
    public void returnBook(Book book) {
        if(bookList.contains(book)&&book.isBorrowed) {
            book.isBorrowed = false;
            bookList.remove(book);
            System.out.printf("[이용자] '%s' '%s' 반납합니다.\n",getName(),book.getTitle());
        }
        else {
            System.out.printf("'%s'는 등록되어 있지 않은 책입니다.",book.getTitle());
        }

    }
    public void addBook(Book book, Library library) {
        System.out.println("Member can't add book");
    }

    public void removeBook(Book book, Library library) {
        System.out.println("Member can't remove book");
    }

}
