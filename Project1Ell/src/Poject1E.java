import java.util.Scanner;

public class Poject1E {
    public static void main(String[] args) {

        /* <Sophia Martin>
        Class name:  	   Project1E
        Course, Section: CIS1500, A1512
        Date of completion:     <9-27-22>
        Purpose:  <This class encrypts a code so that it can be transmitted securely, all the data
         is transmitted as 4 digit integers, the encrypted number will be output to the console>
         */
        int num1; //first number in code input by user
        int num2; //second number in code input by user
        int num3; //third number in code input by user
        int num4; //fourth number in code input by user
        int code; //code input by user
        int enum1; //encrypted first number in code input by user
        int enum2; //encrypted 2nd number in code input by user
        int enum3; //encrypted 3rd number in code input by user
        int enum4; //encrypted 4th number in code input by user
        int calcnum1; //the final num
        int calcnum2; //the second final num
        int calcnum3; // the third final num
        int calcnum4; // the fourth final num
        Scanner keyboard = new Scanner(System.in); //naming and creating the scanner

        System.out.println("Please enter a four digit number to encrypt then press enter");
        code = keyboard.nextInt();

        num1 = (code / 1000) % 10;
        num2 = (code / 100) % 10;
        num3 = (code / 10) % 10;
        num4 = code % 10;

        enum1 = (num1 + 7) % 10;
        enum2 = (num2 + 7) % 10;
        enum3 = (num3 + 7) % 10;
        enum4 = (num4 + 7) % 10;

        calcnum1 = enum3;
        calcnum3 = enum1;
        calcnum2 = enum4;
        calcnum4 = enum2;

        System.out.println(" " + calcnum1 + calcnum2 + calcnum3 + calcnum4);
    }
}