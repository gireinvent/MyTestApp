package org.sushma.testApp;

import java.util.ArrayList;

public class Source {

	public static void result (int[] list1,int[] list2)
	{
		ArrayList<Integer> x=new ArrayList<Integer>();
		for (Integer value : list1) {
			x.add(value);
		}

		ArrayList<Integer> y=new ArrayList<Integer>();
		for (Integer value : list2) {
			y.add(value);
		}
		System.out.println("---input---");
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("---output---");

		if(list1.length>list2.length)
		{
			x.removeAll(y);
			System.out.println(x);
		}
		else
		{
			y.removeAll(x);
			System.out.println(y);
		}
	}
	public static void main(String[] args) 
	{

		int[] x={13, 5, 6, 2, 5};
		int[] y={5, 2, 5, 13};

		result(x, y);

		int[] x1={14,27,1,4,2,50,3,1};
		int[] y1={2, 4, -4, 3, 1, 1, 14, 27, 50};
		result(x1,y1);
	}

}
