import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int  leftRight  = (n-1) / 2;


        for (int i = 1; i <= (n-1)/2; i++) {

            System.out.print(repeatStr("-", leftRight));
            System.out.print("*");
            int mid = n -2 * leftRight - 2;
            if(mid >=0){
                System.out.print(repeatStr("-", mid));
                System.out.print("*");
            }

            System.out.println(repeatStr("-",leftRight));
            leftRight--;
        }


        for (int i = n / 2; i < n; i++){



            System.out.print(repeatStr("-", leftRight));
            System.out.print("*");
            int mid = n - 2 * leftRight - 2;
            if(mid >=0){
                System.out.print(repeatStr("-", mid));
                System.out.print("*");
            }

            System.out.println(repeatStr("-",leftRight));

            leftRight++;
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


