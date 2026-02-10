package com.rodgar00.petmatch;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;


public class Pets extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pets);
    }
}
