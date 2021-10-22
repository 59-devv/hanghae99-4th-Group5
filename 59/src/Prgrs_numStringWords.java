import java.io.*;
import java.util.StringTokenizer;

public class Prgrs_numStringWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String s = st.nextToken();

        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < words.length; i++) {
            s = s.replaceAll(words[i], Integer.toString(i));
        }
        int result = Integer.parseInt(s);

        bw.write(result);
        bw.flush();
        bw.close();
        br.close();

        // 인상깊었던 다른사람의 풀이
//        String[][] mapArr = { {"0", "zero"},
//                {"1", "one"},
//                {"2", "two"},
//                {"3", "three"},
//                {"4", "four"},
//                {"5", "five"},
//                {"6", "six"},
//                {"7", "seven"},
//                {"8", "eight"},
//                {"9", "nine"} };
//
//        for(String[] map : mapArr){
//            s = s.replace(map[1], map[0]);
//        }
//
//        int answer = Integer.parseInt(s);
//        return answer;
    }
}
