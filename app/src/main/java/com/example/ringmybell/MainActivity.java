package com.example.ringmybell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button liveStream, notifications, history;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Action bar stuff
        getSupportActionBar().setTitle("");

        System.out.println("In Main Activity");

        //region Activity Calling
        /************************************/
        liveStream = findViewById(R.id.liveStream);
        liveStream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLiveStreaming();
            }
        });
        /**********************************/
        notifications = findViewById(R.id.notifications);
        notifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNotifications();
            }
        });
        /***********************************/
        history = findViewById(R.id.history);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHistory();
            }
        });
        //endregion
    }

    //region Methods
    /************************* METHODS **********************************/

    /************* Method for opening Live Streaming *************/
    public void openLiveStreaming(){
        Intent intent = new Intent(this, StreamActivity.class);
        startActivity(intent);
    }
    /************ Method for opening Notifications *************/
    public void openNotifications(){
        Intent intent = new Intent(this,NotificationActivity.class);
        startActivity(intent);
    }
    /************* Method for opening History *****************/
    public void openHistory(){
        Intent intent = new Intent(this, HistoryActivity.class);
        startActivity(intent);
    }
    /************* Method for opening Menu Options ****************/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        String  contactInfo= "Contact Information:\nEmail: aalasfar@uci.edu\nPhone: (619) 796-8424";
        String aboutInfo = "Pimp My Bell is a Device";

        if(id == R.id.menu_home){
            Toast.makeText(this,"Home Menu Clicked!",Toast.LENGTH_SHORT).show();
        }
        if(id == R.id.menu_setting){
            Toast.makeText(this,"Setting Menu Clicked!",Toast.LENGTH_SHORT).show();
        }
        if(id == R.id.menu_contact){
            Toast.makeText(this,contactInfo,Toast.LENGTH_LONG).show();
        }
        if(id == R.id.menu_about){
            Toast.makeText(this,aboutInfo, Toast.LENGTH_LONG).show();
        }
        if(id == R.id.menu_share){
            Toast.makeText(this,aboutInfo, Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }

}
