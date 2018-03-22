package taufiq.com.ahmadtaufiqhidayat_1202152178_modul3;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
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

        //find RecyclerView
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));



        //Create variabel LinkedList for save data
        listItems = new LinkedList<>();

        //adding data
        listItems.add(new ListItem("Ades", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean mauris ligula, blandit sit amet mi nec, egestas convallis lectus. Vestibulum lectus ligula, porttitor et ex eget, porttitor rhoncus enim. Vestibulum cursus libero vitae rhoncus porttitor. Nunc tincidunt sit amet magna et tincidunt. Suspendisse vestibulum sollicitudin tincidunt. Nam nunc urna, tempus quis mi non, sodales rhoncus lacus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nunc nisi ipsum, porta at tempor in, semper a nulla. In porttitor mattis mauris eu lobortis. Sed lacinia libero turpis, non tempor ligula volutpat eu. Pellentesque ultricies purus vitae arcu rhoncus rutrum.", R.drawable.ades));
        listItems.add(new ListItem("Amidis", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean mauris ligula, blandit sit amet mi nec, egestas convallis lectus. Vestibulum lectus ligula, porttitor et ex eget, porttitor rhoncus enim. Vestibulum cursus libero vitae rhoncus porttitor. Nunc tincidunt sit amet magna et tincidunt. Suspendisse vestibulum sollicitudin tincidunt. Nam nunc urna, tempus quis mi non, sodales rhoncus lacus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nunc nisi ipsum, porta at tempor in, semper a nulla. In porttitor mattis mauris eu lobortis. Sed lacinia libero turpis, non tempor ligula volutpat eu. Pellentesque ultricies purus vitae arcu rhoncus rutrum.", R.drawable.aqua));
        listItems.add(new ListItem("Aqua", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean mauris ligula, blandit sit amet mi nec, egestas convallis lectus. Vestibulum lectus ligula, porttitor et ex eget, porttitor rhoncus enim. Vestibulum cursus libero vitae rhoncus porttitor. Nunc tincidunt sit amet magna et tincidunt. Suspendisse vestibulum sollicitudin tincidunt. Nam nunc urna, tempus quis mi non, sodales rhoncus lacus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nunc nisi ipsum, porta at tempor in, semper a nulla. In porttitor mattis mauris eu lobortis. Sed lacinia libero turpis, non tempor ligula volutpat eu. Pellentesque ultricies purus vitae arcu rhoncus rutrum.", R.drawable.amidis));
        listItems.add(new ListItem("Cleo", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean mauris ligula, blandit sit amet mi nec, egestas convallis lectus. Vestibulum lectus ligula, porttitor et ex eget, porttitor rhoncus enim. Vestibulum cursus libero vitae rhoncus porttitor. Nunc tincidunt sit amet magna et tincidunt. Suspendisse vestibulum sollicitudin tincidunt. Nam nunc urna, tempus quis mi non, sodales rhoncus lacus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nunc nisi ipsum, porta at tempor in, semper a nulla. In porttitor mattis mauris eu lobortis. Sed lacinia libero turpis, non tempor ligula volutpat eu. Pellentesque ultricies purus vitae arcu rhoncus rutrum.", R.drawable.cleo));
        listItems.add(new ListItem("Club", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean mauris ligula, blandit sit amet mi nec, egestas convallis lectus. Vestibulum lectus ligula, porttitor et ex eget, porttitor rhoncus enim. Vestibulum cursus libero vitae rhoncus porttitor. Nunc tincidunt sit amet magna et tincidunt. Suspendisse vestibulum sollicitudin tincidunt. Nam nunc urna, tempus quis mi non, sodales rhoncus lacus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nunc nisi ipsum, porta at tempor in, semper a nulla. In porttitor mattis mauris eu lobortis. Sed lacinia libero turpis, non tempor ligula volutpat eu. Pellentesque ultricies purus vitae arcu rhoncus rutrum.", R.drawable.club));
        listItems.add(new ListItem("Equil", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean mauris ligula, blandit sit amet mi nec, egestas convallis lectus. Vestibulum lectus ligula, porttitor et ex eget, porttitor rhoncus enim. Vestibulum cursus libero vitae rhoncus porttitor. Nunc tincidunt sit amet magna et tincidunt. Suspendisse vestibulum sollicitudin tincidunt. Nam nunc urna, tempus quis mi non, sodales rhoncus lacus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nunc nisi ipsum, porta at tempor in, semper a nulla. In porttitor mattis mauris eu lobortis. Sed lacinia libero turpis, non tempor ligula volutpat eu. Pellentesque ultricies purus vitae arcu rhoncus rutrum.", R.drawable.equil));
        listItems.add(new ListItem("Evian", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean mauris ligula, blandit sit amet mi nec, egestas convallis lectus. Vestibulum lectus ligula, porttitor et ex eget, porttitor rhoncus enim. Vestibulum cursus libero vitae rhoncus porttitor. Nunc tincidunt sit amet magna et tincidunt. Suspendisse vestibulum sollicitudin tincidunt. Nam nunc urna, tempus quis mi non, sodales rhoncus lacus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nunc nisi ipsum, porta at tempor in, semper a nulla. In porttitor mattis mauris eu lobortis. Sed lacinia libero turpis, non tempor ligula volutpat eu. Pellentesque ultricies purus vitae arcu rhoncus rutrum.", R.drawable.evian));
        listItems.add(new ListItem("Leminerale", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean mauris ligula, blandit sit amet mi nec, egestas convallis lectus. Vestibulum lectus ligula, porttitor et ex eget, porttitor rhoncus enim. Vestibulum cursus libero vitae rhoncus porttitor. Nunc tincidunt sit amet magna et tincidunt. Suspendisse vestibulum sollicitudin tincidunt. Nam nunc urna, tempus quis mi non, sodales rhoncus lacus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nunc nisi ipsum, porta at tempor in, semper a nulla. In porttitor mattis mauris eu lobortis. Sed lacinia libero turpis, non tempor ligula volutpat eu. Pellentesque ultricies purus vitae arcu rhoncus rutrum.", R.drawable.leminerale));
        listItems.add(new ListItem("Nestle", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean mauris ligula, blandit sit amet mi nec, egestas convallis lectus. Vestibulum lectus ligula, porttitor et ex eget, porttitor rhoncus enim. Vestibulum cursus libero vitae rhoncus porttitor. Nunc tincidunt sit amet magna et tincidunt. Suspendisse vestibulum sollicitudin tincidunt. Nam nunc urna, tempus quis mi non, sodales rhoncus lacus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nunc nisi ipsum, porta at tempor in, semper a nulla. In porttitor mattis mauris eu lobortis. Sed lacinia libero turpis, non tempor ligula volutpat eu. Pellentesque ultricies purus vitae arcu rhoncus rutrum.", R.drawable.nestle));
        listItems.add(new ListItem("Pristine", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean mauris ligula, blandit sit amet mi nec, egestas convallis lectus. Vestibulum lectus ligula, porttitor et ex eget, porttitor rhoncus enim. Vestibulum cursus libero vitae rhoncus porttitor. Nunc tincidunt sit amet magna et tincidunt. Suspendisse vestibulum sollicitudin tincidunt. Nam nunc urna, tempus quis mi non, sodales rhoncus lacus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nunc nisi ipsum, porta at tempor in, semper a nulla. In porttitor mattis mauris eu lobortis. Sed lacinia libero turpis, non tempor ligula volutpat eu. Pellentesque ultricies purus vitae arcu rhoncus rutrum.", R.drawable.pristine));
        listItems.add(new ListItem("Vit", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean mauris ligula, blandit sit amet mi nec, egestas convallis lectus. Vestibulum lectus ligula, porttitor et ex eget, porttitor rhoncus enim. Vestibulum cursus libero vitae rhoncus porttitor. Nunc tincidunt sit amet magna et tincidunt. Suspendisse vestibulum sollicitudin tincidunt. Nam nunc urna, tempus quis mi non, sodales rhoncus lacus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nunc nisi ipsum, porta at tempor in, semper a nulla. In porttitor mattis mauris eu lobortis. Sed lacinia libero turpis, non tempor ligula volutpat eu. Pellentesque ultricies purus vitae arcu rhoncus rutrum.", R.drawable.vit));

        //add data to adapter
        adapter = new ListItemAdapter(listItems, this);
        //set adapter
        recyclerView.setAdapter(adapter);
    }

}
