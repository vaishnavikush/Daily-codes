package Day2Package;
import java.util.Scanner;
public class SumThreeNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int n1=sc.nextInt();
        System.out.println("First Number is:"+n1);

        System.out.println("Enter Second Number");
        int n2=sc.nextInt();
        System.out.println("Second Number is:"+n2);

        System.out.println("Enter Third Number");
        int n3=sc.nextInt();
        System.out.println("Third Number is:"+n3);

        int total=n1+n2+n3;
        System.out.println("Sum Of These Three Numbers Are:"+total);
    }
}
