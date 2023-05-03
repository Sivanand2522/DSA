import java.util.*;
public class Q2 {
    public static void main(String[]args){
        int weight,height;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the weight(kg) and height(meter) of your body");
        weight=sc.nextInt();
        height=sc.nextInt();
        double BHM=(float) weight/Math.pow(height,2);
        if(BHM<18.5){
            System.out.println("This person is Underwight");
        }
        else if(BHM<24.9 && BHM>18.5){
            System.out.println("This person is Normal weight");
        }
        else if(BHM>25.0 && BHM<29.9){
            System.out.println("This person is Over weight");
        }
        else if(BHM>30.0){
            System.out.println("This person is Obese");
        }
        sc.close();
    }
}
