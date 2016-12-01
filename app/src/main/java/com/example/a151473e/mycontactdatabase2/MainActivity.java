package com.example.a151473e.mycontactdatabase2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    public static MyDbAdapter myDB;
    Context myContext;

    TextView noitemsTV;
    ListView contactsLV;
    ArrayAdapter<String> contactsAdapter;


    // Step 31 - Declare a MyContacts object.


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myContext = this;

        noitemsTV = (TextView) findViewById(R.id.noitemsTV);
        contactsLV = (ListView) findViewById(R.id.contactsLV);
        registerForContextMenu(contactsLV);

        // Step 32 - Assign the static instance



    }

    private void toggleVisibility()
    {
        if(contactsLV.getCount()>0)
        {
            noitemsTV.setVisibility(View.GONE);
            contactsLV.setVisibility(View.VISIBLE);
        }
        else
        {
            contactsLV.setVisibility(View.GONE);
            noitemsTV.setVisibility(View.VISIBLE);
        }
    }

    //step 33 - add retreiveContacts method

    private void retrieveContacts(){



    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        //step 35 - call retrieveContacts();

        toggleVisibility();
        super.onResume();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub
        getMenuInflater().inflate(R.menu.mainmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        if(item.getItemId() == R.id.action_add)
        {
            Intent myIntent = new Intent(MainActivity.this,AddContactActivity.class);
            startActivity(myIntent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenuInfo menuInfo) {
        // TODO Auto-generated method stub
        if(v.getId() == R.id.contactsLV)
        {
            menu.add(1, 0, 0, "Remove");
        }
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    //step 34 - add onContextItemSelected method
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        // TODO Auto-generated method stub

        return super.onContextItemSelected(item);
    }

}