package gwiazdy;

import other.Helper;

public class Program {

	public static void main(String[] args) {

		Helper help = new Helper();
		int n=help.getValue("Podaj wielkoœæ kwadratu.");
		if(n<=0) n=1;
				
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				
				if (i==1 || i==n || j==1 || j==n) {
					System.out.print("* ");
				} else if (i==j){
					System.out.print("* ");
				} else if (i==n-j+1){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
				
				
			}
			System.out.println("");
		}
	}

	
	
}
