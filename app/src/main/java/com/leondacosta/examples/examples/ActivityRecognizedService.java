package com.leondacosta.examples.examples;

import android.app.IntentService;
import android.content.Intent;

/**
 * Created by ldacosta on 26/04/17.
 */

public class ActivityRecognizedService extends IntentService {

    public ActivityRecognizedService() {
        super("ActivityRecognizedService");
    }

    public ActivityRecognizedService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
    }

}
