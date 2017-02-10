package test;

import java.io.UnsupportedEncodingException;

public class testBytes {

	public static FinalClass finalclass = new FinalClass();
	
	public static void main(String args[]) throws UnsupportedEncodingException{
	
	     /*  finalclass.setName("123");
	       finalclass.setValue("1245");
	       System.out.println(finalclass.getName());
	       finalclass.setName("5678");
	       System.out.println(finalclass.getName());*/
		/*String str ="123";
		int strLength = 8;
		int strLen = str.length();
        StringBuffer sb = new StringBuffer();
        sb.append(str);
         while (strLen < strLength) {
               //sb.append("0").append(str);// 左(前)补0
               sb.append("0");//右(后)补0
               strLen = sb.length();
         }
        System.out.println(sb.toString());*/
		String string = "2011-09-21 03:31:52|520.0|RMB|3F020000401|20110920|1723006|0511092021433677|Y|20060301|b42b1f98b708aeb0993c89dae4946fbf";
	    String[] bt = string.split("\\|");
	    System.out.println(bt.length+"   "+bt[0]);
	}
}
