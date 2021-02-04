import java.util.Scanner;
public class ktraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year=scanner.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf("%d la  nam  nhuan ", year);
                } else {
                    System.out.printf("%d k  phai nam nhuan", year);
                }
            } else {
                System.out.printf("%d la nam nhuan", year);
            }
        } else {
            System.out.printf("%d k phai nam nhuan", year);
        }
    }
}
