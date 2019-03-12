package com.example.archi.boozimba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignIn extends AppCompatActivity {
    Button login;
    EditText email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        email = findViewById(R.id.email);
        login = findViewById(R.id.login);
        password = findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textemail = email.getText().toString();
                String textpassword = password.getText().toString();
                Intent intent = new Intent(getApplicationContext(),OptionsActivity.class);
                startActivity(intent);
            }
        });
    }
}
