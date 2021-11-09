import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj_1764x {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken(" "));
        int M = Integer.parseInt(st.nextToken());
        String[] name = new String[N];
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            name[i] = st.nextToken("\n");
        }

        Arrays.sort(name);

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String nm = st.nextToken("\n");
            int left = 0;
            int right = name.length - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                String n = name[mid];
                if (n.equals(nm)) {
                    answer.add(nm);
                    break;
                }
                if (n.toCharArray()[0] > nm.toCharArray()[0]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
                if (left > right) {
                    break;
                }
            }
        }
        StringBuilder sb = new StringBuilder();

        sb.append(answer.size()).append("\n");
        Collections.sort(answer);

        for (String s : answer) {
            sb.append(s).append("\n");
        }
        System.out.print(sb);
    }
}