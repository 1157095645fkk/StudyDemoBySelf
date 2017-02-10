package algorithm;

public class MiYunSuan {

	public static void main(String args[]){
		
	}
	public static long pow(long x,int n){
		if(n==0){
			return 1;
		}
		if(n==1){
			return x;
		}
		if(isEven(n)){
		return pow(x*x, n/2);
		}else {
			return pow(x*x, n/2)*x;
		}
	}
	public static boolean isEven(long n){
		if(n%2==0){
			return true;
		}
		return false;
	}
}
