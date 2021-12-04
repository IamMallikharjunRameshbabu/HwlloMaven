package reCaphello;

import java.util.Set;
import java.util.TreeSet;

class a{
	int a=20;
}

class hwllo {
	public static void main(String[] args) {
		a m=new a();
		a m2=new a();
		
		Set<a> my= new TreeSet<a>();
		
		my.add(m);
		my.add(m2);
		
		System.out.println(my);
		
	}
}
