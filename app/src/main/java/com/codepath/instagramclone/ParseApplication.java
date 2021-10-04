package com.codepath.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("CGfnxP4ksgAJ00Xz19M0x5c9x6fVMXviRXu4tJaC")
                .clientKey("4xeiq8opMvNwAPOw9ZbZkx3Uryi7LYVhmwPDd0YS")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
