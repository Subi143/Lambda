package Assignment;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling8_2 {
	public static void main(String args[]) throws IOException {
		String p1="C:\\Users\\akshat.misra\\Desktop\\abc.txt";
		FileReader fr=new FileReader(p1);
		Scanner sc=new Scanner(fr);
		while(sc.hasNext())
		{
			String str=sc.next();
			int[] arr=new int[str.length()];
					for(int i =0;i<arr.length;i++) {
						arr[i]=(int) str.charAt(i);
						if(arr[i]%2==0 && arr[i]!=',') {
							System.out.print((char)arr[i]+",");
						}
					}
		}
		
	}

}
