//package Test;

import java.util.Scanner;
import java.util.Vector;

public class UserInput {
	public static Scanner s=new Scanner(System.in);
	
	
	
	public Vector<Integer> checkDuUser() {
		Vector<Integer> v=new Vector<Integer>();
		int flag=0;
		while(flag==0) {
		System.out.print("Enter 4 numbers between 1~9: ");
		String input=s.nextLine();
		int num;
		int i;
		
		if(input.length()>=4) {
				for(i=0;i<4;) {
				if(!Character.isDigit(input.charAt(i))) {
					System.err.println("User input must be digit");
					flag=0;v.removeAllElements();
					break;
				}else {
					flag=1;
					num=Character.getNumericValue(input.substring(0,4).charAt(i));
					if(!v.contains(num)) {
						v.addElement(num);
						i++;
					}else {
						System.err.println("Duplicate Number!!!");
						v.removeAllElements();
						System.out.print("Enter 4 numbers between 1~9:");
						input=s.nextLine();
						i=0;							
					}
				}	}	
		}else {
			flag=0;
			System.err.println("Input must be just 4 digits!!");
			break;
		}
	}
	
		System.out.println(v);
		return v;
	}
	
	 void numberChecking(Vector<Integer> num) {
		int bl=0,hit=0;
		RandomNum ng=new RandomNum();
		int count=0;
		while(hit!=4) {
			//System.out.println("hit"+hit);
			Vector<Integer> input=checkDuUser();
				for(int a=0;a<num.size();a++) {
					for(int b=0;b<input.size();b++) {
						if(num.get(a)==input.get(b) && a==b) {
							hit++;	
						}else if(num.get(a)==input.get(b) && a!=b) {
							bl++;
						}
					}
				}
				System.out.println(hit+"H "+bl+"B");
				
				if(hit==4) {
					count++;
					if(count<=2){
						System.out.println("Wow! Excellent** You tried only "+count+" times.");
					}else{
						System.out.println("** You tried only "+count+" times.");
					}
					System.out.println("*****************************");
					System.out.println("Congratulations! You Win");
					System.out.println("****************************");
					System.out.print("Do you want to play again y/n : ");
					String flag=s.nextLine();
					if(flag.equalsIgnoreCase("y")) {
						bl=0;hit=0;;
						num=ng.checkDuRandom();
					}else {
						System.out.println("Good Bye!");
						break;
					}
				}else {
					bl=0;hit=0;
					count++;
					if(count>=7) {
						System.out.println("Answer is "+num);
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("Sorry!Game Over~");
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.print("Do you want to play again y/n : ");
						String flag=s.nextLine();
						if(flag.equalsIgnoreCase("y")) {
							bl=0;hit=0;count=0;
							num=ng.checkDuRandom();
						}else {
							System.out.println("Good Bye!");
							break;
						}
					}
				}	
		}	
	}

}
