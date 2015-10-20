package com.jtarnoff.bgtools;

import android.content.Context;
import android.widget.ImageView;

/**
 * Created by jtarnoff on 10/19/2015.
 */
public class SquareImageView extends ImageView {

    public SquareImageView(Context context) { super(context); }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int width = getMeasuredWidth();
        setMeasuredDimension(width, width);
    }

}
