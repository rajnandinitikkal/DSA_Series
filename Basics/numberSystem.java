import java.util.Scanner;

class numberSystem{

    public static void decimalToBinary(int n){
        while(n>0){
            int bit = n%2;
            System.out.print(bit);
            n = n/2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        decimalToBinary(n);

        sc.close();
    }
}