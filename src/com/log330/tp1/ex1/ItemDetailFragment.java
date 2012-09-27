package com.log330.tp1.ex1;

import com.log330.tp1.ex1.dummy.DummyContent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
    	View rootView = null;
    	
        if (mItem != null) {
        	if (mItem.content.equalsIgnoreCase(getString(R.string.players))) {
        		rootView = inflater.inflate(R.layout.fragment_item_detail, container, false);
        		((TextView) rootView.findViewById(R.id.item_detail)).setText(mItem.content);
        		((android.widget.EditText) rootView.findViewById(R.id.player_name)).setText("");
        		((android.widget.EditText) rootView.findViewById(R.id.number)).setText("");
        		((android.widget.Button) rootView.findViewById(R.id.my_button)).setText("Add");
        	} else if (mItem.content.equalsIgnoreCase(getString(R.string.teams))) {
        		rootView = inflater.inflate(R.layout.team_layout, container, false);
        		((TextView) rootView.findViewById(R.id.item_detail)).setText(mItem.content);
        		((android.widget.EditText) rootView.findViewById(R.id.team_name)).setText("");
        		((android.widget.Button) rootView.findViewById(R.id.my_button)).setText("Add");
        	} else if (mItem.content.equalsIgnoreCase(getString(R.string.results))) {
        		rootView = inflater.inflate(R.layout.results_layout, container, false);
        		((TextView) rootView.findViewById(R.id.item_detail)).setText(mItem.content);
        	}
        	// TODO HERE IS THE JOB TO DO :P
        	// for other tabs
        	// create new xml layout file
        	// create new if to use the xml file
        	// after use creativity and kill some cats
        }
        return rootView;
    }
}
