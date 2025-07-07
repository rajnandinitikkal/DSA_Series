package Functions;
public class function {
    // static int add(int a, int b){
    // int sum = a+b;
    // return sum;
    // }

    // static int Area(int l, int b){
    //     int area = l*b;
    //     return area;
    // }

    static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        
        System.out.println(factorial(10));
        // System.out.println(Area(4,6));
        // System.out.println(add(1,2));
    }
}
