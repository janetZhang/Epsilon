package strings;

public class ReverseStrRecursive {
	
	public String reverse(String str){	
		int size = str.length();
		if(size<=1||size==0){
			return str;
		}			
	    return reverse(str.substring(1))+str.charAt(0);		
	}
}
