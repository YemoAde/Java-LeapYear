import java.io.*;
import java.lang.*;
import java.util.*;

public class Leap {
	public static void main(String[] args){
		String year;
		
		int val = 0;
		while(val == 0){
			System.out.println("Enter Year");
			year = new Scanner(System.in).nextLine();
			System.out.println(year);
			if(year.length() == 4){
				val = 1;
				int value = Integer.parseInt(year);
				if ((Math.abs(2008 - value) % 4) > 1){
					System.out.println("Not a Leap Year");
				}
				else{
					System.out.println("Leap Year");
				}
		
			}
			else{
				System.out.println("A Year has 4 digits");
			}
		}
		
		

		
	}
}