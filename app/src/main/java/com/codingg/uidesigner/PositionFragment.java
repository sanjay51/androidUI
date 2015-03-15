package com.codingg.uidesigner;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;

import java.util.HashMap;

import CustomElements.TextViewElement;
import CustomElements.Utils;


public class PositionFragment extends Fragment {
    View rootView = null;
    MainActivity activity;
    Button btnMoveUp = null;
    Button btnMoveDown = null;
    Spinner spinnerGravity = null;
    private View selectedView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_position, container, false);

        initializeIndex();
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    private void initializeIndex() {
        btnMoveUp = (Button) rootView.findViewById(R.id.btnMoveUp);
        btnMoveDown = (Button) rootView.findViewById(R.id.btnMoveDown);
        spinnerGravity = (Spinner) rootView.findViewById(R.id.spinnerGravity);

        btnMoveUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveViewUp();
            }
        });

        btnMoveDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveViewDown();
            }
        });

        setGravityAdapter(((TextViewElement) selectedView).getGravityListAdapter());
        populateAttributes();
    }

    public void setActivity(MainActivity activity) {
        this.activity = activity;
    }

    public void setSelectedView(View selectedView) {
        this.selectedView = selectedView;
    }

    private void moveViewUp() {
        int index = activity.llCanvas.indexOfChild(selectedView);

        if (index == 0) return;
        activity.llCanvas.removeViewAt(index);
        try {
            activity.llCanvas.addView(selectedView, index - 1);
        } catch (IndexOutOfBoundsException e) {
            activity.llCanvas.addView(selectedView, index);
        }
    }

    private void moveViewDown() {
        int index = activity.llCanvas.indexOfChild(selectedView);

        activity.llCanvas.removeViewAt(index);
        try {
            activity.llCanvas.addView(selectedView, index + 1);
        } catch (IndexOutOfBoundsException e) {
            //Occurs when it's the last item in the layout.
            activity.llCanvas.addView(selectedView, index);
        }
    }

    public void populateAttributes() {
        ViewGroup.LayoutParams params = selectedView.getLayoutParams();
        if (selectedView instanceof TextViewElement) {
            int gravity = ((TextViewElement) selectedView).getGravity();

            spinnerGravity.setSelection(((ArrayAdapter<String>) spinnerGravity.getAdapter()).getPosition(Utils.getGravityNameByValue(gravity)));
        }
    }

    public void setGravityAdapter(ArrayAdapter adapter) {
        spinnerGravity.setAdapter(adapter);
    }
}
