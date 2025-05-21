public class Unit1Practice {
    public static void main(String[] args) {
        // 1
        System.out.print("Hello System.out.println");
        System.out.print("!!!"); // B

        // 2
        // System.out.print(*); // error: should be in " "
        // System.out.print("*"); 
        // System.out.println(); 
        // System.out.println("*"); 
        
        System.out.println(); // new line

        // 3
        System.out.print("*"); 
        System.out.println("**"); 
        System.out.println("***"); 
        System.out.print("****");

        System.out.println(); // new line

        // 4
        // System.out.print("*");
        int x = 5;
        int y = 6;
        int z = 0; // missing code 1
        int z1; // missing code 2
        // boolean z3 = false; // missing code 3 
        z = (x + y) / 2;
        z1 = (x + y) / 2;
        System.out.println(z);
        System.out.println(z1);
        // System.out.println(z3); // wrong: cannot convert from boolean to int

        // 6
        final double pi = 3.14159; // i think using final is better; 
        double d = 1.5;
        double c;
        c = pi * d;
        System.out.println(c);

        // 8
        int n = 2;
        int result = (n + 1) * 2;
        System.out.println(result);

        // 10
        System.out.println(9 + 10 % 12); // 19
        System.out.println((9 + 10) % 12); // 7
        System.out.println(9 - 2 % 12); //7

        System.out.println(); // new line

        // 16
        int a = 5;
        a += 6 * 2;
        a -= 3 / 2;
        System.out.println(a); // 16

        // 18
        System.out.println(404 / 10 * 10 + 1); // 401
        
        // 19
        int a1 = 5;
        int b1 = 2;
        double c1 = 3.0;
        System.out.println(5 + a1 / b1 * c1 - 1); // should be 10
        
        // 24
        double m = (int) (5.5 - 2.5);
        double n1 = (int) 5.5 -  2.5;
        System.out.println(m - n1); // 0.5

    }
}
