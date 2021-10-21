import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Bj_1546 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken());
            List<Integer> scores = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < count; i++) {
                scores.add(Integer.parseInt(st.nextToken()));
            }
            int maxNum = Collections.max(scores);
            double sum = 0;
            for (int s : scores){
                sum += (double)s/maxNum*100;
            }
            bw.write((sum/count) + "");
            bw.flush();
            bw.close();
            br.close();
        }
    }