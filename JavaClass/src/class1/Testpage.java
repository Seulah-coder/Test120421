package class1;

import java.util.Scanner;
public class Testpage {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int t = 0;
        t = scan.nextInt();
        int sum = 0;
		for(int i=1; i<=t; i++) {
			
			 int a = scan.nextInt();
		     int b = scan.nextInt();
            sum = a + b;
            System.out.println("case#" + i +":" +sum);
		}
			
			
        
        scan.close();
    }
}



