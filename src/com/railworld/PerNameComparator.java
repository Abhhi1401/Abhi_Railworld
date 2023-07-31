package com.railworld;

import java.util.Comparator;

public class PerNameComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		if(o1.getName().compareTo(o2.getName())>0) {
			return 1;
		}else {
			return -1;
		}
		 
	}

}
