package Assignments;

import java.util.Scanner;

public class Assignment3String {
	
	static String findRepeatingCharacters(String string)
	{
		String temp="",repeatingChar="",op="";
		for(int i=0;i<string.length();i++)
		{
			temp=""+string.charAt(i);
			for(int j=i+1;j<string.length();j++)
			{
				if(repeatingChar.contains(""+string.charAt(i)))
					break;
				else if(temp.contains(""+string.charAt(j)))
				{
					repeatingChar+=string.charAt(j);
					break;
				}
			}
		}
		for(int t=0;t<repeatingChar.length();t++)
			op+=repeatingChar.charAt(t)+",";
		return op.length()==0? "There's no repeating character in the entered string" : op.length()==1? "Repeating character "+op : "Repeating characters are "+op.substring(0,op.length()-1);
	}
	
	static String anagramSort(String string)
	{
		   int array[]=new int[string.length()],temp=0;
		   string=string.replace(" ","").toLowerCase();
		   String sortedString="";
		   for(int t=0;t<string.length();t++)
			   array[t]=(int)string.charAt(t);
		   for (int i = 0; i < array.length; i++)
			   for (int j = i + 1; j < array.length; j++)
		         if (array[i] > array[j])
		         {
		             temp = array[i];
		             array[i] = array[j];
		             array[j] = temp;
		         }
		   for(int i:array)
		       sortedString+=(char)i;
	       return sortedString;
	    }
	
static String sortString(String string)
{
	   int array[]=new int[string.length()],temp=0;
	   String sortedString="";
	   for(int t=0;t<string.length();t++)
		   array[t]=(int)string.charAt(t);
	   for (int i = 0; i < array.length; i++)
		   for (int j = i + 1; j < array.length; j++)
	         if (array[i] > array[j])
	         {
	             temp = array[i];
	             array[i] = array[j];
	             array[j] = temp;
	         }
	   for(int i:array)
	       sortedString+=(char)i;
       return sortedString;
    }

static String reverseAString(String string)
{
	String reversedString="";
	for(int t=string.length()-1;t>=0;t--)
		reversedString+=""+string.charAt(t);
	return reversedString;
}

static String reverseSentence(String sentence)
{
	String reversedSentence="";
	for(String word:sentence.split(" "))
		reversedSentence+=reverseAString(word)+" ";
	return reversedSentence.substring(0,reversedSentence.length()-1);
}

static String countSpecialCharacters(String sentence)
{
	int count=0;
	for(String letter:sentence.replace(" ","").toLowerCase().split(""))
		count+= "abcdefghijklmnopqrstuvwxyz0123456789".contains(letter)?0:1;
	return count==0? "Entered string does not have any special characters": count==1 ?"Entered string contain 1 special character":"Entered string contains "+count+" special characters";
}
 static String countVowelsAndConsonants(String sentence)
{
	int vowelCount=0,consonantCount=0;
	for(String letter:sentence.replace(" ","").toLowerCase().split(""))
	{
		if("aeiou".contains(letter))
			vowelCount+=1;
		else if("abcdefghijklmnopqrstuvwxyz".contains(letter))
			consonantCount+=1;
	}
	return "Entered string contains "+ (vowelCount==0||vowelCount==1? (vowelCount+" vowel "): (vowelCount+" vowels "))+"and "+(consonantCount==0 || consonantCount==1? (consonantCount+" consonant "):  (consonantCount+" consonants "))+"respectively";
}

static String verifyAnagramString(String string1,String string2)
{
	return  anagramSort(string1).equals(anagramSort(string2)) ? "Entered string's are Anagram" : "Entered string's are not an Anagram";
}

static String verifyPangramString(String string)
{
	string=string.toLowerCase();
	boolean result=true;
	for(String letter:"abcdefghijklmnopqrstuvwxyz".split(""))
		if(!string.contains(letter))
		{
			result=false;
			break;
		}
	return result?"Entered string is a Pangram":"Entered string is not a Pangram";
}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		Scanner scn=new Scanner(System.in);
		String s1,s2;
		//1.WAP to reverse a String.
		System.out.print("Q1.Enter string input : ");
		System.out.println(reverseAString(scn.next()));
		
		//2.WAP to reverse a sentence while preserving the position.
		System.out.print("Q2.Enter string input : ");
		System.out.println(reverseSentence(scn.nextLine()));
		
		//3.WAP to check if the String is Anagram or not
		System.out.println("Q3.Enter string s1 : ");
		s1=scn.nextLine();
		System.out.print("Q3.Enter string s2 : ");
		s2=scn.nextLine();
		System.out.println(verifyAnagramString(s1,s2));
		
		//4.WAP to check if the String is Pangram or not
		System.out.print("Q4.Enter string input : ");
		System.out.println(verifyPangramString(scn.nextLine()));
		
		//5.WAP to print repeatedly occurring characters in the given String.
		System.out.print("Q5.Enter string input : ");
		System.out.println(findRepeatingCharacters(scn.nextLine()));
		
		//6. WAP to sort a String Alphabetically
		System.out.print("Q6.Enter string input : ");
		System.out.println(sortString(scn.nextLine()));
		
		//7.WAP to count the number of Vowels and Consonants of a String value.
		System.out.print("Q7.Enter string input : ");
		System.out.println(countVowelsAndConsonants(scn.nextLine()));
		
		
		//8.WAP to count number of special characters.
		System.out.print("Q8.Enter string input : ");
		System.out.println(countSpecialCharacters(scn.nextLine()));
			
	}
}