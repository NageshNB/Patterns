import java.util.Scanner;

public class ButterFly {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the num");
        int num =  scan.nextInt();
        for(int i =1; i<= num ; i++){
            for(int j =1;j<= i;j++){
                System.out.print("*");
            }
            for(int j =1;j<= (num-i)*2;j++){
                System.out.print(" ");
            }
            for(int j =1;j<= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =num; i>=1 ; i--){
            for(int j =1;j<= i;j++){
                System.out.print("*");
            }
            for(int j =1;j<= (num-i)*2;j++){
                System.out.print(" ");
            }
            for(int j =1;j<= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}