package taufiq.com.ahmadtaufiqhidayat_1202152178_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

import taufiq.com.ahmadtaufiqhidayat_1202152178_modul3.recyclerView.ListItem;
import taufiq.com.ahmadtaufiqhidayat_1202152178_modul3.recyclerView.ListItemAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private LinkedList<ListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new LinkedList<>();

        for (int i =0; i<=10;i++){
            ListItem listItem = new ListItem(
                    "heading"+ i+1,
                    "Lorem Ipsum dummy text"
            );

            listItems.add(listItem);
        }
        adapter = new ListItemAdapter(listItems,this);

        recyclerView.setAdapter(adapter);
    }
}
