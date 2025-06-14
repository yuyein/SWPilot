package project_X.process4.ex2;

import java.util.ArrayList;
import java.util.List;

class Library implements LibraryService {
    /*
    도서관 기능 : 도서관의 모든 책, 모든 회원 정보를 관리한다. 새로운 일반 회원과 새로운 관리자를 등록할 수 있다. 모든 책과 회원 정보를 출력할 수 있다.
    저자의 이름을 기반으로 책을 검색하고 대출 상태를 출력할 수 있다. 예외 상황이 발생하는 경우 안내 메시지를 출력한다.*/
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    private int userIndex = 1;
    private int bookIndex = 1;
    private User manager;

    public Book writeBook(String isbn, String title, String author) {
        Book book = new Book(isbn, title, author);
        books.add(book);
        return book;
    }
    public void printAllUser(){
        System.out.println("모든 이용자 목록:\n");
        for (User user : users) {
            System.out.printf("%s, %s\n", user.getName(), user.userId);
        }
    }

    public void printAllBooks(){
        System.out.println("모든 책 목록:\n");
        for (Book book : books) {
            System.out.printf("%s, %s, %s, %s\n", book.getTitle(), book.getAuthor(), book.getIsbn(), book.isBorrowed ? "대출 불가" : "대출 가능");
        }
    }

    public void findBook(String author){
        /*
        저자 '한송희'의 책 목록:파이썬 마스터, 대출 가능 화성에서의 기억, 대출 불가 그곳에 가면, 대출 가능
         */
        boolean found = false;
        System.out.printf("저자 '%s'의 책 목록\n",author);
        for(int i=0;i< books.size();i++){
            if(author.equals(books.get(i).getAuthor())){
                books.get(i).printBookInfo();
                found=true;
            }
        }
        if(!found){
            System.out.printf("해당 저자의 책은 없습니다.\n");
        }
    }
    @Override
    public Book addBook(String title, String author) {
        String isbn = String.format("%04d", bookIndex++);
        Book book = new Book(isbn, title, author);
        books.add(book);
        return book;
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void addBook(Book book) {
        books.add(book);
    }
    public void addMember(Member member) {
        users.add(member);
    }

    public void addManager(Manager manager) {
        users.add(manager);
        this.manager=manager;
    }
}
