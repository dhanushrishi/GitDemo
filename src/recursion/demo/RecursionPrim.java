package recursion.demo;

public class RecursionPrim {
	
	public static void main(String[] args) {
		
		int div=2;
		RecursionPrim nn= new RecursionPrim();
		nn.calprim(div);
	}

	public void calprim(int div) {
		
		int no=13;
		
		while(div<no) {
		
			if(no%div==0) {
				
				System.out.println("Not a prime");
				break;
			    
			}
			else if(no%div!=0)
			{
				System.out.println("Prime number");
				break;
			
			}
		
			calprim(div++);
		}
		
		
	}
	}
	
	
