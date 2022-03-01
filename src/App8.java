import java.util.Scanner;
public class App8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=0,n;
        do
        {
            System.out.println("Nhập vào số nguyên: ");
            n=sc.nextInt();
            if(n%5==0 && n>max)
            {
                max=n;
            }
        }while(n!=0);
        System.out.println("Số lớn nhất chia hết cho 5 trong các số nguyên vừa nhập là: "+max);
    }
}
