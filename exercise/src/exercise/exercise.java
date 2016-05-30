package exercise;
import java.io.*;
import java.util.Arrays;


import javax.swing.text.AbstractDocument.BranchElement;
public class exercise{
	public static void main(String args[]){
		try {BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("入力してください");
        String str = br.readLine();
        char[] c = str.toCharArray();
        Arrays.sort(c);
        str = new String(c);
        System.out.println(str);}
        catch (IOException e){
            System.out.println("Exception :" + e);    } 
	    }
	    
	        }
	        
	    }

		
}
