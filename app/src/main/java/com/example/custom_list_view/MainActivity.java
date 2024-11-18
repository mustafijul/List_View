package com.example.custom_list_view;

import android.os.Bundle;
import android.widget.ExpandableListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ExpandableListView expandableListView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the ExpandableListView
        expandableListView = findViewById(R.id.expandableListView);

        // Prepare list data
        prepareListData();

        // Set up the adapter
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);
        expandableListView.setAdapter(listAdapter);
    }

    // Method to prepare data for the ExpandableListView
    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();

        // Adding headers (fruits)
        listDataHeader.add("Apple");
        listDataHeader.add("Banana");
        listDataHeader.add("Orange");
        listDataHeader.add("Mango");
        listDataHeader.add("Strawberry");

        // Adding child data (descriptions)
        List<String> apple = new ArrayList<>();
        apple.add("Red, sweet, and crunchy.");

        List<String> banana = new ArrayList<>();
        banana.add("Yellow, soft, and sweet.");

        List<String> orange = new ArrayList<>();
        orange.add("Orange, juicy, and tangy.");

        List<String> mango = new ArrayList<>();
        mango.add("Tropical, sweet, and juicy.");

        List<String> strawberry = new ArrayList<>();
        strawberry.add("Red, juicy, and tangy-sweet.");

        // Mapping data
        listDataChild.put(listDataHeader.get(0), apple);
        listDataChild.put(listDataHeader.get(1), banana);
        listDataChild.put(listDataHeader.get(2), orange);
        listDataChild.put(listDataHeader.get(3), mango);
        listDataChild.put(listDataHeader.get(4), strawberry);
    }
}
