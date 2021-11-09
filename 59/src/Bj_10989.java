import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nArr = new int[N];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            nArr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(nArr);
        for (int i = 0; i < N; i++) {
            sb.append(nArr[i]).append("\n");
        }
        System.out.println(sb);
    }
}