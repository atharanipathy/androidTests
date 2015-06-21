package com.example.anand.myapplicationone;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.content.res.Resources;
import android.util.TypedValue;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);

        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setBackgroundColor(Color.GRAY);

        EditText userInput = new EditText(this);
        userInput.setId(2);
        RelativeLayout.LayoutParams userInputDetails =new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        userInputDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        userInputDetails.addRule(RelativeLayout.CENTER_VERTICAL);


        RelativeLayout.LayoutParams buttonDetails =new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        Resources r = getResources();
        int px = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,r.getDisplayMetrics());
        userInput.setWidth(px);

        Button button = new Button(this);
        button.setId(1);
        button.setText("Hello World");
        button.setBackgroundColor(Color.BLUE);
        relativeLayout.addView(button, buttonDetails);
        setContentView(relativeLayout);

        userInputDetails.addRule(RelativeLayout.ABOVE, button.getId());
        userInputDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        userInputDetails.setMargins(0, 0, 0, 50);

        relativeLayout.addView(userInput, userInputDetails);
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
