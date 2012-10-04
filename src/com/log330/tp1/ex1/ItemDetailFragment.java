package com.log330.tp1.ex1;

import com.log330.tp1.ex1.dummy.DummyContent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;

public class ItemDetailFragment extends Fragment {

    public static final String ARG_ITEM_ID = "item_id";

    DummyContent.DummyItem mItem;

    public ItemDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments().containsKey(ARG_ITEM_ID)) {
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
        }
    }
    
    @Override
    public android.view.View onCreateView(LayoutInflater inflater, android.view.ViewGroup container,
            Bundle savedInstanceState) {
    	android.view.View rootView = null;
    	
    	
        if (mItem != null) {
        	if (mItem.content.equalsIgnoreCase(getString(R.string.players))) {
        		rootView = inflater.inflate(R.layout.players_layout, container, false);
            	android.widget.ToggleButton toggle1 = (android.widget.ToggleButton) rootView.findViewById(R.id.player1_onice);
            	android.widget.ToggleButton toggle2 = (android.widget.ToggleButton) rootView.findViewById(R.id.player2_onice);
            	android.widget.ToggleButton toggle3 = (android.widget.ToggleButton) rootView.findViewById(R.id.player3_onice);
            	android.widget.ToggleButton toggle4 = (android.widget.ToggleButton) rootView.findViewById(R.id.player4_onice);
            	android.widget.ToggleButton toggle5 = (android.widget.ToggleButton) rootView.findViewById(R.id.player5_onice);
            	android.widget.ToggleButton toggle6 = (android.widget.ToggleButton) rootView.findViewById(R.id.player6_onice);
            	android.widget.ToggleButton toggle7 = (android.widget.ToggleButton) rootView.findViewById(R.id.player7_onice);
            	android.widget.ToggleButton toggle8 = (android.widget.ToggleButton) rootView.findViewById(R.id.player8_onice);
            	android.widget.ToggleButton toggle9 = (android.widget.ToggleButton) rootView.findViewById(R.id.player9_onice);
            	android.widget.ToggleButton toggle10 = (android.widget.ToggleButton) rootView.findViewById(R.id.player10_onice);
        		toggle1.setOnClickListener(onToggleClicked(toggle1));
        		toggle2.setOnClickListener(onToggleClicked(toggle2));
        		toggle3.setOnClickListener(onToggleClicked(toggle3));
        		toggle4.setOnClickListener(onToggleClicked(toggle4));
        		toggle5.setOnClickListener(onToggleClicked(toggle5));
        		toggle6.setOnClickListener(onToggleClicked(toggle6));
        		toggle7.setOnClickListener(onToggleClicked(toggle7));
        		toggle8.setOnClickListener(onToggleClicked(toggle8));
        		toggle9.setOnClickListener(onToggleClicked(toggle9));
        		toggle10.setOnClickListener(onToggleClicked(toggle10));
        		
        		android.widget.RadioButton rbNinjas1 = (android.widget.RadioButton) rootView.findViewById(R.id.radio_ninjas1);
            	android.widget.RadioButton rbPirates1 = (android.widget.RadioButton) rootView.findViewById(R.id.radio_pirates1);
            	android.widget.RadioButton rbNinjas2 = (android.widget.RadioButton) rootView.findViewById(R.id.radio_ninjas2);
            	android.widget.RadioButton rbPirates2 = (android.widget.RadioButton) rootView.findViewById(R.id.radio_pirates2);
            	android.widget.RadioButton rbNinjas3 = (android.widget.RadioButton) rootView.findViewById(R.id.radio_ninjas3);
            	android.widget.RadioButton rbPirates3 = (android.widget.RadioButton) rootView.findViewById(R.id.radio_pirates3);
            	android.widget.RadioButton rbNinjas4 = (android.widget.RadioButton) rootView.findViewById(R.id.radio_ninjas4);
            	android.widget.RadioButton rbPirates4 = (android.widget.RadioButton) rootView.findViewById(R.id.radio_pirates4);
            	android.widget.RadioButton rbNinjas5 = (android.widget.RadioButton) rootView.findViewById(R.id.radio_ninjas5);
            	android.widget.RadioButton rbPirates5 = (android.widget.RadioButton) rootView.findViewById(R.id.radio_pirates5);
            	android.widget.RadioButton rbNinjas6 = (android.widget.RadioButton) rootView.findViewById(R.id.radio_ninjas6);
            	android.widget.RadioButton rbPirates6 = (android.widget.RadioButton) rootView.findViewById(R.id.radio_pirates6);
            	android.widget.RadioButton rbNinjas7 = (android.widget.RadioButton) rootView.findViewById(R.id.radio_ninjas7);
            	android.widget.RadioButton rbPirates7 = (android.widget.RadioButton) rootView.findViewById(R.id.radio_pirates7);
            	android.widget.RadioButton rbNinjas8 = (android.widget.RadioButton) rootView.findViewById(R.id.radio_ninjas8);
            	android.widget.RadioButton rbPirates8 = (android.widget.RadioButton) rootView.findViewById(R.id.radio_pirates8);
            	android.widget.RadioButton rbNinjas9 = (android.widget.RadioButton) rootView.findViewById(R.id.radio_ninjas9);
            	android.widget.RadioButton rbPirates9 = (android.widget.RadioButton) rootView.findViewById(R.id.radio_pirates9);
            	android.widget.RadioButton rbNinjas10 = (android.widget.RadioButton) rootView.findViewById(R.id.radio_ninjas10);
            	android.widget.RadioButton rbPirates10 = (android.widget.RadioButton) rootView.findViewById(R.id.radio_pirates10);
            	rbNinjas1.setOnClickListener(onRadioButtonClicked(rbNinjas1));
            	rbPirates1.setOnClickListener(onRadioButtonClicked(rbPirates1));
            	rbNinjas2.setOnClickListener(onRadioButtonClicked(rbNinjas2));
            	rbPirates2.setOnClickListener(onRadioButtonClicked(rbPirates2));
            	rbNinjas3.setOnClickListener(onRadioButtonClicked(rbNinjas3));
            	rbPirates3.setOnClickListener(onRadioButtonClicked(rbPirates3));
            	rbNinjas4.setOnClickListener(onRadioButtonClicked(rbNinjas4));
            	rbPirates4.setOnClickListener(onRadioButtonClicked(rbPirates4));
            	rbNinjas5.setOnClickListener(onRadioButtonClicked(rbNinjas5));
            	rbPirates5.setOnClickListener(onRadioButtonClicked(rbPirates5));
            	rbNinjas6.setOnClickListener(onRadioButtonClicked(rbNinjas6));
            	rbPirates6.setOnClickListener(onRadioButtonClicked(rbPirates6));
            	rbNinjas7.setOnClickListener(onRadioButtonClicked(rbNinjas7));
            	rbPirates7.setOnClickListener(onRadioButtonClicked(rbPirates7));
            	rbNinjas8.setOnClickListener(onRadioButtonClicked(rbNinjas8));
            	rbPirates8.setOnClickListener(onRadioButtonClicked(rbPirates8));
            	rbNinjas9.setOnClickListener(onRadioButtonClicked(rbNinjas9));
            	rbPirates9.setOnClickListener(onRadioButtonClicked(rbPirates9));
            	rbNinjas10.setOnClickListener(onRadioButtonClicked(rbNinjas10));
            	rbPirates10.setOnClickListener(onRadioButtonClicked(rbPirates10));

        	} else if (mItem.content.equalsIgnoreCase(getString(R.string.teams))) {

        	} else if (mItem.content.equalsIgnoreCase(getString(R.string.results))) {
        		rootView = inflater.inflate(R.layout.results_layout, container, false);
        	}
        	// TODO HERE IS THE JOB TO DO :P
        	// for other tabs
        	// create new xml layout file
        	// create new if to use the xml file
        	// after use creativity and kill some cats
        }
        return rootView;
    }

	private android.view.View.OnClickListener onToggleClicked(android.view.View view) {
        boolean on = ((android.widget.ToggleButton) view).isChecked();
        
        if (on) {
            // Enable vibrate
        	return null;
        } else {
            // Disable vibrate
        	return null;
        }
    }
	
	private android.view.View.OnClickListener onRadioButtonClicked(android.view.View view) {
	    boolean checked = ((android.widget.RadioButton) view).isChecked();
	    
	    switch(view.getId()) {
	        case R.id.radio_pirates1:
	            if (checked)
	                // Pirates are the best
	            	return null;
	            break;
	        case R.id.radio_ninjas1:
	            if (checked)
	                // Ninjas rule
	            	return null;
	            break;
	        case R.id.radio_pirates2:
	            if (checked)
	                // Pirates are the best
	            	return null;
	            break;
	        case R.id.radio_ninjas2:
	            if (checked)
	                // Ninjas rule
	            	return null;
	            break;
	        case R.id.radio_pirates3:
	            if (checked)
	                // Pirates are the best
	            	return null;
	            break;
	        case R.id.radio_ninjas3:
	            if (checked)
	                // Ninjas rule
	            	return null;
	            break;
	        case R.id.radio_pirates4:
	            if (checked)
	                // Pirates are the best
	            	return null;
	            break;
	        case R.id.radio_ninjas4:
	            if (checked)
	                // Ninjas rule
	            	return null;
	            break;
	        case R.id.radio_pirates5:
	            if (checked)
	                // Pirates are the best
	            	return null;
	            break;
	        case R.id.radio_ninjas5:
	            if (checked)
	                // Ninjas rule
	            	return null;
	            break;
	        case R.id.radio_pirates6:
	            if (checked)
	                // Pirates are the best
	            	return null;
	            break;
	        case R.id.radio_ninjas6:
	            if (checked)
	                // Ninjas rule
	            	return null;
	            break;
	        case R.id.radio_pirates7:
	            if (checked)
	                // Pirates are the best
	            	return null;
	            break;
	        case R.id.radio_ninjas7:
	            if (checked)
	                // Ninjas rule
	            	return null;
	            break;
	        case R.id.radio_pirates8:
	            if (checked)
	                // Pirates are the best
	            	return null;
	            break;
	        case R.id.radio_ninjas8:
	            if (checked)
	                // Ninjas rule
	            	return null;
	            break;
	        case R.id.radio_pirates9:
	            if (checked)
	                // Pirates are the best
	            	return null;
	            break;
	        case R.id.radio_ninjas9:
	            if (checked)
	                // Ninjas rule
	            	return null;
	            break;
	        case R.id.radio_pirates10:
	            if (checked)
	                // Pirates are the best
	            	return null;
	            break;
	        case R.id.radio_ninjas10:
	            if (checked)
	                // Ninjas rule
	            	return null;
	            break;
	    }
		return null;
	}
}
