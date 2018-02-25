package taufiq.com.ahmadtaufiqhidayat_1202152178_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void Login(View view) {
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);

        if (username.getText().toString().equals("EAD") && password.getText().toString().equals("MOBILE")) {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            Toast.makeText(this, "Login Berhasil", Toast.LENGTH_LONG).show();
            startActivity(intent);
        } else {
            Toast.makeText(this, "Password dengan Username Tidak sesuai", Toast.LENGTH_LONG).show();
        }
    }
}
