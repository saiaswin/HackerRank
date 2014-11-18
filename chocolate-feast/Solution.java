import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Input{
	int N,C,M;
}

public class Solution {
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		int size=sc.nextInt();
		
		List<Input> inputs=new ArrayList<Input>();
		
		for(int i=1;i<=size;i++){
			Input input=new Input();
			
			input.N=sc.nextInt();
			input.C=sc.nextInt();
			input.M=sc.nextInt();
			
			inputs.add(input);
		}
		
		for(Input input:inputs){
			int chocolates=input.N/input.C;
			int wrappers=chocolates;
			
			while(wrappers/input.M!=0){
				int redemeedChocs=wrappers/input.M;
				chocolates+=redemeedChocs;
				wrappers=redemeedChocs+(wrappers%input.M);
			}
			
			System.out.println(chocolates);
		}		
		sc.close();
	}

}
