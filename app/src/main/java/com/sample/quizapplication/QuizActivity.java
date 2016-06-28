package com.sample.quizapplication;

import android.app.Activity;
import android.os.Bundle;

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
public class QuizActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }
}
