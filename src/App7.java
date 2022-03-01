import java.util.Scanner;
public class App7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n,max=0;
        do
        {
            System.out.println("nhập vào số thực: ");
            n = scanner.nextFloat();
            if(n>max)
            {
                max=n;
            }
        }
        while(n!=0);
        System.out.println("Số lớn nhất là : " + max);
    }
}