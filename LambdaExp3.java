//13.3
package Assignment;
import java.util.Scanner;
interface User{
	
	public String valid(String username,String password);
}

public class LambdaExp3 {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter username");
	String username=sc.next();
	System.out.println("enter password");
	String password=sc.next();
	User u=(String us1,String pw1)->{
	if(username.contains("aa") && password.contains("@")) {
		return "hello";
	}
	else {
		return "exit";
	}
	};
	System.out.println(u.valid(username,password));
	}
}


