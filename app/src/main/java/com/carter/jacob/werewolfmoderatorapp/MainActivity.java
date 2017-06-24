package com.carter.jacob.werewolfmoderatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.carter.jacob.werewolfmoderatorapp.Model.EventCard;

public class MainActivity extends AppCompatActivity implements MainActivityInterface{

	MainActivityPresenterInterface presenter;
	TextView cardTitleTxt;
	TextView cardDescriptionTxt;
	Button drawCardBtn;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
	    presenter = new MainActivityPresenter(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
	    
	    cardTitleTxt = (TextView) findViewById(R.id.cardTitleTxt);
	    cardDescriptionTxt = (TextView) findViewById(R.id.cardDescriptionTxt);
	    drawCardBtn = (Button) findViewById(R.id.drawCardBtn);
	    updateCardView(presenter.drawCard());
	    
	    drawCardBtn.setOnClickListener(new View.OnClickListener()
	    {
		    @Override
		    public void onClick(View v)
		    {
				EventCard card = presenter.drawCard();
			    updateCardView(card);
		    }
         });
    }
    
    private void updateCardView(final EventCard card)
    {
	    runOnUiThread(new Runnable()
	    {
		    public void run()
		    {
			    cardTitleTxt.setText(card.getName());
			    cardDescriptionTxt.setText(card.getDescription());
		    }
	    });
    }
    
}
