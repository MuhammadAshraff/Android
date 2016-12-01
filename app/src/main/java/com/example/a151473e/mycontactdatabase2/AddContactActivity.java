package com.example.a151473e.mycontactdatabase2;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class AddContactActivity extends AppCompatActivity {

    Button myAddRecordBtn;
    EditText addNameET;
    EditText addNumET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        addNameET = (EditText) findViewById(R.id.addNameET);
        addNumET = (EditText) findViewById(R.id.addNumET);
        myAddRecordBtn = (Button) findViewById(R.id.addRecordsBtn);

        //step 36 - add listener to add contact into database


    }



}
