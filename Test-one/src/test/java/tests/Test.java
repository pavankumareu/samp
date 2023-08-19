package tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Test {
	//1678
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>() ;
		//list.add("pavan");
		list.add(1);
		list.add(20);
		list.add(10);
		list.add(22);
		
		//Collections.sort(list);
		System.out.println(list);
		//Collections.sort(list, new MyComparator());
		Collections.reverseOrder(new MyComparator());
		System.out.println(list);
		
		
		
		
		
	}

}
class MyComparator implements Comparator {
public int compare(Object obj1, Object obj2) {
	int i=0;
Integer I1 =(Integer)obj1;
Integer I2= (Integer)obj2;
i=I2.compareTo(I1);
System.out.println(i);
return i ;
}

private Integer Integer(Object obj1) {
	// TODO Auto-generated method stub
	return null;
}}
