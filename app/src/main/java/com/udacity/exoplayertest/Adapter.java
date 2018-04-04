package com.udacity.exoplayertest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by federico.creti on 30/03/2018.
 */

public class Adapter extends BaseAdapter {
    private Context context;

    public Adapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View rowView = null;
        if (i == 0){
            rowView = inflater.inflate(R.layout.first_list_element, viewGroup, false);
        } else{
            rowView = inflater.inflate(R.layout.other_list_elements, viewGroup, false);
        }

        return rowView;
    }
}
