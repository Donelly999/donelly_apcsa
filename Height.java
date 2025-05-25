public class Height {
    // a. 2 instance variables - feet and inches
    private int feet;
    private int inches;

    // b. 2 constructors 
    public Height(int myFeet, int myInches){ // 2 parameters
        feet = myFeet;
        inches = myInches;
        // remember to call the simplify() here
        simplify();
    }

    public Height(int myInches){ // single parameter
        inches = myInches;
        // remember to call the simplify() here
        simplify();
    }

    // c. simplify() method
    public void simplify(){
        if (inches >= 12){
            feet += inches / 12;
            inches %= 12;
        }
    }

    // d. add(int inches) method
    public void add(int moreInches){
        inches += moreInches;
        // remember to call the simplify() here
        simplify();
    }

    // e. add(Height ht) method
    public void add(Height ht){
        feet += ht.getFeet();
        inches += ht.getFeet();
        // remember to call the simplify() here
        simplify();
    }

    // f. Accessor (getter) methods
    public int getFeet(){
        return feet;
    }

    public int getInches(){
        return inches;
    }

    // Example run 
    public static void main(String[] args) {
        // new Height Object - ht
        Height height = new Height(5, 25);
        System.out.println(height.getFeet());
        System.out.println(height.getInches());
    }
}
