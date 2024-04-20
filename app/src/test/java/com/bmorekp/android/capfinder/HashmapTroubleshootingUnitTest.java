package com.bmorekp.android.capfinder;

import static org.junit.Assert.assertEquals;

import android.util.Log;
import android.widget.TextView;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.android.controller.ActivityController;


@RunWith(RobolectricTestRunner.class)
public class HashmapTroubleshootingUnitTest {

    @Test //validates if we can process hash correctly (is later used in main activity)
    public void capAnswerFor_nothing_ReturnsPleaseEnterNumber(){
        Log.v("test","got here");
        try (ActivityController<MainActivity> controller = Robolectric.buildActivity(MainActivity.class)) {

            controller.setup(); // Moves Activity to RESUMED state
            MainActivity activity = controller.get();
            activity.findViewById(R.id.button_submit).performClick();  //click submit button with no imput
            //expect caned response
            assertEquals("Please enter a number below", ((TextView) activity.findViewById(R.id.text_answerHelp)).getText());
        }
    }

    @Test //validates if we can process hash correctly (is later used in main activity)
    public void capAnswerFor_24_Returns_Correct_Response(){
        try (ActivityController<MainActivity> controller = Robolectric.buildActivity(MainActivity.class)) {
            controller.setup(); // Moves Activity to RESUMED state
            MainActivity activity = controller.get();

            //enter in variable
            ((TextView) activity.findViewById(R.id.text_capNumber)).setText("24");
            //click submit button
            activity.findViewById(R.id.button_submit).performClick();
            //expect correct resposne
            assertEquals("Down the hatch", ((TextView) activity.findViewById(R.id.test_capAnswer)).getText());
        }
    }

    @Test //validates if we can process hash correctly (is later used in main activity)
    public void capAnswerFor_NumberNotInValues_Returns_WarningMesage(){
        try (ActivityController<MainActivity> controller = Robolectric.buildActivity(MainActivity.class)) {
            controller.setup(); // Moves Activity to RESUMED state
            MainActivity activity = controller.get();

            //enter in variable
            ((TextView) activity.findViewById(R.id.text_capNumber)).setText("2503");
            //click submit button
            activity.findViewById(R.id.button_submit).performClick();
            //expect correct resposne
            assertEquals("No answer for 2503 can be found\nplease try again", ((TextView) activity.findViewById(R.id.text_answerHelp)).getText());
        }
    }


}