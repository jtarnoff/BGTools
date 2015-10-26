package com.jtarnoff.bgtools;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.jtarnoff.bgtools.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jtarnoff on 10/25/2015.
 */
public class SevenWondersActivity extends Activity {
    private ListView mListView;
    private static String LOG_TAG = "SevenWondersActivity";

    List mPlayers = new ArrayList<HashMap<String, String>>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven_wonders);

        // Sample data
        createSampleData();

        mListView = (ListView) findViewById(R.id.seven_wonders_list_view);
//        SimpleAdapter sevenWondersAdapter = new SimpleAdapter(
//                this,
//                mPlayers,
//                R.id.sevenWondersPlayer,
//                new String[] { "Name" },
//                new int[] { android.R.id.text1 });
//        mListView.setAdapter(sevenWondersAdapter);
//
//        AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener() {
//            public void onItemClick(AdapterView<?> parent, View view, int position,
//                                    long id) {
//                setTitle(parent.getItemAtPosition(position).toString());
//            }
//        };
//        mListView.setOnItemClickListener(listener);
    }

    private void updateList() {

    }

    private void createSampleData() {
        String[] players = {"Justin", "Rob", "Josh", "Kevin"};

        for(int i=0; i<players.length; i++) {
            Map map = new HashMap<String, String>();
            map.put("name", players[i]);
            mPlayers.add(map);
        }
    }


}
