import java.util.Scanner;

public class DisplayTime {
    public static void dimondShape(){
        System.out.printf("Hello and welcome!\n");
        System.out.print("Enter the size of Diamond: ");
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();

        for (int i = 1; i <= n; i++) {
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            for(int k=0;k<i;k++){
                System.out.print(" *");
            }
            for(int l=1;l<i;l++){
                System.out.print(" *");
            }
            System.out.println();
        }

        for(int i=1; i<=n; i++){
            for(int j=0; j<i;j++){
                System.out.print("  ");
            }
            for(int k=i;k<n;k++){
                System.out.print(" *");
            }
            for(int l=i; l<n-1;l++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void displayTime(){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int second=input.nextInt();
        int minutes=second/60;
        int remainingSecond=second % 60;
        System.out.println(second+" seconds is equal to "+minutes+" minutes and "+remainingSecond+" seconds");
    }
    public static void sumOfinteger(){
        int sum=0;
        for(int i=1;i<=45;i++){
            if((i <= 10 )|| (i>=20 && i<=35) || (i>=35 && i<=45)){
                sum+=i;
            }

        }
        System.out.print("Sum of integer is: "+sum);

    }
}

