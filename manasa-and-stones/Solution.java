import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Input {
	int n;
	int leftIncr, rightIncr;

	Input() {
		n = 0;
		leftIncr = 0;
		rightIncr = 0;
	}

	Input(Integer n, Integer leftIncr, Integer rightIncr) {
		this.n = n;
		this.leftIncr = leftIncr;
		this.rightIncr = rightIncr;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getLeftIncr() {
		return leftIncr;
	}

	public void setLeftIncr(int leftIncr) {
		this.leftIncr = leftIncr;
	}

	public int getRightIncr() {
		return rightIncr;
	}

	public void setRightIncr(int rightIncr) {
		this.rightIncr = rightIncr;
	}
}

public class Solution {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tests = Integer.parseInt(sc.nextLine());
		List<Input> inputs = new ArrayList<Input>();

		for (int i = 1; i <= tests; i++) {
			inputs.add(new Input(Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
		}
		
		for(Input input:inputs){
			List<Integer> result=new ArrayList<Integer>();
			
			for(int i=0;i<input.getN();i++){
				Integer value=((input.getN()-1-i)*input.getLeftIncr()) + (i * input.getRightIncr());
				
				if(!result.contains(value))
					result.add(value);
			}
			
			Collections.sort(result);
			
			for(int i=0;i<result.size();i++){
				if(i==0)
					System.out.print(result.get(i).toString());
				else
					System.out.print(" "+result.get(i).toString());
			}
			
			System.out.println();	
		}
		
		sc.close();
	}

}
