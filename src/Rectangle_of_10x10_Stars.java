import java.util.Scanner;

public class Rectangle_of_10x10_Stars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //int n = Integer.parseInt(scan.nextLine());


        for(int i = 1 ; i <= 10; i++){

            System.out.println(repeatStr("*",10));



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

