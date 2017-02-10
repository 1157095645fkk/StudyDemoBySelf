package algorithm;

public class ZuiDaZiXuLie {

	public static void main(String args[]){
		int[] a = {1,-1,2,-1,6,-1,9,2,-4};
		int result = maxSubSum(a);
	   System.out.println(result);
	   int result2 = newMasSubSum(a);
	   System.out.println(result2);
	   int result3 = bestGoodMasSubSum(a);
	   System.out.println(result3);
	}
	
	public static int maxSubSum(int []a){
		int maxSum=0;
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				 int thisSum = 0;
				 for(int k=i;k<=j;k++){
					 thisSum+=a[k];
					 if(thisSum>maxSum){
						 maxSum = thisSum;
					 }
				 }
				
			}
		}
		return maxSum;
	}
	public static int newMasSubSum(int []a){
		int maxSum = 0;
		for(int i=0;i<a.length;i++){
			int thisSum = 0;
			for(int j=i;j<a.length;j++){
				thisSum+=a[j];
				if(thisSum>maxSum){
					maxSum = thisSum;
				}
			}
		}
		return maxSum;
	}
	public static int bestGoodMasSubSum(int []a){
		int maxSum = 0;
		int thisSum = 0;
		for(int i=0;i<a.length;i++){
			thisSum+=a[i];
			if(thisSum>maxSum){
				maxSum = thisSum;
			}else if(thisSum<0){
				thisSum = 0;
			}
		}
		return maxSum;
	}
}
