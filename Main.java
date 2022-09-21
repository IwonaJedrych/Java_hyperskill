import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0, b = 0, c = 0, d = 0;
        for (int i = 0; i < n; i++) {
            String grade = scanner.next();
            switch (grade) {
                case "A":
                    a = a + 1;
                    break;
                case "B":
                    b = b + 1;
                    break;
                case "C":
                    c = c + 1;
                    break;
                case "D":
                    d = d + 1;
                    break;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}