package com.triveous.spoon;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

import com.robotium.solo.Solo;
import com.squareup.spoon.Spoon;


/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ActivityInstrumentationTestCase2<MainActivity> {
    public ApplicationTest() {
        super("robottt.example.com.robotiumnew",MainActivity.class);
    }

    private Solo solo;

    public void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation());
        getActivity();
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();
    }

    public void testRun() {
        solo.waitForActivity("MyActivity", 2000);
        Spoon.screenshot(getActivity(), "MyActivity");
        //Sleep for 2993 milliseconds+
        solo.sleep(2993);
        solo.clickOnButton("New Button");
        solo.sleep(2993);
        Spoon.screenshot(getActivity(),"MyActivity");
        Log.d("","done");
    }
}