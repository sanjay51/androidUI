package com.codingg.uidesigner;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class OptionsFragment extends Fragment {
    View rootView = null;
    MainActivity activity;
    Button btnPosition = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_options, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initializeIndex();
    }

    private void initializeIndex() {
        btnPosition = (Button) rootView.findViewById(R.id.btnPosition);

        btnPosition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.showPositionFragment();
            }
        });
    }

    public void setActivity(MainActivity activity) {
        this.activity = activity;
    }
}
