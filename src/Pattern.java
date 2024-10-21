import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rows = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {

                System.out.print(Math.max(rows - i, rows - j) + " ");
            }
            System.out.println();
        }
    }
}
