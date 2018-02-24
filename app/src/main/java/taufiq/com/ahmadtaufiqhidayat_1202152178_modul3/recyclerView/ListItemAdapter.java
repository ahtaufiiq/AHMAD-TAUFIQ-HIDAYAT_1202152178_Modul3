package taufiq.com.ahmadtaufiqhidayat_1202152178_modul3.recyclerView;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.LinkedList;

import taufiq.com.ahmadtaufiqhidayat_1202152178_modul3.DetailActivity;
import taufiq.com.ahmadtaufiqhidayat_1202152178_modul3.MainActivity;
import taufiq.com.ahmadtaufiqhidayat_1202152178_modul3.R;

/**
 * Created by taufiq on 25/02/18.
 */

public class ListItemAdapter extends RecyclerView.Adapter<ListItemAdapter.ViewHolder> {

    private final LinkedList<ListItem> listItems;
    private Context context;

    public ListItemAdapter(LinkedList<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }


    @Override
    public ListItemAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ListItemAdapter.ViewHolder holder, int position) {

        final ListItem listItem = listItems.get(position);

        holder.textViewTitle.setText(listItem.getTitle());
        holder.textViewDescription.setText(listItem.getDescription());
        holder.linearLayout.setBackgroundResource(listItem.getFoto());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("title",listItem.getTitle());
                intent.putExtra("description",listItem.getDescription());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewTitle;
        public TextView textViewDescription;
        public LinearLayout linearLayout;
        public CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.titleProduct);
            textViewDescription= itemView.findViewById(R.id.description);
            cardView = itemView.findViewById(R.id.cardView);
            linearLayout= itemView.findViewById(R.id.linearLayout);
        }
    }
}
