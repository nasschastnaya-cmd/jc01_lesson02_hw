package edu.jc1.les02.task02;

public class Task04 {

	public static void main(String[] args) {
		// Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров молока в m больших
		//бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?
		
		int n;
		int m;
		
		n = 8;
		m = 12;	
		
		double sb;
		double lb;
		
		double sumsb;
		double sumlb;
		
		
		sumsb = 80;
		
	    sb = sumsb/n;
		lb = sb + 12;
		sumlb = lb * m;
		
		
		
		System.out.println("В больших бедонах = " + sumlb + " л. молока");
	}

}
