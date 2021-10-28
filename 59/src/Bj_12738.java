import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Bj_12738 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken("\n"));
        int[] s = new int[c];
        st = new StringTokenizer(br.readLine());
        for (int a = 0; a < c; a++) {
            s[a] = Integer.parseInt(st.nextToken());
        }

        List<Integer> cntList = new ArrayList<>();
        for (int i = 0; i < s.length - 1; i++) {
//            int[] cntList = new int[s.length-1];
            int temp = s[i];
            int cnt = 1;
            for (int j = i + 1; j < s.length; j++) {
                if (temp < s[j]) {
                    cnt++;
                    temp = s[j];
                }
            }
            cntList.add(cnt);
        }
        int maxValue = Collections.max(cntList);
        bw.write(maxValue + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
