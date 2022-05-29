public class Met {
    public static void main (String args[]) {
        int a = 1;
        int b = 2;
        sum(a,b);
        subt(a,b);
        mult(a,b);
        div(a,b);

    }
    static void sum(int x, int y) {
        int z = x + y;
        System.out.println(z);
    }
    static void subt(int x, int y) {
        int z= x - y;
        System.out.println(z);
    }
    static void mult(int x, int y){
        int z = x * y;
        System.out.println(z);
    }
    static void div(int x, int y){
        int z= x / y;
        System.out.println(z);
    }
}


