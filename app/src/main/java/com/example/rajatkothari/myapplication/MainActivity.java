package com.example.rajatkothari.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;




public class MainActivity extends Activity {

    String[] names={"Gaurav Yadav","Uday Singh","Savita Devi","Rahul Yadav","Rohit Yadav"};
    String[] relation={"Myself","my father","my mother","my elder brother","my younger brother"};
    Integer[] a={R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView x =(ListView) findViewById(R.id.listView);
        x.setAdapter(new SecondArrayAdapter(this,R.id.listView,names,relation,a)) ;



    }



}
