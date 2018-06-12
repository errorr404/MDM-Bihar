package com.example.dixit.mdmbihar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by DIXIT on 2/8/2018.
 */

public class Zero_to_5 extends Fragment {
    Button monday;
    Button tuesay;
    Button wednesday;
    Button thursday;
    Button friday;
    Button Saturday;
    private static final String TAG = "Zero_to_5";
    private AdView mAdView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.zero_to_5, container, false);

        return rootView;

    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mAdView = (AdView)view.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        monday=(Button)view.findViewById(R.id.monday0_5);
        tuesay=(Button)view.findViewById(R.id.tuesday0_5);
        wednesday=(Button)view.findViewById(R.id.wednesday0_5);
        thursday=(Button)view.findViewById(R.id.tuesday0_5);
        friday=(Button)view.findViewById(R.id.friday0_5);
        Saturday=(Button)view.findViewById(R.id.saturday0_5);
}
}
