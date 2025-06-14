package project_X.process4.ex2;

public class RuleOfBiodome02 {
    public static void main(String[] args) {
        Library library = new Library();

        Manager manager = new Manager("0001","세이코");
        Member member1 = new Member("0002","만옥");
        Member member2 = new Member("0003","메리");

        Book b1 = new Book("0001","자바의 구름","제임스 밥");
        Book b2 = new Book("0002","파이썬 마스터","한송희");
        Book b3 = new Book("0003","에너지 플로우","키네틱스");
        Book b4 = new Book("0004","화성에서의 기억","한송희");
        Book b5 = new Book("0005","야채의 비밀","송은정");
        System.out.printf("\n");

        manager.addBook(b1,library);
        manager.addBook(b2,library);
        manager.addBook(b3,library);
        manager.addBook(b4,library);
        manager.addBook(b5,library);
        System.out.printf("\n");

        member2.borrowBook(b1);
        System.out.printf("\n");

        Book b6 = new Book("0006","자료구조의 언덕","황수");
        Book b7 = new Book("0007","그곳에 가면","한송희");

        manager.addBook(b6,library);
        manager.addBook(b7,library);
        System.out.printf("\n");

        member1.borrowBook(b1);
        System.out.printf("\n");

        member2.returnBook(b1);
        System.out.printf("\n");

        manager.borrowBook(b4);
        System.out.printf("\n");

        library.findBook("한송희");



    }
}
