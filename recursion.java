public class recursion {
    public static void main(String[] args) {
        printDown(5);
    }
    static void printDown(int i){
        System.out.println(i);
        if (i>1)
            printDown(i-1);
    }
}
