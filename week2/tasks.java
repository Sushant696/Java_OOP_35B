package week2;

public class tasks {
    public static void main(String[] args) {
        int english = 38;
        int nepali = 89;
        int science = 92;
        int maths = 76;
        int percentage;
        String result;

        percentage = (english + nepali + science + maths) / 4;
        System.out.println(percentage);
        result = percentage >= 70 ? "first class"
                : percentage > 60 ? "upper second class "
                        : percentage > 50 ? "second class" : percentage > 40 ? "third class" : "";
        System.out.println(result);
    }
}
