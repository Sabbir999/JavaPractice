import java.util.Scanner;

public class OneDimensionArray {
    public static void array(){
        System.out.print("Enter the size of Array: ");
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        int number[]=new int[size];
        for(int i=0;i<number.length;i++){
            number[i]=in.nextInt();
        }
        for(int j=0;j<number.length;j++){
            System.out.println(number[j]);
        }
        System.out.print("Enter the searching numbers: ");
        int find=in.nextInt();
        boolean found=false;

        int postion=-1;
        for(int k=0; k<number.length;k++){
            if(find==number[k]){
                found=true;
                postion=k;
                break;
            }

        }
        if(found){
            System.out.println("Number found at index: "+postion);
        }
        else{
            System.out.println("Number not found");
        }
    }

}
