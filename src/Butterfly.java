import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for(int i = 1 ; i <= n-2 ; i++) {

            if (i % 2 == 0) {

                String firstP1 = repeatStr("-", n - 2) + "\\" + " " + "/" + repeatStr("-", n - 2);
                System.out.println(firstP1);

            } else {
                String firstP = repeatStr("*", n - 2) + "\\" + " " + "/" + repeatStr("*", n - 2);
                System.out.println(firstP);
            }
        }

        String body  =  repeatStr(" ", n-1) + "@" + repeatStr(" ", n-1);
        System.out.println(body);

        for(int i = 1 ; i <= n-2 ; i++) {

            if (i % 2 == 0) {

                String firstB1 = repeatStr("-", n - 2) + "/" + " " + "\\" + repeatStr("-", n - 2);
                System.out.println(firstB1);

            } else {
                String firstB = repeatStr("*", n - 2) + "/" + " " + "\\" + repeatStr("*", n - 2);
                System.out.println(firstB);
            }
        }
    }
    static String repeatStr(String text, int count){
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < count; i++){
            result.append(text);
        }

        return result.toString();
    }
}


