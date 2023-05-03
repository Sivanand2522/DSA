import java.util.*;
public class Q3 {
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int sum=0;
        int n;
        int prd=1;
        System.out.print("Enter a number: ");
        int no=sc.nextInt();
        int num=no;
        while(num!=0){
            n=num%10;
            sum+=n;
            prd*=n;
            num=num/10;
        }
        sc.close();
        if(sum==prd){
            System.out.println(no+" is a spy number.");
        }
        else{
            System.out.println(no+" is not a spy number.");
        }
    }
}
