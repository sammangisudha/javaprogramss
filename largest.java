package largestofN;

public class largest {
public static void main(String[] args) {
		int[] arr= {1,5,8,10,6,9,12};
	int l=0;
		for(int i=0;i<arr.length;i++) {
			if(l<arr[i]){
				l=arr[i];
			}
		}
				System.out.println(+l);

			

		
		
}
	

}
