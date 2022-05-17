//package Test;

import java.util.Random;
import java.util.Vector;

public class RandomNum {

	public Vector<Integer> checkDuRandom() {
				Vector<Integer> v=new Vector<Integer>();
				Random rand=new Random();
				while(v.size()!=4) {
					int num=rand.nextInt(8)+1;
					if(!v.contains(num)) {
						v.addElement(num);				
					}
				}
				//System.out.println(v);
				return v;
			}

		 

}
