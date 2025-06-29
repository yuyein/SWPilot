package project_X.process7;

import java.net.URL;
import java.util.Scanner;

public class VitaBiodome01 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("URL 주소를 입력하세요: ");
            String input = scanner.nextLine().trim();

            URL url = new URL(input);

            System.out.println("url.getAuthority(): " + url.getAuthority());
            System.out.println("url.getContent(): " + url.getContent()); // 주의: 연결 발생
            System.out.println("url.getDefaultPort(): " + url.getDefaultPort());
            System.out.println("url.getPort(): " + url.getPort());
            System.out.println("url.getFile(): " + url.getFile());
            System.out.println("url.getHost(): " + url.getHost());
            System.out.println("url.getPath(): " + url.getPath());
            System.out.println("url.getProtocol(): " + url.getProtocol());
            System.out.println("url.getQuery(): " + url.getQuery());
            System.out.println("url.getRef(): " + url.getRef());
            System.out.println("url.getUserInfo(): " + url.getUserInfo());
            System.out.println("url.toExternalForm(): " + url.toExternalForm());
            System.out.println("url.toURI(): " + url.toURI());

        } catch (Exception e) {
            System.out.println("오류 발생: " + e.getMessage());
        }
    }
}
