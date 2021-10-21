import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Bj_5698 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // Y 와 N 을 판별해줄 flag 생성
            boolean flag = true;
            // 1. 첫번째 단어의 첫번째 문자가 '*' 인지 확인해야함
            // 2. 첫번째 단어의 첫번째 문자가, 다음 단어들의 첫번째와 일치해야함
            // -> startPointer 를 첫번째 단어의 첫번째 문자로 변수 선언
            char startPointer = st.nextToken().toLowerCase().charAt(0);
            // startPointer가 '*' 이면, while문 탈출
            if (startPointer == '*') {
                break;
            }
            // 다음 읽을 값이 있을때까지 또 반복
            while (st.hasMoreTokens()) {
                // 다음값과 startPointer가 같은지 확인해서, 만약 다르면 flag값을 false로 변경
                // 이 때, '같으면 true로 변경' 이라는 설정이 없기 때문에, 한번이라도 false이면 계속 false 상태임
                if (st.nextToken().toLowerCase().charAt(0) != startPointer) {
                    flag = false;
                }
            }
            // 한 줄에 대한 값을 모두 검사했으면, flag가 true인지 false인지에 따라 Y 와 N을 저장
            bw.write(flag ? "Y" : "N");
            bw.newLine();
        }
        // 마지막에 한번에 출력
        bw.flush();
        bw.close();
        br.close();
    }
}