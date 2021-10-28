public class Prgrs_carpet {

    public static int[] solution(int brown, int yellow) {
        // 알 수 있는 것.
        int total = brown + yellow;
        // 알 수 있는 것 2
        // yellow = (width-2) * (height-2)
        int[] answer = new int[2];

        for (int i = total; i > 0; i--) {
            if (total % i == 0) {
                if ((i-2) * ((total / i)-2) == yellow) {
                    answer[0] = i;
                    answer[1] = total/i;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] answer = solution(24, 24);
        System.out.println(answer[0] + ", " + answer[1]);
    }
}