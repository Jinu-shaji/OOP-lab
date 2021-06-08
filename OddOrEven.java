import java.util.*;
class OddOrEven{
public static void main(String args[])
{
 Scanner num=new Scanner(System.in);
 System.out.println("Enter a number : ");
 int n=num.nextInt();
 if(n%2==0){
 System.out.println("Given number ("+n+") is EVEN number");
 }
 else
 {
 System.out.println("Given number ("+n+") is  ODD number");
}
 
}
}