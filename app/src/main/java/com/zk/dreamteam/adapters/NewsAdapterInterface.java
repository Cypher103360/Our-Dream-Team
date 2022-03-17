package com.zk.dreamteam.adapters;


import com.zk.dreamteam.models.MatchNewsModels.NewsDatum;

public interface NewsAdapterInterface {
    void onItemClicked(NewsDatum newsDatum, int position);
}
