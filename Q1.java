import java.util.*;
 class Q1{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int count=0;
        int no=sc.nextInt();
        while(no>2){
            no=no/2;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}