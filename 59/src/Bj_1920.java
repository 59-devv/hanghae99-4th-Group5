import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Bj_1920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] nNum = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nNum[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nNum);

        int m = Integer.parseInt(br.readLine());
        StringTokenizer mNum = new StringTokenizer(br.readLine());

        for (int i=0; i < m; i++) {
            int c = Integer.parseInt(mNum.nextToken());
            int left = 0;
            int right = nNum.length - 1;
            int mid;
            int answer = 0;
            while (left <= right) {
                mid = (left + right) / 2;
                if (nNum[mid] < c) {
                    left = mid + 1;
                } else if (nNum[mid] > c) {
                    right = mid - 1;
                } else if (nNum[mid] == c) {
                    answer = 1;
                    break;
                }
            }
            bw.write(answer + "");
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}