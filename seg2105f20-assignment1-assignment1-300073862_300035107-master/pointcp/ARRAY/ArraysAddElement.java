import java.util.*;
public class ArraysAddElement{
	
	public static void main(String[] args) {


		String chars = "abcdefghijklmnopqrstuvwxyz";
		//System.out.println(chars.charAt((int)(Math.random() * 26)));
		char[] array = new char[20000000];
		LinkedList linklist = new LinkedList();
		Vector v = new Vector();
		long start1 = System.currentTimeMillis();
		for (int i=0;i<array.length;i++){
			array[i]=chars.charAt((int)(Math.random() * 26));
		}
		long finish1 = System.currentTimeMillis();
		long result1 = finish1-start1;

		long start2 = System.currentTimeMillis();
		for (int i=0;i<20000000;i++){
			linklist.add(chars.charAt((int)(Math.random() * 26)));
		}
		long finish2 = System.currentTimeMillis();
		long result2 = finish2-start2;

		long start3 = System.currentTimeMillis();
		for (int i=0;i<20000000;i++){
			v.add(chars.charAt((int)(Math.random() * 26)));
		}

		long finish3 = System.currentTimeMillis();
		long result3 = finish3-start3;

		System.out.println("Adding time: "+result1);
		System.out.println("Adding time: "+result2);
		System.out.println("Adding time: "+result3);

	}
}