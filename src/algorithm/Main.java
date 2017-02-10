package algorithm;

import java.math.BigDecimal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long start=System.currentTimeMillis();
        int n=input.nextInt();
        int[] returnNum = new int[11];
        int flag = 1;
        returnNum[10] = 0;
        int[] num=new int[n];
        long end1=System.currentTimeMillis();
        for (int i = 0; i < num.length; i++) {
            num[i]=input.nextInt();
            if (num[i] % 5 == 0 && num[i] % 2 == 0) {
                returnNum[0] += num[i];
                returnNum[5] = 1;
            } else if (num[i] % 5 == 1) {
                if (flag % 2 == 1) {
                    returnNum[1] += num[i];
                } else {
                    returnNum[1] -= num[i];
                }
                flag++;
                returnNum[6] = 1;
            } else if (num[i] % 5 == 2) {
                returnNum[7] = 1;
                returnNum[2] = returnNum[2] + 1;
            } else if (num[i] % 5 == 3) {
                returnNum[8] = 1;
                returnNum[3] += num[i];
                returnNum[10]++;
            } else {
                returnNum[9] = 1;
                if (returnNum[4] <= num[i]) {
                    returnNum[4] = num[i];
                }
            }
        }
        long end2=System.currentTimeMillis();
        for (int j = 0; j < 5; j++) {
            if (returnNum[j + 5] == 0) {
                System.out.print("N");
            } else {
                if (j == 3) {
                    BigDecimal b1 = new BigDecimal((double) returnNum[j]);
                    BigDecimal b2 = new BigDecimal((double) returnNum[10]);
                    System.out.print(b1.divide(b2,1,BigDecimal.ROUND_HALF_UP).doubleValue());
                } else {
                    System.out.print(returnNum[j]);
                }
            }
            if (j != 4) {
                System.out.print(" ");
            }
        }
        input.close();
 }
}