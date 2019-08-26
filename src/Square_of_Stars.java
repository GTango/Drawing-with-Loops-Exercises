import java.util.Scanner;

public class Square_of_Stars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for(int r = 1; r <=n ; r++){
            System.out.print("*");
            for(int c = 1; c<= n-1; c++){
                System.out.print(" *");
            }

            System.out.println();
        }
    }
}

