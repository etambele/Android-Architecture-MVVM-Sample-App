package com.ambell.androidmvvmdemo;

import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;


public class MainActivity extends AppCompatActivity {

    private NoteViewModel noteViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        noteViewModel = ViewModelProviders.of(this).get(NoteViewModel.class);
        noteViewModel.getAllNotes().observe(this, notes -> {
            //update RecyclerView
            Toast.makeText(MainActivity.this, "unchanged", Toast.LENGTH_SHORT).show();
        });
    }
}
