import java.util.Scanner;

public class Palindromic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the row num");
        int row = scan.nextInt();
        for(int i =1; i<=row;i++){

            //printing spaces
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }

            //printing 1st half nums
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            //printing 2nd half nums
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
