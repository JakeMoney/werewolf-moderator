package com.carter.jacob.werewolfmoderatorapp.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jacob on 5/27/2017.
 */

public class Model
{
	private static Model model;
	private Map<String,EventCard> cards;
	private Map<String,List<EventCard>> decks;
	private List<EventCard> currentDeck;
	private EventCard fav1;
	private EventCard fav2;
	
	public static Model getModel()
	{
		if(model == null)
		{
			model = new Model();
		}
		return model;
	}
	
	private Model()
	{
		cards = new HashMap<String,EventCard>();
		decks = new HashMap<String,List<EventCard>>();
		currentDeck = new ArrayList<EventCard>();
		
		populateCards();
		setLastUsedDeck();
	}
	
	private void populateCards()
	{
		List<EventCard> baseCards = new ArrayList<EventCard>();
		baseCards.add(new EventCard(0,"Seance","The moderator chooses one dead player to revive and rejoin the game (They keep their previous role)",false));
		baseCards.add(new EventCard(1,"Day of Bravado","Only males are allowed to talk during the high noon discussion.",false));
		baseCards.add(new EventCard(2,"Day of Feminism","Only females are allowed to talk during the high noon discussion.",false));
		baseCards.add(new EventCard(3,"Ghost Town","For the high noon discussion, all dead players vote for who they wish to hang.  The player with the most votes is hung, and the day ends.  The dead players are not allowed to speak, only point to who they wish to vote for. ",false));
		baseCards.add(new EventCard(4,"Watch Dawg","All players are allowed to open their eyes during the werewolf phase.  If the moderator sees a player with their eyes open who is not a werewolf, they immediately die.",false));
		baseCards.add(new EventCard(5,"Full moon ","The werewolves may choose 2 players to attack this night.  Those players will not die until after the following high noon discussion and hanging.",false));
		baseCards.add(new EventCard(6,"O.K. Corral","The 2 players with the most votes for the hanging must stand back to back, walk 5 paces, and then turn around and choose rock, paper, or scissors.  The loser is hung.",false));
		baseCards.add(new EventCard(7,"Inferno","All players that died the previous night do not reveal their identities.",false));
		baseCards.add(new EventCard(8,"Love Shack","All players must pair up in groups of 2.  They vote and die together as a couple during the hanging.",false));
		baseCards.add(new EventCard(9,"Typhoid Fever","No card abilities may be used today.",false));
		baseCards.add(new EventCard(10,"Day of Mourning","No one is allowed to speak during the day.  If they do, they die.",false));
		baseCards.add(new EventCard(11,"Ouija Board","One dead player is chosen by the moderator to join the high noon discussion.  (Be warned, the dead may not always tell the truth!)",false));
		baseCards.add(new EventCard(12,"Crystal Ball","Seer can reveal two identities tonight.",false));
		baseCards.add(new EventCard(13,"Words of the Dead","The undead may write down 3 letters each on a paper to be read during the high noon discussion.  They are not allowed to write down a specific person’s name or initials.",false));
		baseCards.add(new EventCard(14,"Rebirth","Moderator chooses a new player to come back to life.  They are assigned new cards by the moderator at random.",false));
		baseCards.add(new EventCard(15,"Witch Trials","The witch must use both their potions tonight.",false));
		
		for(EventCard nextEventCard : baseCards)
		{
			cards.put(nextEventCard.getName(),nextEventCard);
		}
	}
	
	private void setLastUsedDeck()
	{
		for(EventCard nextEventCard : cards.values())
		{
			currentDeck.add(nextEventCard);
		}
	}
	
	public EventCard getCard(String name)
	{
		return cards.get(name);
	}
	
	public void setCurrentDeck(List<EventCard> currentDeck)
	{
		this.currentDeck = currentDeck;
	}
	
	public List<EventCard> getCurrentDeck()
	{
		return currentDeck;
	}
	
	public EventCard getFav1()
	{
		return fav1;
	}
	
	public void setFav1(EventCard fav1)
	{
		this.fav1 = fav1;
	}
	
	public EventCard getFav2()
	{
		return fav2;
	}
	
	public void setFav2(EventCard fav2)
	{
		this.fav2 = fav2;
	}
}
