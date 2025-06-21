package project_X.process6.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RunBiodome01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("멤버 리스트를 입력하세요 : ");
        String input = scanner.nextLine();

        input = input.replaceAll("[\\[\\]]","");
        List<String> member = Arrays.asList(input.split("\\s*,\\s*"));

        List<String> welcomeMessages = member.stream()
                .filter(s -> s.startsWith("신입-"))
                .map(s -> s.substring(3) + "님 환영합니다")
                .toList();

        System.out.println(welcomeMessages);
    }
}
