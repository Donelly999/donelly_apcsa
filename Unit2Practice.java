public class Unit2Practice {
    // 6
    public static boolean containArt(String s1, String s2, String s3){
        String all = s1 + s2 + s3;
        return(all.indexOf("art") != -1);
    }

    // 7
    public static void processWords(String word1, String word2){
        String str1 = word1.substring(0, 2);
        String str2 = word2.substring(word2.length()-1);
        System.out.println(str2);
        String result = str2 + str1;
        System.out.println(result); 
        // result is always the last digit of str2 + first 2 digits of str1
        
        System.out.println(result.indexOf(str2)); // 0
    }

    // 8
    public static String scramble(String word, int howFar){
        return word.substring(howFar + 1, word.length())
        + word.substring(0, howFar);
    }

    // 9
    public static double calculate(double x, double y, double a, double b){
        // missing code: 
        return Math.sqrt(Math.pow((x+y),2) / Math.abs(a-b));
    }

    // 12
    public static void randInt(int min, int max){
        double rn3 = Math.random();
        int num = (int)(rn3 * (max - min + 1)) + min;
        System.out.println(num);
    }
        
    // 15
    public static double getHours(int marker1, int marker2){
        // missing code:
        double hours = Math.abs(marker1 - marker2) / 60.0;
        return hours;
    }

    // 18
    public static double puzzle(int x){
        Double y = x / 2.0;
        y /= 2;
        return y.doubleValue(); // same as return y because y is alread a double
    }
    
    // 19
    public static void doSomething(){
        System.out.println("Something has been done");
    }

    // 20
    public static void slope(int x1, int y1, int x2, int y2){
        int xChange = x2 - x1;
        int yChange = y2 - y1;
        printFraction(yChange, xChange);
    }

    public static void printFraction(int numerator, int denominator){
        System.out.println(numerator + "/" + denominator);
    }

    // 21
    public static void printSum(int x, double y){
        System.out.println(x + y);
    }

    public static void printProduct(double x, int y){
        System.out.println(x * y);
    }
    
    // 22
    public static double myMethod(int a, boolean b){
        // example code: 
        if (b == true){
            double c = a;
            return c;
        }
        else{
            double d = a + 2;
            return d;
        }    
    }

    // 23
    public static double sumOfGrades(){
        // returns the sum of all of the student's grades
        return 760.0;
    }

    public static int numberOfGrades(){
        // returns the total number of grades the student has received
        return 11;
    }

    public static double lowestGrade(){
        // returns the lowest grade the student has received
        return 60.0;
    }

    // 24
    public static int function1(int i, int j){
        return i + j;
    }

    public static int function2 (int i, int j){
        return j - i;
    }

    public static void main(String[] args) {
        // 1
        String str = "0";
        str += str + 0 + 8;
        System.out.println(str); // "0008"

        // 2
        int a = 1998;
        int b = 1990;
        String claim = " that the world's athletes " + "competed in Olympic games in ";
        String s = "It is " + true + claim + a + " but " + false + claim + b;
        System.out.println(s); 
        // "It is true that the world's athletes competed in Olympic games in 1998 but false that the world's athletes competed in Olympic games in 1990"

        // 3
        String oldStr = "ABCDEF";
        String newStr = oldStr.substring(1, 3) 
        + oldStr.substring(4); // "BC" + "EF"
        System.out.println(newStr); // "BCEF"

        // 4
        String temp = "comp";
        System.out.print(temp.substring(0) + " "
        + temp.substring(1) + " " 
        + temp.substring(2) + " "
        + temp.substring(3)); // "comp omp mp p"

        // 5
        String str1 = "CompSci";
        System.out.println(str1.substring(0, 3));
        int num = str1.length();
        System.out.println(num); // "7"

        // 6
        System.out.println(containArt("rattrap", "similar", "today"));
        // returns true but the intended should be false

        // 7
        processWords("ABCD", "1234"); // always prints 0

        // 8
        System.out.println(scramble("compiler", 3)); // "ilercom"

        // 9 
        System.out.println(calculate(1, 2, 3, 4)); // 3.0

        // 10
        int rn = (int)(Math.random() * 10) + 1;
        System.out.println(rn); // randInt(1, 10) inclusive

        // 11
        int rn1 = (int)(Math.random() * 36) + 25;
        System.out.println(rn1); // randInt(25, 60) inclusive

        // 12
        randInt(1, 100);

        // 13
        double d = Math.random();
        double r;
        r = d * 5.0 + 0.5;
        System.out.println(r); // want: 0.5 <= r < 5

        // 14
        int sum = 2 + (int)(Math.random() * 6) + (int)(Math.random() * 6);
        System.out.println(sum); // simulation for sum of 2 cubes

        // 15
        System.out.println(getHours(100, 220)); // 2.0
        System.out.println(getHours(100, 70)); // 0.5

        // 16
        int a1 = 3;
        int b1 = a1 + (int)(Math.random() * a1);
        System.out.println(b1); // randInt(3, 5) inclusive

        // 17
        double d1 = 10.0;
        Double d2 = 20.0;
        Double d3 = new Double(30.0);
        double d4 = new Double(40.0);
        System.out.println(d1 + d2 + d3.doubleValue() + d4); // 100.0 ??

        // 18
        System.out.println(puzzle(3)); // 0.75

        // 19
        doSomething();

        // String output = doSomething(); 
        // Type mismatch: cannot convert from void to String

        // System.out.println(doSomething()); 
        //println(boolean) is not applicable for the arguments (void)

        // 20
        slope(1, 2, 5, 10); // prints: 8/4

        // 21
        int num1 = 5;
        double num2 = 10.0;
        printSum(num1, num2);
        // printProduct(num1, num2); 
        // error: printProduct(double, int) is not applicable for the arguments (int, double)

        // 22
        double result = myMethod(0, false);
        System.out.println(result);

        // 23
        double newAverage = (sumOfGrades() - lowestGrade()) / (numberOfGrades() - 1);
        System.out.println(newAverage); // average except for the lowest grade

        // 24
        int x = function1(4, 5) + function2(1, 3);
        System.out.println(x); // x = 11
    }
}
