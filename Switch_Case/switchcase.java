package Switch_Case;
import java.util.Scanner;

public class switchcase {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        

        System.out.println("Enter the operator: ");
        char op = sc.next().charAt(0);
        sc.close();

        switch(op){
            case '+' :
                ans = a+b;
                // System.out.println(ans);
                break;
            case '-':
                ans = a-b;
                // System.out.println(ans);
                break;
            case '*' :
                ans = a*b;
                // System.out.println(ans);
                break;
            case '/' :
                ans = a/b;
                // System.out.println(ans);
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
        System.out.println(ans);
        
    }
}
