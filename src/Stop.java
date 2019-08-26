import java.util.Scanner;

public class Stop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int dots = n;
        int bottom = 2*n-1;
        String firstRow = repeatStr(".",n +1 ) + repeatStr("_", 2*n+1) + repeatStr(".",n + 1);
        System.out.println(firstRow);

        for(int i = 0 ; i < n ; i++) {

            String middlePart = repeatStr(".", dots) + "//" + repeatStr("_", bottom) + "\\\\" + repeatStr(".", dots);
            System.out.println(middlePart);
            dots--;
            bottom += 2;

        }


        int w = (n*2)+(2*n-1)-4;

        String middlePart1 = "//" + repeatStr("_", w/2) + "STOP!" + repeatStr("_", w/2) + "\\\\" ;

        System.out.println(middlePart1);


        for (int i = 0; i <  n ; i++) {
            String endtRow = repeatStr(".", i)
                    + "\\\\"
                    + repeatStr("_", w+4-i-i)
                    + "//"
                    + repeatStr(".", i);

            System.out.println(endtRow);

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
