//package Test;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class NumberGameVector {
	
	public static void main(String[] args) {		
		System.out.println("**Hello! Welcome from Number Matching Game!**\n***Good Luck***\n");
		System.out.println("~~You Have only Seven Chances~~");
		RandomNum obj=new RandomNum();
		Vector<Integer> num;
		num=obj.checkDuRandom();
		UserInput ui=new UserInput();
		ui.numberChecking(num);
	}	
}



 