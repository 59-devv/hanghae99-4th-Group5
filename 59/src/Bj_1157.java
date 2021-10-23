import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Bj_1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String strs = st.nextToken().toUpperCase();
        List<Integer> counter = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            counter.add(0);
        }

        for (int j = 0; j < strs.length(); j++) {
            int idx = strs.charAt(j)-65;
            int plus = counter.get(idx)+1;
            counter.set(idx, plus);
        }
        int max = Collections.max(counter);
        int cnt = 0;
        for (int c : counter) {
            if (max == c) {
                cnt++;
            }
        }

        if (cnt == 1) {
            char cha = (char)(counter.indexOf(max)+65);
            bw.write((Character.toString(cha)));
        } else {
            bw.write("?");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
