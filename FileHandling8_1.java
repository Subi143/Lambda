package Assignment;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileHandling8_1 {
	public static void main(String args[]) throws IOException {
		String p1="C:\\Users\\akshat.misra\\Desktop\\input.txt";
		String p2="C:\\Users\\akshat.misra\\Desktop\\output.txt";
		FileReader fr = new FileReader(p1);  
		FileWriter fw = new FileWriter(p2);  
		BufferedReader br = new BufferedReader(fr);  
		BufferedWriter bw = new BufferedWriter(fw);  
		           
		String data;  
		           
		while ((data = br.readLine()) != null){
		    String[] words = data.split(" ");
		    for(String a: words){
		        StringBuilder builder=new StringBuilder(a);
		        System.out.print(builder.reverse().toString());
		    }   
		}
		//fr.close();
		
	}

}
		
	


