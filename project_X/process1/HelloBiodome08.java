package project_X.process1;

public class HelloBiodome08 {
    public static void main(String[] args) {
        String[] dictionary = {"hello", "where", "this", "biodome", "help", "tree", "new", "is", "problem", "please", "need",
                "we", "isn’t", "there", "a", "your", "any", "thanks", "the", "for", "solution", "can", "?"};
        if (args.length == 0) {
            System.out.println("입력받은 메세지가 없습니다. 메세지를 입력해주세요");
            return;
        }

        //any부터 매칭되기 위해 사전 순서 바꾸기
        for (int i = 0; i < dictionary.length - 1; i++) {
            for (int j = i + 1; j < dictionary.length; j++) {
                if (dictionary[i].length() < dictionary[j].length()) {
                    String temp = dictionary[i];
                    dictionary[i] = dictionary[j];
                    dictionary[j] = temp;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        //StringBuilder result = new StringBuilder();
        boolean end=false;
        String command = args[0];
        if (command.endsWith("?")) {
            end=true;
            command = command.substring(0, command.length() - 1); // 물음표 제거하고 나중에 붙임
        }

        int i = 0;
        while (i < command.length()) {
            boolean match = false;
            for (String word : dictionary) {
                int len = word.length();

                if (i + len < command.length()) {
                    String s = command.substring(i, i + len);

                    if (s.equals(word)) {
                        if (result.length() > 0 && result.charAt(result.length() - 1) != ' ') {
                            result.append(" ");
                        }
                        result.append(word);
                        result.append(" ");
                        match = true;
                        i += len;
                        break;
                    }
                }
            }
            if (!match) {
                if (result.length() > 0 && result.charAt(result.length() - 1) != ' ') {
                    result.append("");
                }
                result.append(command.charAt(i));
                i++;
            }
        }
        if (result.length() > 0 && result.charAt(result.length() - 1) == ' ') {
            result.deleteCharAt(result.length() - 1);
        }
        if(end){
            result.append("?");
        }
        if (result.charAt(result.length() - 1) != '?'){
            result.append(".");
        }
        System.out.println(result.toString());
    }
}
