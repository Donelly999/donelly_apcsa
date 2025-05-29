public class code {
    public static int someCode(int aa, int bb, int cc){
        // 40
        if ((aa < bb) && (bb < cc)){
            return aa;
        }
        if ((aa >= bb) && (aa >= cc)){
            return bb; 
        }
        if ((aa == bb) || (aa == cc) || (bb == cc)){
            return cc;
        }
        else{ 
            // you need this to cover all cases and ensure there's a return
            return 10;}
    }
    public static void main(String[] args) {
        System.out.println(someCode(6, 8, 8));
    }
        
}
