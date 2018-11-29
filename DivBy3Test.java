/*
* @author Owen Brown
* Uploaded: November 29, 2018
* This program is a simple counting game that either adds 1 or subtracts 1 from a number to make it divisible by 3. 
    The program uses recusion and will continue to divide the number until it reaches 1.
*/

import java.util.*;

public class DivBy3Test {
    public static void main(String[] args) {
        System.out.print("? ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(div(num));
    }
    public static int div(int n) {
        if(n == 1)
            return 1;
        if(n % 3 == 0) 
            System.out.println(n);
        return (n % 3 > 0) ? ( (n % 3 == 1) ? div(n-1) : div(n+1) ) : div(n/3);  
    }
}
