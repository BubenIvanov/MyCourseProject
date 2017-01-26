package com.test.bubenivanov.mycourseproject;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.test.bubenivanov.mycourseproject.ApplicationOne.APP_PREFERENCES;
import static com.test.bubenivanov.mycourseproject.ApplicationOne.APP_PREF_NAME;
import static com.test.bubenivanov.mycourseproject.ApplicationOne.APP_PREF_PASS;
public class LoginActivity extends AppCompatActivity {
Button singIn,singUp;
    EditText name,password;
    private SharedPreferences account;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

name=(EditText) findViewById(R.id.user_name);
        password=(EditText) findViewById(R.id.pass);
singIn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        account =getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);


        if((name.getText().toString()==account.getString(APP_PREF_NAME,""))&& (password.getText().toString()==account.getString(APP_PREF_PASS,"")))
        {

            Intent welcome = new Intent(LoginActivity.this, WelcomeActivity.class);
            startActivity(welcome);
        }
        else Toast.makeText(getApplicationContext(),"Wrong Name!",Toast.LENGTH_SHORT).show();


    }
});

singUp.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(LoginActivity.this,RegistrationActivity.class));

    }
});

    }
}
