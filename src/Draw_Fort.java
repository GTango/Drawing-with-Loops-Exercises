import java.util.Scanner;

public class Draw_Fort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int cSize = n/2;
        String firstRow = "/" + repeatStr("^",cSize) + "\\" + repeatStr("_", 2 * n - 2 * cSize - 4) + "/" + repeatStr("^",cSize) + "\\";
        System.out.println(firstRow);

        for(int i = 1 ; i <= n-3; i++){

            String middlePart = "|" + repeatStr(" " , 2*n-2) + "|";

            System.out.println(middlePart);

        }

        String middlePart1 = "|" + repeatStr(" " , cSize+1) + repeatStr("_", 2 * n - 2 * cSize - 4) +  repeatStr(" " , cSize+1) +"|";

        System.out.println(middlePart1);


        String lastR= "\\" + repeatStr("_",cSize) + "/" + repeatStr(" ", 2 * n - 2 * cSize - 4) + "\\" + repeatStr("_",cSize) + "/";
        System.out.println(lastR);


    }
    static String repeatStr(String text, int count){
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < count; i++){
            result.append(text);
        }

        return result.toString();
    }

}
