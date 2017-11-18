package com.example.sleepylizard.reinksample;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragOffer extends Fragment {

    View vOffer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vOffer = inflater.inflate(R.layout.frag_offer_layout, container, false);
        return vOffer;
    }
}
