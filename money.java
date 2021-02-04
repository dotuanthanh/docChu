package docChu;

import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        Scanner scanner=  new Scanner(System.in);
        double  x  = scanner.nextDouble();
                int n =scanner.nextInt();
                switch (n){
                    case 1 :
                        double VND= x *23000;
                        System.out.println("Chuyen do  USD =>  VND :  " +  VND +"VND");
                        break;
                    case 2 :
                        double USD= x /23000;
                        System.out.println("Chuyen do  USD =>  VND :  " +  USD +"VND");
                        break;
                }
    }
}
