package recursion.demo;

public class RecursionFibano {
	int n1=-1,n2=1,n3=0;
	public static void main(String[] args) {
         int count=13;
		RecursionFibano vv = new RecursionFibano();
		vv.fibanoc11(count);
		
	}

	public void fibanoc11(int count) {
		
	
		if(count>0) {
			n3= n1+ n2;
			n1=n2;
			n2=n3;
			
			System.out.println(n3);
			fibanoc11(count-1);
			
			
		}
		
		
		
		
		
	}
	
	
	
	
}
