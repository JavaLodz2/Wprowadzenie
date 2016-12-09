package silnia;

public class Silnia {
	
	public int silnia(int i) {
	    if (i == 0) return 1;
	    else 
	      return i * silnia(i - 1);
	}
	
	public int silniaFunc(int i){
		if(i==0) return 1;
		else
		{
			int iloczyn=1;
			for(int j=1;j<=i;j++)
			{
				iloczyn*=j;
			}
			return iloczyn;
		}
	}
}
