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
	private Map<Integer,EventCard> cards;
	private Map<String,List<EventCard>> decks;
	private List<EventCard> currentDeck;
	
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
		cards = new HashMap<Integer,EventCard>();
		decks = new HashMap<String,List<EventCard>>();
		currentDeck = new ArrayList<EventCard>();
	}
}
