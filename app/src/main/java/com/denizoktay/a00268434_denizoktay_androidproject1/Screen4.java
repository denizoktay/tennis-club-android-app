package com.denizoktay.a00268434_denizoktay_androidproject1;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Screen4 extends ListActivity  {
    String[] myEvents = {
            "Event1",
            "Event2",
            "Event3",
            "Event4",
            "Event5",
            "Event6",
            "Event7",
            "Event8",
            "Event9",
            "Event10",
            "Event11",
            "Event12",
            "Event13",
            "Event14",
            "Event15",
            "Event16",
            "Event17",
            "Event18"
    };


    String[] myLabels = {
            "Senior Round Robins Ladders 2020",
            "Kilkenny Autumn Matchplay 2019",
            "Claremorris Autumn League 2019",
            "2019 David Lloyd Riverview Autumn Invitational Match-Plays",
            "Ladies Box League Round 4",
            "WINTER LEAGUE 2019 - sponsored by The Hoban Hotel, Kilkenny",
            "Mount Pleasant Turkey 2019",
            "Winter Mixed Doubles League 2019",
            "Carraig Rockies Nov 2019",
            "Junior Box League November 2019",
            "Leinster Autumn Tennis 10's 2019",
            "2019 Talbot Hotel Winter Doubles",
            "Winter League 2019",
            "Lower Aghada Senior Closed 2019",
            "Winter Doubles Round Robin 2019",
            "Cullen's Butchers Turkey Tournament 2019",
            "Naas Ltc - 2019 Winter Doubles REGISTRATION ONLY",
            "ULSTER SENIOR INDOOR CHAMPIONSHIPS 2019",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 //       setContentView(R.layout.activity_screen4);
        this.setListAdapter(new ArrayAdapter<String>(Screen4.this, android.R.layout.simple_list_item_1, myLabels));

    }


    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {


        try {
            Class myClass = Class.forName("com.denizoktay.a00268434_denizoktay_androidproject1." + myEvents[position]);
            Intent i = new Intent(Screen4.this, myClass);
            startActivity(i);
        }
        catch
        (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

}

