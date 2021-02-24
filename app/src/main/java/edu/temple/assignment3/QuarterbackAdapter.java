package edu.temple.assignment3;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class QuarterbackAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> names;
    int[] images;

    public QuarterbackAdapter(Context context, ArrayList<String> names, int[] images) {
        this.context = context;
        this.names = names;
        this.images = images;
    }

    @Override
    public int getCount() {
        return names.size();
    }

    @Override
    public Object getItem(int position) {
        return names.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return getView(position, convertView, parent);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Initializing layout
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout.setPadding(10,10,10,10);

        // Initializing text view
        TextView qbTextView = new TextView(context);
        qbTextView.setTextSize(22);
        qbTextView.setText(names.get(position));

        // Initializing image
        ImageView qbImageView = new ImageView(context);
        qbImageView.setImageResource(images[position]);

        // Fixing padding
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(250, 250);
        qbImageView.setLayoutParams(params);
        qbTextView.setPadding(25,90,0,0);

        // Add text and image
        linearLayout.addView(qbImageView);
        linearLayout.addView(qbTextView);

        return linearLayout;
    }

}

