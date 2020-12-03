package com.example.finalproject;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.MyViewHolder>  {


    List<Transaction> mDataset;
    Context context;


    public TransactionAdapter(List<Transaction> mDataset, Context context) {
        this.mDataset = mDataset;
        this.context = context;
    }

    public TransactionAdapter(List<Transaction> mDataset) {
        this.mDataset = mDataset;
    }


    static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView transaction_type;
        TextView transaction_category, transaction_amount;
        ConstraintLayout transaction_layout;

        public MyViewHolder(View transactionView) {
            super(transactionView);
            transaction_type = transactionView.findViewById(R.id.transaction_type);
            transaction_category = transactionView.findViewById(R.id.transaction_category);
            transaction_amount = transactionView.findViewById(R.id.transaction_amount);
            transaction_layout = transactionView.findViewById(R.id.transaction_layout);
        }
    }

    @Override
    public TransactionAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int ViewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position){
        final Transaction transaction = mDataset.get(position);
        Log.i("test",transaction.getCategory());
        holder.transaction_category.setText(transaction.getCategory());
        holder.transaction_amount.setText(String.valueOf(transaction.getAmount()));
        holder.transaction_type.setImageResource(R.drawable.add);


        //Click even for each product
        holder.transaction_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,TransactionDetailsActivity.class);
                intent.putExtra("type",transaction.getType());
                intent.putExtra("category",transaction.getCategory());
                intent.putExtra("amount",String.valueOf(transaction.getAmount()));
                intent.putExtra("description",transaction.getDescription());
                intent.putExtra("date",transaction.getDate());

                //Log.i("context",""+context);
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount()
    {
        return mDataset.size();
    }
}
