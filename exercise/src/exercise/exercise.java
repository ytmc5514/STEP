package exercise;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import javax.swing.text.AbstractDocument.BranchElement;
public class exercise{
	public static void main(String args[]){
		//Listの定義（単語リスト）
		List<String>list;
		//辞書の読み込み
		Path path = FileSystems.getDefault().getPath("/usr/share/dict/words");
		try{
		list = Files.readAllLines(path, StandardCharsets.UTF_8);
		}catch (IOException e){return;}
		
		//（単語ごとにアルファベット順に）
		//辞書を文字数順に　　その後辞書とマッチングさせる中でアルファベット順に
		for (int i=0;i<list.size();i++){
			String word = list.get(i);
			char[]c= word.toCharArray();
			Arrays.sort(c);
			String newWord= new String(c);
		}
		
		//入力された文字の並び替え
		try {BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("入力してください");
        String str = br.readLine();
        char[] c = str.toCharArray();
        Arrays.sort(c);
        str = new String(c);
        System.out.println(str);}
        catch (IOException e){
            System.out.println("Exception :" + e);}
		
	
			
		}
		
	    
	}
}
	    
	        
	        
