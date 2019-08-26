import java.util.Scanner;

public class Sunglasses {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        String firstRow = repeatStr("*",2*n) +  repeatStr(" ", n) + repeatStr("*",2*n);
        System.out.println(firstRow);

        for(int i = 0 ; i < n - 2 ; i++){
            if(i ==(n-1)/2-1) {
                String middlePart = "*" + repeatStr("/", 2 * n - 2) + "*" + repeatStr("|", n) + "*"
                        + repeatStr("/", 2 * n - 2) + "*";
                System.out.println(middlePart);

            }
            else {

                String middlePart1 = "*" + repeatStr("/", 2 * n - 2) + "*" + repeatStr(" ", n) + "*"
                        + repeatStr("/", 2 * n - 2) + "*";
                System.out.println(middlePart1);
            }

        }


        String LastRow = repeatStr("*",2*n) +  repeatStr(" ", n) + repeatStr("*",2*n);
        System.out.println(LastRow);


    }



    static String repeatStr(String text, int count){
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < count; i++){
            result.append(text);
        }

        return result.toString();
    }
}


