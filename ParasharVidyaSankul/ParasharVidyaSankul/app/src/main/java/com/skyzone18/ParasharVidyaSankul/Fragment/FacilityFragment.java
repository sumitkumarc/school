package com.skyzone18.ParasharVidyaSankul.Fragment;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.skyzone18.ParasharVidyaSankul.R;

public class FacilityFragment extends Fragment {
    WebView webView;


    public FacilityFragment() {
        // Required empty public constructor
    }

    public static FacilityFragment newInstance(String param1, String param2) {
        FacilityFragment fragment = new FacilityFragment();
        Bundle args = new Bundle();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view  =inflater.inflate(R.layout.fragment_actvities, container, false);
        webView = (WebView) view.findViewById(R.id.actiwebview);
        webView.loadUrl("file:///android_asset/Facility.html");
        webView.setBackgroundColor(Color.TRANSPARENT);
        return view ;
    }





    @Override
    public void onDetach() {
        super.onDetach();

    }


}
