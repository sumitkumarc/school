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


public class ActvitiesFragment extends Fragment {
    WebView webView;

    private OnFragmentInteractionListener mListener;

    public ActvitiesFragment() {

    }

    public static ActvitiesFragment newInstance(String param1, String param2) {
        ActvitiesFragment fragment = new ActvitiesFragment();
        Bundle args = new Bundle();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view  =inflater.inflate(R.layout.fragment_actvities, container, false);
        webView = (WebView) view.findViewById(R.id.actiwebview);
        webView.loadUrl("file:///android_asset/Activity.html");
        webView.setBackgroundColor(Color.TRANSPARENT);
        return view ;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }



    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
