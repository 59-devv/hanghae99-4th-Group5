import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Bj_10818 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        List<Integer> numList = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            int n = Integer.parseInt(st.nextToken());
            numList.add(n);
        }
        bw.write(Collections.min(numList) + " " + Collections.max(numList));
        bw.flush();
        bw.close();
        br.close();
    }
}

