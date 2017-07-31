package com.chrisli.spotimy.ui.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Chris Li on 2017-07-27.
 */

public class TrackListAdapter extends RecyclerView.Adapter<TrackListAdapter.TrackListItemViewHolder> {


    @Override
    public TrackListItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(TrackListItemViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class TrackListItemViewHolder extends RecyclerView.ViewHolder {

        public TrackListItemViewHolder(View itemView) {
            super(itemView);
        }
    }
}
