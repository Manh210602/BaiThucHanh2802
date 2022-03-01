import java.util.Scanner;
public class App6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương n: ");
        int n = scanner.nextInt();
        int i = 0, check;
        while ( i < n){
            check = SoHoanThien(i);
            if( check == 1 ) System.out.print (i +" ");
            ++i;
        }
    }
    private static int SoHoanThien(int n){
        int flag = 0, total=0;
        for (int i=1;i<n; i++){
            if (n % i == 0) total+=i;
        }
        if (total == n & n!=0) flag = 1;
        return flag;
    }
}