import java.io.*;
import java.util.StringTokenizer;

public class Bj_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //처음 입력받는 숫자만큼 문자열을 반복해서 받음
        int cnt = Integer.parseInt(st.nextToken());

        //받은 숫자만큼 반복
        for (int i = 0; i < cnt; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken("\n");
            //총 점수를 계산할 score, O가 이어지는 것을 세기 위한 count 선언
            int score = 0;
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                //문자열을 돌면서, 문자열이 O와 일치하는지 체크
                if ("O".equals(Character.toString(s.charAt(j)))) {
                    //일치하면 count를 누적시켜주고, 점수에 더해줌
                    count++;
                    score += count;
                } else {
                    //X가 나올경우 누적된 점수를 0점으로 만들어줌
                    count = 0;
                }
            }
            bw.write(Integer.toString(score));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

