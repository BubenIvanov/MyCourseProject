package com.test.bubenivanov.mycourseproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationActivity extends AppCompatActivity {
ApplicationOne prefAct;
    EditText name;
    EditText email;
    EditText password;
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        name = (EditText) findViewById(R.id.regname);
        email=(EditText)findViewById(R.id.regemail);
        password = (EditText) findViewById(R.id.regpassword );
        register=(Button) findViewById(R.id.register);


        prefAct.PutInPref(name,email,password);
register.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(RegistrationActivity.this, WelcomeActivity.class);
        startActivity(intent);
    }
});


    }
}
