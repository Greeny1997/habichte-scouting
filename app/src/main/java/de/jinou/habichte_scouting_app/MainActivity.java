package de.jinou.habichte_scouting_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText passwortEditText;
    EditText emailEditText;
    TextView errorText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        errorText = (TextView)findViewById(R.id.errorText);
        emailEditText = (EditText)findViewById(R.id.emailInput);
        passwortEditText = (EditText)findViewById(R.id.passwortInput);
    }

    public void onLoginCLick(View v){
        String passwort = "";
        String email = "";
        //
        email = emailEditText.getText().toString();
        passwort = passwortEditText.getText().toString();
        if(login(passwort, email))
        {
            Intent intent = new Intent(MainActivity.this, DashboardActivity.class);
            startActivity(intent);
        }
    }

    public boolean login(String passort, String email){
        //TODO: aufrufen der api
        if(isEmailInvalid(email))
        {
            return false;
        }
        return true;
    }

    private boolean isEmailInvalid(String email) {
        //TODO: Replace this with your own logic
        boolean invalid = !email.contains("@");
        if(invalid) {
            errorText.setText("Email Invalid!");
            errorText.setVisibility(View.VISIBLE);
        }
        return invalid;
    }
}
