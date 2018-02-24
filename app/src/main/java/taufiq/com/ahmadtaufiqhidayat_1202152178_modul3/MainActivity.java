package taufiq.com.ahmadtaufiqhidayat_1202152178_modul3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

        listItems.add(new ListItem("Ades", "Description", R.drawable.ades));
        listItems.add(new ListItem("Amidis", "Description", R.drawable.aqua));
        listItems.add(new ListItem("Aqua", "Description", R.drawable.amidis));
        listItems.add(new ListItem("Cleo", "Description", R.drawable.cleo));
        listItems.add(new ListItem("Club", "Description", R.drawable.club));
        listItems.add(new ListItem("Equil", "Description", R.drawable.equil));
        listItems.add(new ListItem("Evian", "Description", R.drawable.evian));
        listItems.add(new ListItem("Leminerale", "Description", R.drawable.leminerale));
        listItems.add(new ListItem("Nestle", "Description", R.drawable.nestle));
        listItems.add(new ListItem("Pristine", "Description", R.drawable.pristine));
        listItems.add(new ListItem("Vit", "Description", R.drawable.vit));

        adapter = new ListItemAdapter(listItems, this);

        recyclerView.setAdapter(adapter);
    }
}
