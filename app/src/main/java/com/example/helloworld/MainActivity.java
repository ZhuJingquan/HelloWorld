package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.jdom2.Document;
import org.jdom2.JDOMConstants;
import org.json.JSONArray;

//import org.jdom2.JDOMConstants;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        JDOMConstants jdom = new JDOMConstants();
        Document doc = new Document();
        JSONArray jArray = new JSONArray();
    }
}
