import java.io.*;
import java.util.StringTokenizer;

public class Bj_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int temp = num;
        int cnt = 0;
        while (true) {
            int target = ((num%10)*10)+(((num/10)+(num%10))%10);
            cnt++;
            if (target == temp) {
                break;
            } else {
                num = target;
            }
        }
        bw.write(cnt + "");
        bw.flush();
        bw.close();
        br.close();
    }
}