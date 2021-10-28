import java.io.*;
import java.util.StringTokenizer;

public class Bj_10769 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //한줄 모두 불러와야하므로, "\n"
        String strs = st.nextToken("\n");

        int happyCnt = 0;
        int sadCnt = 0;

        // :-) 나  :-( 를 하나라도 포함할 때까지 계속 반복

        while (strs.contains(":-)") || strs.contains(":-(")) {
            if (strs.contains(":-)")) {
                // 첫번째 :-) 를 찾아서 없애주고, 숫자를 올려줌
                // split, replace 와 같은 메소드를 사용할 때, 괄호를 문자로 처리하기 위해서 \\를 사용해야함.
                strs = strs.replaceFirst(":-\\)", "");
                happyCnt++;
                System.out.println(strs);
            } else if (strs.contains(":-(")) {
                strs = strs.replaceFirst(":-\\(", "");
                sadCnt++;
                System.out.println(strs);
            }
        }

        if (happyCnt == sadCnt && happyCnt == 0) {
            bw.write("none");
        } else if (happyCnt == sadCnt) {
            bw.write("unsure");
        } else if (happyCnt > sadCnt) {
            bw.write("happy");
        } else if (happyCnt < sadCnt) {
            bw.write("sad");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
