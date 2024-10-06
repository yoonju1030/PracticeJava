package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로
        int score = 93;
        System.out.println(score);
        System.out.println((float)score);
        System.out.println((double)score);

        float score_f = 93.3F;
        double score_d = 93.8;
        System.out.println((int)score_f);
        System.out.println((int)score_d);

        score = 93+(int)98.8;
        System.out.println(score);
        score_d = 93+98.8;
        System.out.println(score_d);

        // 변수에 형변환된 데이터 집어넣기
        double converedScoreDouble = score;
        System.out.println(converedScoreDouble);
        // int ->  long -> float -> double (자동형변환)

        int convertedScoreInt = (int)score_d;
        System.out.println(convertedScoreInt);
        // 역방향은 수동으로 해야함

        String s1 = String.valueOf(93);
        System.out.println(s1);
        s1 = Integer.toString(92);
        System.out.println(s1);
        // 실수도 가능 (float, double)

        int i = Integer.parseInt(s1);
        System.out.println(i);
        double d = Double.parseDouble("98.8");
        System.out.println(d);
    }
}
