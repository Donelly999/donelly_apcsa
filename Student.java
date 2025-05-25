public class Student{

    private String name;
    private double gpa;

    public Student(String newName, double newGpa) {
        name = newName;
        gpa = newGpa;
    }

    public String getName() {
        return name;
    }

    // 5
    public void setGpa(double newGpa) {
        gpa = newGpa;
    }

    // I have to add this otherwise #6 couldn't worl
    public double getGpa() {
        return gpa;
    }

    // 7-8
    public int calculate(int a, int b) {
        a = a - b;
        int c = b;
        b = a * a;
        a = b - (a + c);
        return a;
    }
    
    // 12
    // public int mystery(int a, int b, int c){ 
    //     if (a < b && a < c){
    //         return a;
    //     }
    //     if (b < a && b < c){
    //         return b;
    //     }
    //     if (c < a && c < b){
    //         return c;
    //     }
    // } /
    // error: This method must return a result of type int

    public static void main(String[] args) {

        // 6
        Student s1 = new Student("Brody Kai", 3.9);
        Student s2 = new Student("Charlie Cole", 3.2);
        s2 = s1; // s2 now refers to the same object as s1
        s2.setGpa(4.0);
        System.out.println(s1.getName() + ": " + s1.getGpa()); // prints: Brody Kai: 4.0

        // 8
        int a = 9;
        int b = 2;
        int c = s1.calculate(a, b);
        System.out.println(a + " " + b + " " + c); // prints 9 2 40
    }
}