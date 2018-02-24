package taufiq.com.ahmadtaufiqhidayat_1202152178_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void Login(View view) {
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);

        if (username.getText().toString().equals("EAD") && password.getText().toString().equals("MOBILE")){
            Intent intent = new Intent(LoginActivity.this,MainActivity.class);
            startActivity(intent);
        }
    }
}
