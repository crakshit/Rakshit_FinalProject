package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TransactionDetailsActivity extends AppCompatActivity {

    TextView amount, category, date, description;
    String amountValuee, categoryuValue, dateValue, descriptionValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_details);

        Intent transactionIntent = getIntent();

        amount = findViewById(R.id.amount);
        category = findViewById(R.id.category);
        date = findViewById(R.id.date);
        description = findViewById(R.id.description);

        amount.setText(transactionIntent.getStringExtra("amount"));
        category.setText(transactionIntent.getStringExtra("category"));
        date.setText(transactionIntent.getStringExtra("date"));
        description.setText(transactionIntent.getStringExtra("description"));

    }
}