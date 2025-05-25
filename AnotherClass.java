public class AnotherClass {
    private static int val = 31;
    private String data;

    public AnotherClass(String s) {
        data = s;
        val /= 2;
    }

    public void join(String s){
        data = data + s;
    }

    public void setData(String s){
        data = s;
    }

    public String getData(){
        return data;
    }
    
    public int getVal(){
        return val;
    }

    public static void main(String[] args) {
        // 14
        AnotherClass word = new AnotherClass("Hello");
        word.join("Hello");
        System.out.println(word.getData()); // word = "HelloHello"
        AnotherClass sentence = new AnotherClass(word.getData());
        sentence.join("Hi"); 
        System.out.println(sentence.getData()); // sentence = "HelloHelloHi"
        word.setData(sentence.getData());
        System.out.println(word.getData()); // word = "HelloHelloHi"
        word.join("Hello");
        System.out.println(word.getData()); // word = "HelloHelloHiHello"
        sentence.join("Hi");
        System.out.println(sentence.getData()); // sentence = "HelloHelloHiHi"
        sentence.setData("Hi");
        System.out.println(sentence.getData()); // sentence = "Hi"
        System.out.println(word.getVal()); // val = 7

    }
}

