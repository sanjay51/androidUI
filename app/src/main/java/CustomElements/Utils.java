package CustomElements;

import android.view.Gravity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sanjav on 3/15/15.
 */
public class Utils {
    public static HashMap<Integer, String> gravityValueToNameMap = new HashMap<>();
    public static HashMap<String, Integer> gravityNameToValueMap = new HashMap<>();
    public static List<String> gravityNameList = new ArrayList<>();

    static {
        gravityValueToNameMap.put(Gravity.AXIS_CLIP, "AXIS_CLIP");
        gravityValueToNameMap.put(Gravity.AXIS_PULL_AFTER, "AXIS_PULL_AFTER");
        gravityValueToNameMap.put(Gravity.AXIS_PULL_BEFORE, "AXIS_PULL_BEFORE");
        gravityValueToNameMap.put(Gravity.AXIS_SPECIFIED, "AXIS_SPECIFIED");
        gravityValueToNameMap.put(Gravity.AXIS_X_SHIFT, "AXIS_X_SHIFT");
        gravityValueToNameMap.put(Gravity.AXIS_Y_SHIFT, "AXIS_Y_SHIFT");
        gravityValueToNameMap.put(Gravity.BOTTOM, "BOTTOM");
        gravityValueToNameMap.put(Gravity.CENTER, "CENTER");
        gravityValueToNameMap.put(Gravity.CENTER_HORIZONTAL, "CENTER_HORIZONTAL");
        gravityValueToNameMap.put(Gravity.CENTER_VERTICAL, "CENTER_VERTICAL");
        gravityValueToNameMap.put(Gravity.CLIP_HORIZONTAL, "CLIP_HORIZONTAL");
        gravityValueToNameMap.put(Gravity.CLIP_VERTICAL, "CLIP_VERTICAL");
        gravityValueToNameMap.put(Gravity.DISPLAY_CLIP_HORIZONTAL, "DISPLAY_CLIP_HORIZONTAL");
        gravityValueToNameMap.put(Gravity.DISPLAY_CLIP_VERTICAL, "DISPLAY_CLIP_VERTICAL");
        gravityValueToNameMap.put(Gravity.END, "END");
        gravityValueToNameMap.put(Gravity.FILL, "FILL");
        gravityValueToNameMap.put(Gravity.FILL_HORIZONTAL, "FILL_HORIZONTAL");
        gravityValueToNameMap.put(Gravity.FILL_VERTICAL, "FILL_VERTICAL");
        gravityValueToNameMap.put(Gravity.HORIZONTAL_GRAVITY_MASK, "HORIZONTAL_GRAVITY_MASK");
        gravityValueToNameMap.put(Gravity.LEFT, "LEFT");
        gravityValueToNameMap.put(Gravity.NO_GRAVITY, "NO_GRAVITY");
        gravityValueToNameMap.put(Gravity.RELATIVE_HORIZONTAL_GRAVITY_MASK, "RELATIVE_HORIZONTAL_GRAVITY_MASK");
        gravityValueToNameMap.put(Gravity.RELATIVE_LAYOUT_DIRECTION, "RELATIVE_LAYOUT_DIRECTION");
        gravityValueToNameMap.put(Gravity.RIGHT, "RIGHT");
        gravityValueToNameMap.put(Gravity.START, "START");
        gravityValueToNameMap.put(Gravity.TOP, "TOP");
        gravityValueToNameMap.put(Gravity.VERTICAL_GRAVITY_MASK, "VERTICAL_GRAVITY_MASK");

        gravityNameToValueMap.put("AXIS_CLIP", Gravity.AXIS_CLIP);
        gravityNameToValueMap.put("AXIS_PULL_AFTER", Gravity.AXIS_PULL_AFTER);
        gravityNameToValueMap.put("AXIS_PULL_BEFORE", Gravity.AXIS_PULL_BEFORE);
        gravityNameToValueMap.put("AXIS_SPECIFIED", Gravity.AXIS_SPECIFIED);
        gravityNameToValueMap.put("AXIS_X_SHIFT", Gravity.AXIS_X_SHIFT);
        gravityNameToValueMap.put("AXIS_Y_SHIFT", Gravity.AXIS_Y_SHIFT);
        gravityNameToValueMap.put("BOTTOM", Gravity.BOTTOM);
        gravityNameToValueMap.put("CENTER", Gravity.CENTER);
        gravityNameToValueMap.put("CENTER_HORIZONTAL", Gravity.CENTER_HORIZONTAL);
        gravityNameToValueMap.put("CENTER_VERTICAL", Gravity.CENTER_VERTICAL);
        gravityNameToValueMap.put("CLIP_HORIZONTAL", Gravity.CLIP_HORIZONTAL);
        gravityNameToValueMap.put("CLIP_VERTICAL", Gravity.CLIP_VERTICAL);
        gravityNameToValueMap.put("DISPLAY_CLIP_HORIZONTAL", Gravity.DISPLAY_CLIP_HORIZONTAL);
        gravityNameToValueMap.put("DISPLAY_CLIP_VERTICAL", Gravity.DISPLAY_CLIP_VERTICAL);
        gravityNameToValueMap.put("END", Gravity.END);
        gravityNameToValueMap.put("FILL", Gravity.FILL);
        gravityNameToValueMap.put("FILL_HORIZONTAL", Gravity.FILL_HORIZONTAL);
        gravityNameToValueMap.put("FILL_VERTICAL", Gravity.FILL_VERTICAL);
        gravityNameToValueMap.put("HORIZONTAL_GRAVITY_MASK", Gravity.HORIZONTAL_GRAVITY_MASK);
        gravityNameToValueMap.put("LEFT", Gravity.LEFT);
        gravityNameToValueMap.put("NO_GRAVITY", Gravity.NO_GRAVITY);
        gravityNameToValueMap.put("RELATIVE_HORIZONTAL_GRAVITY_MASK", Gravity.RELATIVE_HORIZONTAL_GRAVITY_MASK);
        gravityNameToValueMap.put("RELATIVE_LAYOUT_DIRECTION", Gravity.RELATIVE_LAYOUT_DIRECTION);
        gravityNameToValueMap.put("RIGHT", Gravity.RIGHT);
        gravityNameToValueMap.put("START", Gravity.START);
        gravityNameToValueMap.put("TOP", Gravity.TOP);
        gravityNameToValueMap.put("VERTICAL_GRAVITY_MASK", Gravity.VERTICAL_GRAVITY_MASK);

        gravityNameList.add("AXIS_CLIP");
        gravityNameList.add("AXIS_PULL_AFTER");
        gravityNameList.add("AXIS_PULL_BEFORE");
        gravityNameList.add("AXIS_SPECIFIED");
        gravityNameList.add("AXIS_X_SHIFT");
        gravityNameList.add("AXIS_Y_SHIFT");
        gravityNameList.add("BOTTOM");
        gravityNameList.add("CENTER");
        gravityNameList.add("CENTER_HORIZONTAL");
        gravityNameList.add("CENTER_VERTICAL");
        gravityNameList.add("CLIP_HORIZONTAL");
        gravityNameList.add("CLIP_VERTICAL");
        gravityNameList.add("DISPLAY_CLIP_HORIZONTAL");
        gravityNameList.add("DISPLAY_CLIP_VERTICAL");
        gravityNameList.add("END");
        gravityNameList.add("FILL");
        gravityNameList.add("FILL_HORIZONTAL");
        gravityNameList.add("FILL_VERTICAL");
        gravityNameList.add("HORIZONTAL_GRAVITY_MASK");
        gravityNameList.add("LEFT");
        gravityNameList.add("NO_GRAVITY");
        gravityNameList.add("RELATIVE_HORIZONTAL_GRAVITY_MASK");
        gravityNameList.add("RELATIVE_LAYOUT_DIRECTION");
        gravityNameList.add("RIGHT");
        gravityNameList.add("START");
        gravityNameList.add("TOP");
        gravityNameList.add("VERTICAL_GRAVITY_MASK");
    }

    public static int getGravityValueByName(String name) {
        return gravityNameToValueMap.get(name);
    }

    public static String getGravityNameByValue(int value) {
        return gravityValueToNameMap.get(value);
    }

    public static List<String> getGravityNameList() {
        return gravityNameList;
    }
}
