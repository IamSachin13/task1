import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input= scanner.nextInt();
        int digit=0;
        int output=0;

        while (input>0) {
            digit=input%10;
            output=(output*10)+digit;
            input=input/10;

        }
        System.out.println(output);
        }
    }

