package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.content.Context;
import android.os.AsyncTask;
import android.test.AndroidTestCase;
import android.test.ApplicationTestCase;
import android.util.Pair;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {

    public ApplicationTest() {
        super(Application.class);
    }

    public void testVerifyEndpointAsyncTaskResponse()  {
        EndpointsAsyncTask task = new EndpointsAsyncTask();


        task.doInBackground(new Pair<Context, String>(getContext(), "Manfred"));
        while(task.getStatus() == AsyncTask.Status.FINISHED){
            try {
                Thread.sleep(300);
            }
            catch(Exception ex){

            }
        }
        assertNotNull(task.RetreivedJoke);
    }


}

/*public class EchoAndroidTest extends AndroidTestCase {
    public void testVerifyEchoResponse() {
        assertEquals("hello", Echo.echo("hello"));
    }

    public void testVerifyLoggingEchoResponse() {
        assertEquals("hello", Echo.echo("hello", true));
    }
}*/