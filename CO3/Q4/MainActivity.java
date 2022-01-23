package com.example.options_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("ResourceType")
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater i= getMenuInflater();
        i.inflate(R.layout.my_options_menu,menu);
        return  true;
        // return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        int id=item.getItemId();
        if(id==R.id.action_contact)
        {
            Intent contactintent=new Intent(MainActivity.this,ContactActivity.class);
            startActivity(contactintent);
        }
        if(id==R.id.action_settings)
        {
            Intent settingsintent=new Intent(MainActivity.this,SettingsActivity.class);
            startActivity(settingsintent);
        }
        if (id==R.id.action_help)
        {
            Intent helpintent=new Intent(MainActivity.this,HelpActivity.class);
            startActivity(helpintent);
        }
        if(id==R.id.action_share)
        {
            Intent shareintent=new Intent(MainActivity.this,ShareActivity.class);
            startActivity(shareintent);
        }
        return super.onOptionsItemSelected(item);
    }
}
