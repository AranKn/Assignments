package Assignment;

import java.util.Scanner;
public class Assignment2Guessergame {
	static String result(int[] p,int actualNumber)
	{
		String tempString="",result="";
		for(int t=1;t<=p.length;t++)
			tempString+=p[t-1]==actualNumber?("Player "+t+"-"):"";
		if(tempString!="")
			tempString= tempString.charAt(tempString.length()-1)=='-' ? tempString.substring(0,tempString.length()-1):tempString;
		if(tempString.length()==0)
			result="None of the players made right guess ! Try again.";
		else if(tempString.split("-").length==p.length)
			result="All the "+p.length+" players won the game";
		else
		{
			String [] arr=tempString.split("-");
			if(arr.length==1)
				result+=tempString.split("-")[0];
			else	
				for(int t=0;t<arr.length;t++)
					result+=t<arr.length-2?arr[t]+", ":t==arr.length-2?arr[t]+" and ":arr[t];
			result+=" won the game.";
		}
		return result;
	}
		  @SuppressWarnings("resource")
			public static void main(String[] args) {
				Scanner scanner=new Scanner(System.in);
				int guesserGuess,n;
				System.out.print("Enter the number of players in game: ");
				n=scanner.nextInt();
				System.out.println("Umpire : Hello Guesser what's the number?");
				System.out.print("Guesser : ");
				guesserGuess=scanner.nextInt();
				int [] player = new int[n];	
				for(int i=1;i<=n;i++)
				{
					System.out.print("Umpire : Hello Player "+i+" what's your guess ?");
					player[i-1]=scanner.nextInt();
				}
//				Game g=new Game(guesserGuess,player);
//				System.out.println(g.result());
				System.out.println(result(player,guesserGuess));
			}
		}

		/*class Game
		{
				int [] p;
				int actualNumber;
				public Game(int actualNumber,int[] p)
				{
					this.actualNumber=actualNumber;
					this.p=p;
				}
				
				public String  result()
				{
					String tempString="",result="";
					for(int t=1;t<=this.p.length;t++)
						tempString+=this.p[t-1]==actualNumber?("Player "+t+"-"):"";
					if(tempString!="")
						tempString= tempString.charAt(tempString.length()-1)=='-' ? tempString.substring(0,tempString.length()-1):tempString;
					if(tempString.length()==0)
						result="None of the players made right guess ! Try again.";
					else if(tempString.split("-").length==this.p.length)
						result="All the "+this.p.length+" players won the game";
					else
					{
						String [] arr=tempString.split("-");
						if(arr.length==1)
							result+=tempString.split("-")[0];
						else	
							for(int t=0;t<arr.length;t++)
								result+=t<arr.length-2?arr[t]+", ":t==arr.length-2?arr[t]+" and ":arr[t];
						result+=" won the game.";
					}
					return result;
				}
		}*/
