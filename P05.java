import java.util.Scanner;

class P05 {
    public static void main(String[] args)  
    { 
        Scanner sc = new Scanner(System.in); 
        int num=0; 
        System.out.println("\nEnter Number : "); 
        num = sc.nextInt(); 
        int len = String.valueOf(num).length(); 
        int temp = num; 
        int sum=0; 
        while (temp != 0)  
        { 
            int digit = temp % 10; 
            sum +=  Math.pow(digit, len); 
            temp = temp / 10; 
        } 
        if(sum == num) 
        { 
            System.out.println(num+" is Armstrong Number"); 
        } 
        else 
        { 
            System.out.println(num+" is not Armstrong Number"); 
        } 
    }     
}
