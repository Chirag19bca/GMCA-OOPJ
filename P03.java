import java.util.*;
class P03
{
    public static void main(String args[])
    {
         int num,rev=0; 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Number: "); 
        num = sc.nextInt(); 
        int temp = num; 
        while (temp != 0)  
        { 
            int digit = temp % 10; 
            rev = rev * 10 + digit; 
            temp = temp/10; 
        } 
        if(rev == num) 
        { 
            System.out.println(rev+" is Palidrome Number"); 
        } 
        else 
        { 
            System.out.println(rev+" is NOT Palidrome Number"); 
        } 
    }
}