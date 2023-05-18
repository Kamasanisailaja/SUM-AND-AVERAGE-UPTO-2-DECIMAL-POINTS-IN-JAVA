import java.util.*;
class Sumavg {
     public static void main(String[] args) {
         int a,b,c;
         float avg,s;
        System.out.println("enter the value of a");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("enter the value of b");
        b=sc.nextInt();
          System.out.println("enter the value of ");
        c=sc.nextInt();
        s=(a+b+c);
        //System.out.printf("sum of %d,%d and %d  is %.2f\n",a,b,c,s);
        System.out.printf("sum = %.2f\n",s);
        avg=(s/3);
         System.out.printf("avg = %.2f\n",avg);
        // System.out.printf("sum of "+a+","+b+" and "+c+"  is %2.f\n ",avg);
    }
}

