package com.example.anand.twoapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;

import java.util.Date;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button twoAppbutton  = (Button)findViewById(R.id.TwoAppbutton);
        twoAppbutton.setOnClickListener(
            new Button.OnClickListener(){
                public void onClick(View v){
                    TextView TwoApptext = (TextView)findViewById(R.id.TwoApptext);
                    TwoApptext.setText(new Date().toString());
                }
            }

        );


        twoAppbutton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v) {
                        TextView TwoApptext = (TextView) findViewById(R.id.TwoApptext);
                        TwoApptext.setText("Do you want to see the date,then click");
                        return false;
                    }
                }

        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
