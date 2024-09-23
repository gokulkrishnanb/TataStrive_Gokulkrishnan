package day12;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserInterface2{
	
	public int countVowels(String name)
	{
		char[] ch = name.toLowerCase().toCharArray();
		int count=0;
		for(char c : ch)
		{
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				count++;
			}
		}
		return count;
	}
	
	
	
	public String findPetName(String fileName)  {
		String line="";
		String result="";
		
		try(FileReader fr=new FileReader(fileName); BufferedReader br =new BufferedReader(fr))
		{
		
			while((line=br.readLine())!=null)
			{
				if(countVowels(line)==2)
				{
					result+= line+"\n";
				}
			}
			
			return result;
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Please give the correct file name");
		}
		catch(IOException e)
		{
			System.out.println("Error occurred while reading the names from file");
		}
		
		return "";
	}

	public static void main(String[] args) {
		
		UserInterface ui=new UserInterface();
		System.out.println(ui.findPetName("C:\\rk\\Dogname.txt"));
	}
	
}
