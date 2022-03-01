
import java.util.Scanner;
public class App9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên dương: ");
        int n = scanner.nextInt();
        int KetQua = SoDaoNguoc(n);
        System.out.println("Số đảo ngược: "+ KetQua);
    }
    private static int SoDaoNguoc(int n){
        int a = 0;
        while (n > 0) {
            a = a * 10 + n % 10;
            n /= 10;
        }
        return a;
    }
}