package algorithm;

public class OuJiLiDe {

	public static void main(String args[]){
		long m = 30;
		long n = 21;
		while(n!=0){
			long temp = m%n;
			m = n;
			n = temp;
			System.out.println("调用后的值："+m+" n值为："+n);
		}
		System.out.println(m);
	}
}
