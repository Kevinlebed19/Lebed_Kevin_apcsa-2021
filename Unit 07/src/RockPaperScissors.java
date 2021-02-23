//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice=player;
	}

	public String determineWinner()
	{
		
		double choice = Math.random();
		String winner="";
		
		if(choice>0.6) compChoice = "S";
		if(choice>0.3&&choice<0.6) compChoice = "P";
		if(choice<0.3) compChoice = "R";
		
		if(playChoice=="R"&&compChoice=="R") winner="no one";
		if(playChoice=="R"&&compChoice=="P") winner="computer won";
		if(playChoice=="R"&&compChoice=="S") winner="you won";
		if(playChoice=="P"&&compChoice=="R") winner="you won";
		if(playChoice=="P"&&compChoice=="P") winner="no one";
		if(playChoice=="P"&&compChoice=="S") winner="computer won";
		if(playChoice=="S"&&compChoice=="R") winner="omputer won";
		if(playChoice=="S"&&compChoice=="P") winner="you won";
		if(playChoice=="S"&&compChoice=="S") winner="no one";
		
		return winner;
	}

	public String toString()
	{
		
		return "the winner is "+determineWinner();
	}
}