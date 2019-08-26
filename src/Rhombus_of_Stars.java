import java.util.Scanner;

public class Rhombus_of_Stars {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());


        for (int i = 0; i < n; i++) {


            String middlePart = repeatStr(" ", n - 1 - i) + "*" + repeatStr(" *", i);
            System.out.println(middlePart);

        }

        for (int i = 0; i < n - 1; i++) {

            String middlePart1 = repeatStr(" ", n - (n - 1) + i) + "*" + repeatStr(" *", n - 2 - i);
            System.out.println(middlePart1);


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