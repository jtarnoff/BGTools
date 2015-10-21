package com.jtarnoff.bgtools;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by jtarnoff on 10/17/2015.
 */
public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        SquareImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new SquareImageView(mContext);
            //imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            //imageView.setAdjustViewBounds(true);
            //imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (SquareImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.dice_100, R.drawable.chip_100,
            R.drawable.leaderboard_100, R.drawable.user_100,
            R.drawable.dice_100, R.drawable.chip_100,
            R.drawable.leaderboard_100, R.drawable.user_100,
            R.drawable.dice_100, R.drawable.chip_100,
            R.drawable.leaderboard_100, R.drawable.user_100,
            R.drawable.dice_100, R.drawable.chip_100,
            R.drawable.leaderboard_100, R.drawable.user_100
    };
}