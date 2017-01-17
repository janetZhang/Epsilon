package general;

public class Fibbonaci {
/**
 * Write fibbonaci iteratively and recursively (bonus: use dynamic programming)
 * @param n
 * @return
 */
	public static int getFibbonaci(int n){
		
		if(n==0){
			return 0;
		}else if(n==1){
			return 1;
		}
		else{
			return getFibbonaci(n-1)+ getFibbonaci(n-2);			
		}
	}
}
