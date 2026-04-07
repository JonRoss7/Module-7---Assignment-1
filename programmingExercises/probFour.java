public class probFour {
    static int a = 5;
    
    static int fun() {
        a = 17;
        return 3;
    }
    
    public static void main(String[] args) {
        int b = a + fun();
        System.out.println("Result: " + b);
    }
}