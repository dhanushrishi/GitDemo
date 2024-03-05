package recursion.demo;

public class RecursionLearn {
// method calling by itself
	public static void main(String[] args) {
    
    RecursionLearn bn = new RecursionLearn();
    bn.display(1);
		
	}

	public void display(int no) {
		
		System.out.println(no);
		no++;
		if(no<=5) {
		display(no);
	
		}
		}
	
}
