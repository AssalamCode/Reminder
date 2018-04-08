package com.tbreminder.source.auth;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.tbreminder.source.MainActivity;
import com.tbreminder.source.R;

/**
 * Created by Chandra on 08/04/2018.
 */

public class Login extends AppCompatActivity {
    TextView title;
    EditText username;
    TextInputEditText password;
    Button btnA;
    Button btnB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Bundle bundle = getIntent().getExtras();
        String type = bundle.getString("type");
        title = (TextView) findViewById(R.id.titleLogin);
        title.setText("Login "+type);
        username = (EditText) findViewById(R.id.username);
        password = (TextInputEditText) findViewById(R.id.password);
        username.setHint("Nama "+type);
        btnA = (Button)findViewById(R.id.btnA);
        btnB = (Button)findViewById(R.id.btnB);

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username.setText("");
                password.setText("");
            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}

