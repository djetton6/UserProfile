package com.example.android.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.widget.ImageView image = (android.widget.ImageView)  findViewById(R.id.profilepicture);
        image.setImageResource(R.drawable.headshot);

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(R.string.user_name);

        TextView birthday = (TextView) findViewById(R.id.birthday);
        birthday.setText(R.string.user_bday);

        TextView country = (TextView) findViewById(R.id.country);
        country.setText(R.string.user_country);

    }
}
