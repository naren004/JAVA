import java.util.*;
public class Main
{
public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("enter a char : ");
 char n=scanner.next().toUpperCase().charAt(0);
 
 switch(n){
 case 'A':{
 System.out.println("vowel");
 break;
 }
 case 'E':{
 System.out.println("vowel");
 break;
 }
 case 'I':{
 System.out.println("vowel");
 break;
 }
 case 'O':{
 System.out.println("vowel");
 break;
 }
 case 'U':{
 System.out.println("vowel");
 break;
 }
 default:{
 System.out.print("consonant");
 }
 }
 
}
}