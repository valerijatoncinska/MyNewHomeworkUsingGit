package MyNewHomeworkUsingGit.l42.exceptions;

public class Main01 {

    public static boolean isInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "qwerty";
        System.out.println(isInt(str));
    }
}
