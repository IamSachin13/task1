import java.util.Scanner;

public class PaybleAmount {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();

        int total=a+b+c;

        if(total<500){
            System.out.println(total+" Is total amount");
        } else if (total>500&&total<1000) {
            total+=total*0.10;
            System.out.println(total+" Is total amoun");
        }else {
            total+=total*0.20;
            System.out.println(total+" Is total amoun");
        }
    }
}
