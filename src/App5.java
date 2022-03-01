import java.util.Scanner;
public class App5 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhập vào số nguyên dương n : ");
        int a = scanner.nextInt();
        int sum=0 ;
        for(int i=1;i<=a/2;i++){
            if(a%i==0)
                sum+=i;
        }
        if(sum==a){
            System.out.println(a + " là số hoàn hảo");
        }
        else {
            System.out.println(a + " không phải là số hoàn hảo");
        }
    }
}