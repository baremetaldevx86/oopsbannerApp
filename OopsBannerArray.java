public class OopsBannerApp {

    static String[] O = {
        "****",
        "*  *",
        "*  *",
        "****"
    };

    static String[] P = {
        "****",
        "*  *",
        "****",
        "*   "
    };

    static String[] S = {
        "****",
        "*   ",
        "   *",
        "****"
    };

    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            System.out.println(O[i] + " " +
                               O[i] + " " +
                               P[i] + " " +
                               S[i]);
        }

    }
}
