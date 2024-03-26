import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc=new 
Scanner(System.in);
System.out.print("enter a valid natural number : ");
int n=sc.nextInt();
 if (n%3==0&&n%5==0){
 System.out.print(n+" is divisible by 3 and 5");
 }else{
 System.out.print(n+" is not divisible by 3 and 5");
 }
 
}
}