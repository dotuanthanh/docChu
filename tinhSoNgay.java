import java.util.Scanner;

public class tinhSoNgay {
    public static void main(String[] args) {
        System.out.println("Nhap  vao thang");
        Scanner scanner = new Scanner(System.in);
        int thang = scanner.nextInt();
        switch (thang) {
            case 12:
                System.out.println("thang 12 co 30  ngay");
                break;
            case 11:
                System.out.println("thang 11 co 31  ngay");
                break;
            case 10:
                System.out.println("thang 10 co 30  ngay");
                break;
            case 9:
                System.out.println("thang 9 co 31  ngay");
                break;
            case 8:
                System.out.println("thang 8 co 31  ngay");
                break;
            case 7:
                System.out.println("thang 7 co 30  ngay");
                break;
            case 6:
                System.out.println("thang 6 co 30  ngay");
                break;
            case 5:
                System.out.println("thang 5 co 31  ngay");
                break;
            case 4:
                System.out.println("thang 4 co 30  ngay");
                break;
            case 3:
                System.out.println("thang 3 co 30  ngay");
                break;
            case 2:
                System.out.println("thang 2 co 28  ngay");
                break;
            case 1:
                System.out.println("thang 1 co 30  ngay");
                break;
            default:
                System.out.println("nhap  lai");
        }
    }
}
