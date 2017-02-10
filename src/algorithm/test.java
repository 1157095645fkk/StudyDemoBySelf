package algorithm;

import java.beans.IntrospectionException;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;

public class test {

	public static void main(String args[]){
		/*Scanner scanner = new Scanner(System.in);
		int result = scanner.nextInt();
		int[] strings = new int[result];
        for(int i = 0; i<strings.length;i++){
        	strings[i]=scanner.nextInt();
        }*/
		Date stat = new Date();
		int[] strings = new int[1000];
		for(int i =0;i<strings.length;i++){
			strings[i]=i+2;
		}
        int per = 0;
        int A1 = 0;
        int b1 = 0;
        int A2 = 0;
        int b2 = 0;
        int A3 = 0;
        int b3 = 0;
        int A4 = 0;
        int b4 = 0;
        int A5 = 0;
        int b5 = 0;
        boolean si= true;
        for(int i=0;i<strings.length;i++){
        	per = strings[i];
        	if(per%5==0){
        		if(per%2==0){
        		A1+=per;
        		b1++;
        		}
        	}else if(per%5==1){
				if(si==true){
					A2+=per;
				}else {
					A2-=per;
				}
				si = !si;
				b2++;
			}else if(per%5==2){
				 A3++;
				 b3++;
			}else if(per%5==3){
				A4+=per;
				b4++;
			}else if(per%5==4){
				if(per>A5){
					A5=per;
				}
				b5++;
			}
        }
        DecimalFormat df = new DecimalFormat("#.0");  
        //开始处理
       System.out.println((b1>0?A1:"N")+" "+(b2>0?A2:"N")+" "+(b3>0?A3:"N")
    		          +" "+(b4>0?df.format(A4/(double)b4):"N")+" "+(b5>0?A5:"N"));
       Date enDate = new Date();
       System.out.println(enDate.getTime()-stat.getTime());
	}
	
}
