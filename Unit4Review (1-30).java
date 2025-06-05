package Unit4;

public class Unit4Review {
    public static void main(String[] args) {
        // 9
        double count = 6.0;
        for (int num = 0; num < 5; num++){
            if (count != 0 && num / count > 0){ 
            // after the 3rd round when count becomes 0.0
            // why wouldn't (num/count) triggers ArithmeticException???
            // note: if count=0, the first half (count != 0) already evaluates to false, so it will not cause the error

                count -= num;
                System.out.println(count);
            }
        }
        System.out.println(count); // 0.0 
    }
}
