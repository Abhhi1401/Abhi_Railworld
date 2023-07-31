package com.railworld;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TreeMap<String , String> tp = new TreeMap<>();
//		
//		tp.put("Khushi","Mumbai");
//		tp.put("lisa","Hydrabad");
//		tp.put("Tiya","Chennai");
//		tp.put("yash","Bangaluru");
//		tp.put("riya","Patna");
//		System.out.println(tp);
		
		
		//treeset
		TreeSet<Person> st=new TreeSet<>();
		st.add(new Person("khushi",112,22,"female",30000));
		st.add(new Person("yash",113,42,"male",40000));
		st.add(new Person("jay",113,25,"male",50000));
		
		for(Person pr : st) {
			System.out.println(pr);
		}
		 
		
		 	
		}
		

	}


