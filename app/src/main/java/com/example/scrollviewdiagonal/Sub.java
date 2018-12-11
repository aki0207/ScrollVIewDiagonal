package com.example.scrollviewdiagonal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;

public class Sub extends HorizontalScrollView {
    public Sub(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public Sub(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Sub(Context context) {
        super(context);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return false;
    }
}