package com.example.dixit.mdmbihar;

/**
 * Created by DIXIT on 2/8/2018.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Six_to_8 extends Fragment {
    Button monday1;
    Button tuesay1;
    Button wednesday1;
    Button thursday1;
    Button friday1;
    Button Saturday1;
    private static final String TAG = "six_to_8";
    private AdView mAdView1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.six_to_8, container, false);
        return rootView;
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mAdView1 = (AdView)view.findViewById(R.id.adView1);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView1.loadAd(adRequest);
        monday1=(Button)view.findViewById(R.id.monday6);


    }
}
