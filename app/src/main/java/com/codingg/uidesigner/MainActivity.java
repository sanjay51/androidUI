package com.codingg.uidesigner;

import android.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;

import org.w3c.dom.Text;

import CustomElements.TextViewElement;

public class MainActivity extends ActionBarActivity {
    Button btnAdd = null;
    LinearLayout llCanvas = null;
    LinearLayout llOptions = null;

    static int tvCount = 0;
    View selectedView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeIndex();
    }

    private void initializeIndex() {
        btnAdd = (Button) findViewById(R.id.btnAdd);
        llCanvas = (LinearLayout) findViewById(R.id.llCanvas);
        llOptions = (LinearLayout) findViewById(R.id.llOptions);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTextView();
            }
        });
    }

    private void addTextView() {
        final TextViewElement tv = new TextViewElement(this);
        llCanvas.addView(tv);
    }

    public void showViewOptions() {
        llOptions.setVisibility(View.VISIBLE);

        OptionsFragment optionsFragment = new OptionsFragment();

        optionsFragment.setActivity(this);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fmtOptions, optionsFragment)
                .commit();
    }

    public void showPositionFragment() {
        PositionFragment positionFragment = new PositionFragment();
        positionFragment.setActivity(this);
        positionFragment.setSelectedView(selectedView);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fmtOptions, positionFragment)
                .commit();
    }

    public void setSelectedView(View view) {
        if (selectedView instanceof TextViewElement) {
            ((TextViewElement) selectedView).unselect();
        }
        this.selectedView = view;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
