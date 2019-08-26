import java.util.Scanner;

public class Rectangle_Of_NxN_Stars {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());


        for (int i = 1; i <= n; i++) {

            System.out.println(repeatStr("*", n));


        }


    }

    static String repeatStr(String text, int count) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < count; i++) {
            result.append(text);
        }

        return result.toString();
    }

}