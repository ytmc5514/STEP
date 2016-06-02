package exercise;
import java.io.*;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream.Filter;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.naming.directory.SearchControls;
import javax.print.attribute.standard.PrinterLocation;
import javax.swing.text.AbstractDocument.BranchElement;

import org.omg.CORBA.PUBLIC_MEMBER;
public class exercise{
static List<String>secondWordlist = new ArrayList();
static char[] instr;
	public static void main(String args[]){
		//Listの定義（単語リスト）
		List<String>list;
		
		//辞書の読み込み
		Path path = FileSystems.getDefault().getPath("/usr/share/dict/words");
		  try{
		  list = Files.readAllLines(path, StandardCharsets.UTF_8);
		  }catch (IOException e){return;}
		
		//辞書を文字数順に　　
		List<String> firstWordlist = new ArrayList<String>();
		  for (int i=0;i<list.size();i++){
		  String word = list.get(i);
		  list.sort((o1, o2) -> o2.length() - o1.length());
		  
          		
		  }
		  
		  
		//入力された文字の読み込み
		try {BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("入力してください");
        String str = br.readLine();//strに入力された文字が格納
        char[]charArray = str.toCharArray();
        	for(char instr : charArray){
        	System.out.println(instr);//instrには入力された文字が１文字ずつ入っている（a,p,p,l,eのように）
        	}
        }
        catch (IOException e){
            System.out.println("Exception :" + e);}
		
		//辞書の単語を順番に取り出す
		String searchw = new String();
		for (int i=0;i<secondWordlist.size();i++);{
			int i = 0;
			searchw = secondWordlist.get(i);//searchwは辞書の単語が順に格納される
		}
		char newSearchw[];
		newSearchw = searchw.toCharArray();//newSearchwは辞書のそれぞれの単語が１文字ずつ格納されたもの
		{
		
			//newSearchwの要素がinstrにすべて含まれているか
			for(int i=0;i<instr.length;i++){
				char wordnum = ((CharSequence) secondWordlist).charAt(i);   //wordnumはnewSearchwのi番目の文字
					if(Arrays.asList(instr).contains(wordnum))
						System.out.println(newSearchw);
			}
	
		}
		//含まれてたらそのcharArrayをStringにして表示
	}
}
