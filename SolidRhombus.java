import java.util.Scanner;

public class SolidRhombus {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();
        for(int i=1; i<=num; i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=num;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}