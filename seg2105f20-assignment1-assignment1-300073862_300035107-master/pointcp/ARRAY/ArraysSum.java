import java.util.*;
public class ArraysSum{
	
	public static void main(String[] args) {


		String chars = "abcdefghijklmnopqrstuvwxyz";
		//System.out.println(chars.charAt((int)(Math.random() * 26)));
		char[] array = new char[20000000];
		LinkedList linklist = new LinkedList();
		Vector v = new Vector();

		for (int i=0;i<array.length;i++){
			array[i]=chars.charAt((int)(Math.random() * 26));
		}

		for (int i=0;i<20000000;i++){
			linklist.add(chars.charAt((int)(Math.random() * 26)));
		}

		for (int i=0;i<20000000;i++){
			v.add(chars.charAt((int)(Math.random() * 26)));
		}
	
		long start3 = System.currentTimeMillis();
		int sum1 = 0;
		for(int i=0;i<array.length;i++){
			sum1 = sum1+array[i];
		}
		long finish3 = System.currentTimeMillis();
		long result3 = finish3-start3;

		Iterator<Character> itr = linklist.iterator();
		long start1 = System.currentTimeMillis();
		int sum2 = 0;
		while(itr.hasNext()){
			char element = itr.next();
			sum2 = sum2+element;
		}
		long finish1 = System.currentTimeMillis();
		long result1 = finish1-start1;

		Iterator<Character> itr2 = v.iterator();
		long start2 = System.currentTimeMillis();
		int sum3 = 0;
		while(itr2.hasNext()){
			char element = itr2.next();
			sum3 = sum3+element;
		}
		long finish2 = System.currentTimeMillis();
		long result2 = finish2-start2;

		System.out.println("Array result: "+sum1+" time: "+result3);
		System.out.println("LinkedList result: "+sum2+" time: "+result1);
		System.out.println("Vector result: "+sum3+" time: "+result2);


	}


	

}