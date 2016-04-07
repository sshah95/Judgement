import java.util.*;
public class Judgement
{
	private Game game;
	private ArrayList<Player> playerList;
	private ArrayList<Hand> hands;
	private ArrayList<Card> cards;
	private 
	public static void main(String[] args)
	{
		System.out.println("Hello world!");
	}
}

class Game
{
  
}

class Player
{
	private int tricksCollected;
}

class Hand
{
  private ArrayList<Card> cardsInHand;
  public Hand()
  
}

class Card
{
  private int number;
  private String suit;
  public Card(int number, String suit)
  {
  	this.number = number;
  	this.suit = suit;
  }
  
  public int getNumber()
  {
  	return this.number;
  }
  
  public String getSuit()
  {
  	return this.suit;	
  }
  
  public String numVal()
  {
  	switch(this.number)
  	{
  		case 1: return "A";
  		case 11: return "J";
  		case 12: return "Q";
  		case 13: return "K";
  		default: return (""+this.number);
  	}
  }
  
  public boolean isTrump(String trumpSuit)
  {
  	return (this.suit.equals(trumpSuit));
  }
  
  public static Card higherCard(String trumpSuit, Card firstCard, Card secondCard)
  {
  	if(secondCard.getSuit().equals(firstCard.getSuit())
  	{
  		if(secondCard.number>firstCard.number)
  		{
  			return secondCard;
  		}
  		else
  		{
  			return firstCard;
  		}
  	}
  	else
  	{
  		if(secondCard.isTrump(trumpSuit))
  		{
  			return secondCard;
  		}
  		else
  		{
  			return firstCard;
  		}
  	}
  }
  
}

class PlayedCards
{
  private Card [] cardsPlayed;
 
}
