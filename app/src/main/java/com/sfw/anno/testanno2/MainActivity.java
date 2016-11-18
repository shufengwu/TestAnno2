package com.sfw.anno.testanno2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.MyAnnotation;

@MyAnnotation("Hello Annotation")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
