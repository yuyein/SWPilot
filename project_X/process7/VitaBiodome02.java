package project_X.process7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.Scanner;

public class VitaBiodome02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("URL을 입력하세요: ");
        String inputUrl = scanner.nextLine();

        // 공백 제거 (예: https: // www. java .com / ko / → https://www.java.com/ko/)
        inputUrl = inputUrl.replaceAll("\\s+", "");

        try {
            URL url = new URL(inputUrl);

            // try-with-resources를 사용하여 자동 자원 해제
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(url.openStream(), "UTF-8"))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

            } catch (IOException e) {
                System.out.println("웹사이트 데이터를 읽는 중 오류 발생: " + e.getMessage());
            }

        } catch (MalformedURLException e) {
            System.out.println("잘못된 URL 형식입니다: " + e.getMessage());
        }
    }
}

