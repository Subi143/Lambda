//13.1
package Assignment;
import java.lang.Math;

interface CalcPow{
		void power(int x,int y);
	}

	public class LambdaExp1 {
		public static void main(String args[]) {
		
	CalcPow cp=(x,y)->System.out.println(Math.pow(x, y));
	cp.power(6,3);
		}
	}