public class Find_Max{
	public static int A[] = {9,-8,12,18,-13,7,9,2,-5,23,12,-11,16,5,20,4,6,-20,13}; //array sample
	public static int max = A[0];
	
	public static void main(String Args[]){
		int q = A.length-1;
		System.out.print("The max value of the array: "+findMax(q));
	}
	
	public static int findMax(int q){
		if(q==0)return max; 	//basis
		if (max < A[q])max = A[q];
		return findMax(q-1);
	}
}