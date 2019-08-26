import java.util.Scanner;

public class Christmas_Tree {


        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int n = Integer.parseInt(scan.nextLine());

            String firstRow = repeatStr(" ",n+1) + "|" + repeatStr(" ", n+1);
            System.out.println(firstRow);

            for(int i = 0 ; i < n ; i++){

                String middlePart = repeatStr(" ", n - 1 - i) + repeatStr("*" , 1+i) + " | "
                        + repeatStr("*" , 1+i)+repeatStr(" ", n - 1 - i);
                System.out.println(middlePart);

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


