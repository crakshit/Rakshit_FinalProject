package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import info.androidhive.fontawesome.FontDrawable;

public class DashboardActivity extends AppCompatActivity {


    private RecyclerView transactionRecycler;
    private RecyclerView.Adapter transactionAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private List<Transaction> transactionDataset;

    ImageView addBtnImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        addBtnImage = findViewById(R.id.addBtnImage);
        //addBtnImage.setImageDrawable(FontDrawable.createFromPath(String.valueOf(R.string.fa_plus_circle_solid)));

        Intent myIntent = getIntent();

        transactionRecycler = findViewById(R.id.transactionRecycler);
        layoutManager = new LinearLayoutManager(this);
        transactionRecycler.setLayoutManager(layoutManager);

        transactionDataset = new ArrayList<>();

        transactionDataset.add(new Transaction("Income","Salary","Blah Blah", "02-12-2020",585.25));
        transactionDataset.add(new Transaction("Income","Salary","Blah Blah", "02-12-2020",585.25));
        transactionDataset.add(new Transaction("Income","Salary","Blah Blah", "02-12-2020",585.25));
        transactionDataset.add(new Transaction("Income","Salary","Blah Blah", "02-12-2020",585.25));
        transactionDataset.add(new Transaction("Income","Salary","Blah Blah", "02-12-2020",585.25));



        transactionAdapter = new TransactionAdapter(transactionDataset,DashboardActivity.this);
        transactionRecycler.setAdapter(transactionAdapter);
    }
}