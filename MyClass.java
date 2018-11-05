package com.my.pratice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class MyClass {
public static void main(String[] args) throws ParseException {
/**********************Printing Elements of an Array**************************************/
	
	String[] s = new String[] {"singh", "payal", "vijay"};
	for(String item : s)
	System.out.print(item+" ");
	
/************************Printing Elements of a List ************************************/	
	
	List<String> l1 = Arrays.asList(s);
	System.out.println(l1);
	
/**************************** Simple DATE FORMATTER*********************************************/	
	
	SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");
	Date dt = ft.parse("23/08/2015");
	System.out.println(dt);
	
/********************************Stream in java 8***************************************************/	

	long count = l1.stream().filter(string -> string.length()==5).count();
	System.out.println(count);
	
	count = l1.stream().filter(inti -> inti.isEmpty()).count();
	System.out.println(count);
	
	List<String> filtered = l1.stream().filter(string -> string.length() < 3).collect(Collectors.toList());
	System.out.println(filtered);
	
	String AddToFiltered = l1.stream().filter(string -> string.length() > 3).collect(Collectors.joining(" "));
	System.out.println(AddToFiltered);
	
}
}



















