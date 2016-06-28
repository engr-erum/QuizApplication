package com.sample.quizapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;

/**
 * Created by ericbhatti on 6/27/16.
 * <p/>
 * <p/>
 * <p/> Class Description:
 *
 * @author Eric Bhatti
 *         <p/>
 *         Company Name: Arpatech (http://arpatech.com/)
 *         <p/>
 *         Jira Ticket: NULL
 * @since 27 June, 2016
 */
public class IntroQuizActivity extends AppCompatActivity {
    private final String TAG = IntroQuizActivity.class.getName();
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState)
     {
       super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_introquiz);
         toolbar = (Toolbar)findViewById(R.id.toolbar);
         toolbar.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
         setSupportActionBar(toolbar);

         getSupportActionBar().setTitle("");
         getSupportActionBar().setDisplayHomeAsUpEnabled(true);
         getSupportActionBar().setDisplayShowHomeEnabled(true);
     }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        boolean result = true;
        switch (item.getItemId()) {
            case android.R.id.home:
                //onBackPressed();
                Log.d(TAG,"home clicked:");
                result = true;
                break;

            default:

                result = super.onOptionsItemSelected(item);
                break;
        }
        return result;
    }
}
