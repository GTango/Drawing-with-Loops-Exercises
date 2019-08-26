import java.util.Scanner;

public class Square_Frame {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        String firstAndLastRow = "+ " + repeatStr("- ",n-2) +  "+";
        System.out.println(firstAndLastRow);

        for(int i = 0 ; i < n - 2; i++){

            String middle_part = "| " + repeatStr("- ", n-2) + "|";
            System.out.println(middle_part);

        }


        System.out.println(firstAndLastRow);

    }
    static String repeatStr(String text, int count){
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < count; i++){
            result.append(text);
        }

        return result.toString();
    }
}


