package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import static junit.framework.Assert.assertTrue;


@RunWith(AndroidJUnit4.class)
public class AnycTaskTest{

    @Test
    public void callTaskAndCheckIfItReturnsSomething(){
        new EndpointsAsyncTask(new EndpointsAsyncTask.CallbackAsyncTask() {
            @Override
            public void onFinish(String joke) {
                assertTrue(!joke.isEmpty());
            }

        }).execute();
    }
}
