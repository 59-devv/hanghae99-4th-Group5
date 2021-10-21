import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Bj_2562 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            intList.add(num);
        }
        int maxValue = Collections.max(intList);
        int indexNum = intList.indexOf(maxValue)+1;
        bw.write(maxValue + "\n");
        bw.write(indexNum + "");
        bw.close();
        br.close();
    }
}
