import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = myScan.nextInt();
        int sumOfDigits = 0;
        sumOfDigits += num % 10/ 1;
        sumOfDigits += num % 100 / 10;
        sumOfDigits += num % 1000 / 100;
        sumOfDigits += num % 10000 / 1000;
        sumOfDigits += num % 100000/ 10000;
        System.out.println(sumOfDigits);


        //1879 10 10^2 10^3
        //9= 1879 % 10;
        //7= 1879 % 10^2 / 10;
        //8= 1879 % 10^3 / 10^2;
        //1= 1879 / 10^3;
        //sum(1879) = 1+8+7+9;
        //1879 = 1*10^3 + 0*10^2 +7*10^1 +9*10^0

        //a % b = a - ((a/b)*b)


    }
}