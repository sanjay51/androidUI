package CustomElements;

import android.app.ActionBar;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

import com.codingg.uidesigner.MainActivity;
import com.codingg.uidesigner.R;

import java.util.ArrayList;

/**
 * Created by sanjav on 3/14/15.
 */
public class TextViewElement extends TextView {
    public static ArrayList<TextViewElement> AllTextViewElements = new ArrayList<>();
    private MainActivity activity = null;
    private boolean isSelected = false;
    private static int count = 0;

    private int marginTop = 0;
    private int marginBottom = 0;
    private int marginLeft = 0;
    private int marginRight = 0;

    public TextViewElement(MainActivity activity) {
        super(activity);
        this.activity = activity;

        init();
    }

    private void init() {
        ViewGroup.LayoutParams lparams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        this.setLayoutParams(lparams);

        count++;
        this.setText("New Text " + count);
        this.setId(View.generateViewId());
        this.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setBackgroundColor(getResources().getColor(R.color.darkgreen));
                setIsSelected(true);
                showViewOptions();
            }
        });

        AllTextViewElements.add(this);
    }

    private void showViewOptions() {
        activity.showViewOptions();
    }

    private void setIsSelected(boolean isSelected) {
        if (isSelected) {
            this.isSelected = true;
            activity.setSelectedView(this);
        }
    }

    public void unselect() {
        this.isSelected = false;
        setBackgroundColor(getResources().getColor(R.color.darkred));
    }

    public void moveUp() {
        LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        params.setMargins(marginLeft , --marginTop, marginRight, marginBottom);
        setLayoutParams(params);
    }


    public void moveDown() {
        LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        params.setMargins(marginLeft , marginTop, marginRight, ++marginBottom);
        setLayoutParams(params);
    }

    public ArrayAdapter<String> getGravityListAdapter() {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(activity, android.R.layout.simple_list_item_1, Utils.getGravityNameList());
        return adapter;
    }
}
