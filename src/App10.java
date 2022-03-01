 import java.util.Scanner;
public class App10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào số nguyên dương n: ");
        int n = scanner.nextInt();
        int a=0;
        scanner.close();
        while(n>0)
        {
            a++;
            n/=10;
        }
        System.out.println("Số vừa nhập có "+ a +" chữ số");
    }
}
