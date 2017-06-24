package com.carter.jacob.werewolfmoderatorapp;

import android.app.Activity;

import com.carter.jacob.werewolfmoderatorapp.Model.EventCard;
import com.carter.jacob.werewolfmoderatorapp.Model.Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by jacob on 5/27/2017.
 */

public class MainActivityPresenter implements  MainActivityPresenterInterface
{
	Activity activity;
	Model appModel = Model.getModel();
	List<EventCard> currentPlayingDeck;
	
	public MainActivityPresenter(Activity activity)
	{
		this.activity = activity;
		populateDeck();
		shuffleDeck();
	}
	
	@Override
	public EventCard drawCard()
	{
		if(currentPlayingDeck.size() == 0)
		{
			populateDeck();
			shuffleDeck();
		}
		
		EventCard draw = currentPlayingDeck.get(0);
		currentPlayingDeck.remove(0);
		
		return draw;
	}
	
	private void shuffleDeck()
	{
		Collections.shuffle(currentPlayingDeck);
	}
	
	private void clearDeck()
	{
		currentPlayingDeck.clear();
	}
	
	private void populateDeck()
	{
		currentPlayingDeck = new ArrayList<EventCard>(appModel.getCurrentDeck());
	}
}
