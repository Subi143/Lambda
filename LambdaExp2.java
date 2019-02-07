//13.2
package Assignment;
import java.util.Scanner;

interface CharArr{
	String mymethod(String s1);
}

class LambdaExp2{
	public static void main(String args[]) {
		CharArr ca = (str) -> {
			String s1=" ";
	for(int i=0;i<str.length();i++) {
		if ((str.charAt(i)+1)!=' ') {
			s1=s1+str.charAt(i)+" ";
			
		}
		
	}
	return s1;
		};
		System.out.println(ca.mymethod("hello"));
}
}
