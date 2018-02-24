package taufiq.com.ahmadtaufiqhidayat_1202152178_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String mTitle = intent.getStringExtra("title");
        String mDescription = intent.getStringExtra("description");

        TextView title = findViewById(R.id.titleDetail);
        title.setText(mTitle);

        TextView description = findViewById(R.id.descriptionDetail);
        description.setText(mDescription);

    }
}
