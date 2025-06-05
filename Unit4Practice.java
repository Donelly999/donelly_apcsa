package Unit4;
import java.util.Scanner;

public class Unit4Practice {
    // 2
    public static int numDigits(int num){
        int count = 0;
        while (num != 0){ // note: it's not (n >= 0) bc. you want to stop when num gets to 0!!
            count++;
            num = num / 10;
        }
        return count;
    }

    // 7
    public static int mystery(int num){
        int x = num;
        while (x > 0){
            if (x / 10 % 2 == 0){
                return x;
            }
            x = x / 10;
        }
        return x;
    }

    // 8
    public static int readInt(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter a number: "); // user input number
        int num = myObj.nextInt();
        return num;
    }

    // 16
    public static int Mystery(int n){
        int x = 1;
        int y = 1;
        while (n > 2){
            x = x + y;
            y = x - y;
            n--;
        }
        return x;
    }

    // 22
    public static String abMethod(String a, String b){
        int x = a.indexOf(b);
        while (x >= 0){
            a = a.substring(0, x) + a.substring(x + b.length());
            // why doesn't this give a StringIndexOutOfBoundException error?
            x = a.indexOf(b);
        }
        return a;
    }

    public static void main(String[] args) {
        // 2
        System.out.println(numDigits(123456));

        // 4
        int k = 0;
        while (k < 4){
            k++;
            System.out.println(k + " "); // 1 2 3 4
        }

        // 7
        System.out.println(mystery(1034)); // 103

        // 8
        int n = 0;
        int prod = 1;
        while (n >= 0){
            n = readInt(); // this reads a random user input
            prod = prod * n;
        }
        System.out.println("product: " + prod);

        // 10
        int K = 0;
        while (K < 10){
            System.out.println((K % 3) + " "); // 0 2 0 2 0 2 0
            if (K % 3 == 0){
                K = K + 2;
            }
            else{
                K++;
            }
        }
        
        // 11
        int x = 1;
        while (x < 10){
            if (x % 2 == 0){
                System.out.println(x + " ");;
            }
            x = x + 2;
        }
        // nothing will be printed

        // 12
        int a = 24;
        int b = 30;
        while (b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        System.out.println("a:" + a); // 6
        System.out.println("b:" + b); // 0

        // 13
        int num1 = 0;
        int num2 = 1;
        int num3 = 5;
        while (num2 < num3){
            num1 += num2;
            num2 ++;
        }
        System.out.println(num1); // num1 = 10 = sum of all integers from [num2, (num3 - 1)]

        // 16
        System.out.println(Mystery(6)); // x = 8

        // 19
        // int n1 = 0;
        // int n2 = 3;
        // while ((n2 != 0) && ((n2 % n1 >= 0))){ // ArithmeticException: / by zero
        //     // but when n2 = 0, doesn't the evaluation stops at (n2 != 0) bc this already evaluates to false??
        //     n1 = n1 + 2;
        //     n2 = n2 - 1;
        // }
        // System.out.println("n1: " + n1);
        // System.out.println("n2: " + n2);

        // 20
        int k1 = 1;
        while (k1 < 20){
            if (k1 % 3 == 1){
                System.out.println(k1 + " "); // 1 4 7 10 13 16 19
            }
            k1++;
        }

        // 22
        System.out.println(abMethod("sing the song", "ng")); // "si the so"
    }
}
