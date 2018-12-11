package com.example.scrollviewdiagonal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class Custom extends ScrollView {

    public Custom(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public Custom(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Custom(Context context) {
        super(context);
    }



    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return false;
    }
}