import java.util.Scanner;

class P06 {
    public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter First Number : "); 
        int a = sc.nextInt(); 
        System.out.print("Enter Second  Number : "); 
        int b = sc.nextInt(); 
        System.out.print("Enter Third Number : "); 
        int c = sc.nextInt(); 
 
        int min = (a<b ? ((a<c) ? a : c) : ((b<c) ? b : c)); 
        System.out.print("Minimum is "+min); 
    }
}
