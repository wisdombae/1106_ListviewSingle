package com.bjh.www.a1106_listviewsingle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] FRUITS = new String[] {"Apple", "Avocado", "Banana", "Blueberry"};
        ListView listView = (ListView)findViewById(R.id.resultList);
        ListView listView1 = (ListView)findViewById(R.id.resultList1);
        ListView listView2 = (ListView)findViewById(R.id.resultList2);

        Button button = (Button)findViewById(R.id.button);

        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this, R.layout.listview_single_column, FRUITS);

        listView.setAdapter(arrayAdapter);
        listView1.setAdapter(arrayAdapter);
        listView2.setAdapter(arrayAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
