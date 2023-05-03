import java.util.*;
public class Q5 {
    public static int sum_of_Digits(int n){
        int no=n;
        int r;
        int sum=0;
        while(no!=0){
            r=no%10;
            sum+=r;
            no/=10;
        }
        return sum;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum= sum_of_Digits(n);
        while(sum>=9){
            sum=sum_of_Digits(sum);
        }
        System.out.println("sum od digit of " + n + " until the number is a single digit is " + sum);
        sc.close();
    }
    
}
