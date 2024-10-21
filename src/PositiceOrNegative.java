import java.util.Scanner;

public class PositiceOrNegative {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int input=scanner.nextInt();
        if(input>0){
            System.out.println("positive");
        }else {
            System.out.println("negative");
        }

    }
}
