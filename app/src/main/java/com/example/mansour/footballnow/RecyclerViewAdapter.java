package com.example.mansour.footballnow;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mansour on 9/5/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ClubViewHolder> {
    List<Club> mClubs;

    public RecyclerViewAdapter(List<Club> mClubs) {
        this.mClubs = mClubs;
    }


    public static class ClubViewHolder extends RecyclerView.ViewHolder{
        CardView mCardView;
        TextView mTextViewClubName;
        //ImageView mImageViewClubLogo;

        public ClubViewHolder(View itemView){
            super(itemView);
            mCardView = (CardView) itemView.findViewById(R.id.cardView);
            mTextViewClubName = (TextView) itemView.findViewById(R.id.textViewName);
            //mImageViewClubLogo = (ImageView) itemView.findViewById(R.id.imageViewLogo);
        }
    }


    @NonNull
    @Override
    public ClubViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        ClubViewHolder mClubViewHolder = new ClubViewHolder(mView);
        return mClubViewHolder;
    }

    @Override
    public void onBindViewHolder(ClubViewHolder holder, int position) {
        holder.mTextViewClubName.setText(mClubs.get(position).mName);
        //holder.mImageViewClubLogo.setImageResource(mClubs.get(position).mLogo);
    }

    @Override
    public int getItemCount() {
        return mClubs.size();
    }
}
