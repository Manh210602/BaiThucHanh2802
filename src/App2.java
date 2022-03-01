import java.util.Scanner;
public class App2 {
        private static Scanner scanner = new Scanner(System.in);
        public static void main(String[] arg) {
            System.out.print("Nhập cạnh thứ nhất = \n");
            int a = scanner.nextInt();
            System.out.println("Nhập cạnh thứ hai = ");
            int b = scanner.nextInt();
            System.out.print("Nhập cạnh thứ ba = \n");
            int c = scanner.nextInt();
            if (a < b + c && b < a + c && c < a + b) {
                if (a * a != b * b + c * c && b * b != a * a + c * c && c * c != a * a + b * b) {
                    if (a == b && b == c) {
                        System.out.println("Đây là tam giác đều");
                    } else if (a != b && a != c && b != c) {
                        System.out.println("Đây là tam giác thường");
                    } else if (a * a != b * b + c * c && b * b != a * a + c * c && c * c != a * a + b * b) {
                        System.out.println("Đây là tam giác cân");
                    } else {
                        System.out.println("Đây là tam giác vuông cân");
                    }
                } else {
                    System.out.println("Đây là tam giác vuông");
                }
            } else {
                System.out.println("Ba cạnh a,b,c không phải là ba cạnh của một tam giác");
            }
        }
        static {
            scanner = new Scanner(System.in);
        }
}
