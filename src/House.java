import java.util.Scanner;

public class House {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        //int stars = 1;
        int houseR = (n+1)/2;
        int house = n/2;
        // double rLength = (int)Math.ceil(n/2);
        //int padding  = (n - stars)/2;

        for (int i = 1; i <= houseR; i++) {
            if (n % 2 == 0) {




                String first = repeatStr("-", houseR-i) + repeatStr("*", 2*i) + repeatStr("-", houseR-i);
                System.out.println(first);

            } else {
                String first = repeatStr("-", houseR - i ) + repeatStr("*", 2*i-1) + repeatStr("-", houseR-i);
                System.out.println(first);

            }

        }

        for(int i=1; i <= house; i++ ){

            System.out.println(repeatStr("|",1)+ repeatStr("*", n-2)+repeatStr("|",1));
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
