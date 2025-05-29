public class Unit3Practice {
    // 17
    public static int pick(boolean test, int x, int y){
        if (test){
            return x;
        }
        else {
            return y;
        }
    }

    // 18
    public static int biggest(int a, int b, int c){
        if ((a > b) && (a > c)){
            return a;
        }
        else if ((b > a) && (b > c)){
            return b;
        }
        else {
            return c;
        }
    }


    public static void main(String[] args) {
        // 2
        int valueOne, valueTwo;
        valueOne = 5;
        valueTwo = 5;
        System.out.println(valueOne == valueTwo); // use == to compare

        // System.out.println(valueOne.equals(valueTwo));
        // Cannot invoke equals(int) on the primitive type int

        // System.out.println(valueOne.compareTo(valueTwo));
        // Cannot invoke compareTo(int) on the primitive type int

        // 3
        int a = 10;
        int b = 5 * 2;
        System.out.println(a == b); // true

        // 4
        double a1 = 1.1;
        double b1 = 1.2;
        if ((a1 + b1) * (a1 - b1) != (a1 * a1) - (b1 * b1)){
            // Due to precedence rule, (a1 - b1) != (a1 * a1) is always evaluated first --> true
            System.out.println("Mathematical error!");
        } 

        // 5
        boolean x = (5 < 8) == (5 == 8);
        System.out.println(x); // false

        // 7
        int x1 = 7;
        if (x1 < 7){
            x1 = 2 * x1;
        }
        if (x1 % 3 == 1){ // true
            x1 = x1 + 2;
        }
        System.out.println(3 * x1); // 27

        // 9
        int density;
        density = 999;
        String cat;
        if (density > 3000){
            cat = "urban";
        }
        else if (density > 999){
            cat = "suburban";
        }
        else {
            cat = "rural";
        }
        System.out.println(cat); 

        // 11
        // Correct isLeapYear
        int val;
        val = 1900; 
        boolean isLeapYear = false;

        if (val % 100 == 0){
            if (val % 400 == 0){
                isLeapYear = true;
            }
        }
        else{
            if (val % 4 == 0){
                isLeapYear = true;
            }
        }

        System.out.println(isLeapYear); // 1900 should be false

        // 13
        int choice;
        choice = 12;

        // Code A
        if (choice > 10){
            System.out.println("blue"); // choice > 10 -> blue
        }
        else if (choice < 5){
            System.out.println("red");
        }
        else {
            System.out.println("yellow"); 
        };
        
        // Code B
        if (choice > 10){
            System.out.println("blue"); // choice > 10 -> blue
        }
        if (choice < 5){
            System.out.println("red");
        }
        else {
            System.out.println("yellow"); // choice > 10 -> also yellow
        };

        // 14
        int grade;
        grade = 60;
        double points = 0.0;
        double points1 = 0.0;
        
        // Code I
        if (grade > 89){
            points += 4.0;
        }
        else if (grade > 79){
            points += 3.0;
        }
        else if (grade > 69){
            points += 2.0;
        }
        else {
            points += 0.0;
        }
        System.out.println(points);

        // Code II
        if (grade > 89){
            points1 += 4.0;
        }
        if (grade > 79){
            points1 += 3.0;
        }
        if (grade > 69){
            points1 += 2.0;
        }
        if (grade < 70){
            points1 += 0.0;
        }
        System.out.println(points1);

        // 15
        int A = 5;
        int B = 15;
        int C = 5;

        if (A < 10){ // true
            if (B < 10){ // false
                System.out.print("X");
            }
            System.out.print("Y"); // goes here
        }
        if (C < 10){ // true
            if (B > 10){ // true
                System.out.print("Y"); // goes here
            }
            else { 
                System.out.print("Z");
            }
        }
        // final message:"YY"

        System.out.println();

        // 17
        int result = pick(false, pick(true, 0, 1), pick(true, 6, 7));
        System.out.println(result); // 6

        // 18
        int largest = biggest(9, 9, 5);
        System.out.println(largest); // 5 - wrong
        // error: this can't work when a and b are equal, while c is the smallest

        // 19
        int score;
        score = 83;
        String grade1 = "A";
        String grade2 = "A";
        String grade3 = "A";

        // Code I
        if (score >= 93){
            grade1 = "A";
        }
        if (score >= 84 && score <= 92){
            grade1 = "B";
        }
        if (score >= 75 && score <= 83){
            grade1 = "C";
        }
        if (score < 75){
            grade1 = "F";
        }
        System.out.println(grade1);

        // Code II
        // if (score >= 93){
        //     grade2 = "A";
        // }
        // if (84 <= score <= 92){ // in Java, you can't use (a <= x <= b) or (a >= x >= b)
        //     grade2 = "B";
        // }
        // if (75 <= score <= 83){ // The operator <= is undefined for the argument type(s) boolean, int
        //     grade2 = "C";
        // }
        // if (score < 75){
        //     grade2 = "F";
        // }
        // System.out.println(grade2);

        // Code III
        if (score >= 93){
            grade3 = "A";
        }
        else if (score >= 84){
            grade3 = "B";
        }
        else if (score >= 75){
            grade3 = "C";
        }
        else {
            grade3 = "F";
        }
        System.out.println(grade3);

        // 22
        int volume;
        volume = 115;
        String carClass = "";

        if (volume >= 120){
            carClass = "Large";
        }
        else if (volume < 120){ // only volume btw 110 ~ 119 (inclusive) work as intended
            carClass = "Midsize"; 
        }
        else if (volume < 110){
            carClass = "Compact";
        }
        else if (volume < 100){
            carClass = "Subcompact";
        }
        else {
            carClass = "Mini";
        }
        System.out.println(carClass);

        // 26
        if (false && true || false){  // this is never true
            System.out.println("...");  // never executed
        }
        if (true || true && false){ 
            // true && false is first evaluated -> F; then T || F -> T
            System.out.println("Third");
        }

        // 27
        int start = 4;
        int end = 5;
        boolean keepGoing = true;

        if (start < end && keepGoing){  // true
            if (end > 0){  // true
                start += 2;
                end ++;
            }
            else {
                end += 3;
            }
        }
        if (start < end){ // by now, end = start = 6 -> false
            // all of these will not be executed
            if (end == 0){
                end += 2;
                start ++;
            }
            else {
                end += 4;
            }
        }
        System.out.println(end); // 6

        // 41
        boolean t = false;
        boolean f = false;
        System.out.println(t && !(t || f)); // this is always false

        // 42
        System.out.println((t && f) && !(t || f)); // this is always false

        // 43
        int X = 1200;
        int Y = 1000;
        System.out.println((Y > 10000) || (X > 1000 && X < 1500));
        System.out.println((Y > 10000 || X > 1000) && (Y > 10000 || X < 1500));

        // 49
        String alpha = "APCS";
        String beta = "APCS";
        String delta = alpha;

        System.out.println(alpha.equals(beta));
        System.out.println(beta.equals(delta));
        System.out.println(alpha.equals(delta));
        System.out.println(alpha == beta);
        System.out.println(alpha == delta);
        System.out.println(beta == delta); 
        // Never Use == to Compare Two String Objects
        // NOTE: We used the double equals (==) to compare if two numbers were the same. 
        // However, == does not correctly tell you if two strings are the same. 
        // What’s worse is that comparing two strings using == does not throw an error; 
        // it simply compares whether or not the two String references point to the same object. 
        // Even worse is that sometimes it appears to work correctly. Just don’t do it!

       
    }

}
