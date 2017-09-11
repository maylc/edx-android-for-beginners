package com.beginner.micromaster.contactlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView contactName     = (TextView) findViewById(R.id.contact_name);
        TextView contactLastName = (TextView) findViewById(R.id.contact_last_name);
        TextView contactEmail    = (TextView) findViewById(R.id.contact_email);
        TextView contactPhone    = (TextView) findViewById(R.id.contact_phone);

        Bundle b = new Bundle();
        b = getIntent().getExtras();

        //TODO: get the rest of contact parameters
        String name     = b.getString("name");
        String lastName = b.getString("lastName");
        String email    = b.getString("email");
        String phone    = b.getString("phoneNumber");

        //TODO: once you have all the values for a contact add them to the views
        contactName.setText(name);
        contactLastName.setText(lastName);
        contactEmail.setText(email);
        contactPhone.setText(phone);

    }
}
