package test;

import java.util.ArrayList;
import java.util.List;


public class testStatic {

	public static final List<FinalClass> cities = new ArrayList<FinalClass>();
	
	public static void main(String args[]){
		new testStatic().meth();
	}
	public void meth(){
		FinalClass fin = new FinalClass();
		fin.setName("123");
		fin.setValue("46");
		cities.add(fin);
		for(FinalClass fin2:cities){
			System.out.println(fin2.getName()+"   "+fin2.getValue());
		}
	}
}
