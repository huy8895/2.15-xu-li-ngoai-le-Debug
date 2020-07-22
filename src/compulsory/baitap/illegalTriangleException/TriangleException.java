package compulsory.baitap.illegalTriangleException;

import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) {
        System.out.println("Check illegal Triangle");
        System.out.println("enter three sides of triangle a,b,c :");

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("a: ");
            int a = scanner.nextInt();
            System.out.println("b: ");
            int b = scanner.nextInt();
            System.out.println("c: ");
            int c = scanner.nextInt();
            if (a < 0 ){
                throw new Exception("a phai lon hon 0");
            }

        } catch (Exception e){
            System.out.println(e);

        }



    }


}
