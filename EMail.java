package SecondRound;

import java.util.Scanner;

public class EMail {
    public static boolean judgeEmail(String email) {
        boolean tag = true;
        if (!email.matches("^(\\w+([-.][A-Za-z0-9]+)*){3,18}@\\w+([-.][A-Za-z0-9]+)*\\.\\w+([-.][A-Za-z0-9]+)*$")) {
            tag = false;
        }
        return tag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        System.out.println(judgeEmail(email));
    }
}
