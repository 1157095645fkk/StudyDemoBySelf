package test;

public class diguiTest {

	public static void main(String args[]){
		System.out.println(fit(10));
	}

	public static long fit(int n){
		if(n<=1){
			return 1;
		}else
		{
			return fit(n-1)+fit(n-2);
		}
	}
}
