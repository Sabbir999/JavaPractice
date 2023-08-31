import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //DisplayTime.dimondShape();

        //DisplayTime.displayTime();

        //DisplayTime.sumOfinteger();

        //char randomChar= RandomCharacter.getRandomCharacter('A','Z');
        //System.out.print("The random Character between A to Z is: "+randomChar);
        //OneDimensionArray.array();


        int arr[] = { 2, 4, 7, 10, 11,45,50,59,60,66,69,70,79 };
        int search = BinarySearch.binary(arr, 11);
        System.out.println("Element fount at index:"+search);
    }
}

