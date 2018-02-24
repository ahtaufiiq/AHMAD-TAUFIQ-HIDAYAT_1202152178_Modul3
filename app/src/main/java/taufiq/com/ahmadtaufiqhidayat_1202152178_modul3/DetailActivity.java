package taufiq.com.ahmadtaufiqhidayat_1202152178_modul3;

import android.content.Intent;
import android.graphics.drawable.LevelListDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
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

        final ImageView battery = findViewById(R.id.battery);

        Button plus = findViewById(R.id.plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LevelListDrawable listDrawable = (LevelListDrawable) battery.getDrawable();
                int levelCurrent =listDrawable.getLevel();
                if (levelCurrent==6){

                }else {
                    battery.setImageLevel((levelCurrent + 1));
                }
            }
        });


    }

}
