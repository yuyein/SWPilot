# SOLID 보고서

## SOLID원칙의 개념
 SOLID 원칙은 객체지향 설계의 다섯 가지 핵심 원칙으로, 유지보수성과 확장성이 뛰어난 소프트웨어를 만들기 위한 가이드라인이다.
S	단일 책임 원칙 (Single Responsibility Principle)
 : 하나의 클래스는 하나의 책임만 가져야 한다. 모듈이 변경되는 이유가 한가지여야 함으로 받아들여야 한다.

O	개방-폐쇄 원칙 (Open-Closed Principle)  
 : 확장에는 열려 있고, 변경에는 닫혀 있어야 한다.  

L	리스코프 치환 원칙 (Liskov Substitution Principle)  
 : 자식 클래스는 부모 클래스의 역할을 대체할 수 있어야 한다.  

I	인터페이스 분리 원칙 (Interface Segregation Principle)  
 :  사용하지 않는 기능에 의존하지 않도록, 인터페이스는 분리되어야 한다.  

D	의존 역전 원칙 (Dependency Inversion Principle)	 
 : 상위 모듈은 하위 모듈에 의존하지 않고, 둘 다 추상화에 의존해야 한다.  

## SOLID 원칙이 필요한 이유와 의의
1. 변화에 유연하게 대응하기 위해 실제 소프트웨어는 요구사항이 자주 변합니다.  
SOLID 원칙은 "변경은 최소한으로, 확장은 자유롭게" 하도록 도와줍니다.   
예: OCP(개방-폐쇄 원칙) → 기존 코드를 건드리지 않고도 기능 추가 가능
   
 
2. 유지보수 비용 절감
   잘못된 설계는 하나의 변경이 여러 부분에 영향을 미쳐 디버깅이 어렵습니다.  
SRP(단일 책임 원칙)를 따르면 각 클래스의 역할이 명확해져 문제 파악이 쉬워지고, 유지보수가 쉬워짐.
  

3. 높은 응집도와 낮은 결합도 유지  
객체지향 설계의 이상적인 구조는 모듈 간 결합도는 낮고 응집도는 높은 상태입니다.
SOLID 원칙은 이를 구조적으로 지원합니다.
  

4. 재사용성 증가   
잘 설계된 클래스는 다른 프로그램에서도 그대로 사용할 수 있음.  
LSP(리스코프 치환 원칙), DIP(의존 역전 원칙)는 유연한 코드 재사용에 핵심 역할.

5. 테스트 용이성 향상  
객체 간 의존을 분리해두면, 단위 테스트 및 자동화 테스트가 수월해집니다.

DIP(의존 역전 원칙)과 ISP(인터페이스 분리 원칙)는 테스트 가능한 구조를 만듦.


## 코드 분석
RuleOfBodome01_before.java
```
import java.util.ArrayList;
import java.util.List;

class Book {
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
}

abstract class User {
    public String userId;
    public String name;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
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

	abstract void addBook(Book book, Library library);
	abstract void removeBook(Book book, Library library); 

}

class Member extends User {
    public Member(String userId, String name) {
        super(userId, name);
    }
		
		public void addBook(Book book, Library library) {
				System.out.println("Member can't add book");
		}
		public void removeBook(Book book, Library library) {
				System.out.println("Member can't remove book");
		}
}

class Manager extends User {
    public Manager(String userId, String name) {
        super(userId, name);
    }

		public void addBook(Book book, Library library) {
				library.addBook(book);
		}

		public void removeBook(Book book, Library library) {
				library.removeBook(book);
		}
}


class Library {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public Book writeBook(String isbn, String title, String author) {
        Book book = new Book(isbn, title, author);
        books.add(book);
        return book;
    }
		public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void addMember(Member member) {
        users.add(member);
    }

    public void addManager(Manager manager) {
        users.add(manager);
    }
}

public class BiodomeFamily08_Before {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = library.writeBook("0001", "Book1", "Author1");
        Book book2 = library.writeBook("0002", "Book2", "Author2");

        Member member = new Member("U001", "Kim");
        Manager manager = new Manager("U002", "Song");

        library.addMember(member);
        library.addManager(manager);

        member.borrowBook(book1);
        System.out.println("책을 빌립니다: " + book1.title);
        member.returnBook(book1);
        System.out.println("책을 반납합니다: " + book1.title);
    }
}

```

1. SRP 원칙 위배  
User class가 책을 빌리거나 반납하는 책임과, 도서를 추가하고 삭제하는 책임 둘 다를 가진다
2. OCP 원칙 위배  
   User 클래스에서 addBook()과 removeBook()을 강제하므로, 새로운 사용자 유형이 생기면 그에 맞게 불필요한 메서드를 오버라이드해야 함.   
즉, 새로운 기능을 추가하거나 역할이 바뀔 때마다 기존 클래스를 수정하게 됨
3. LSP 원칙 위배  
   부모 클래스인 User를 기대하고 썼을 때, Member는 실제로 그 책임을 수행하지 못함. 즉, 하위 클래스가 상위 클래스를 완전히 대체하지 못함
4. ISP 원칙 위배  
   Member는 이 메서드를 사용하지 않음에도 불구하고 강제로 구현해야 함 필요하지 않은 기능에 의존하고 있음
5. DIP 원칙 위배  
   Manager가 직접 Library 객체에 접근하여 메서드를 호출하고 있음 인터페이스를 통해 의존하도록 개선 가능성 존재

