package October16;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter value 1");
        int a=scanner.nextInt();
        System.out.println("Enter value 2");
        int b=scanner.nextInt();
        int c=a+b;
        System.out.println("addition of a+b :"+ c);
        scanner.close();

    }
}
