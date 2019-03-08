package com.example.smartcardattendancesystem;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomListView extends ArrayAdapter<String> {

    private String[] username;
    private String[] user_detail;
    private Activity context ;

    public CustomListView( Activity context, String[] username,String[] user_detail) {

        super(context, R.layout.layout,username);

        this.context =context;
        this.username = username;
        this.user_detail = user_detail;

    }

    @NonNull
    @Override

    public View getView(int position , @NonNull View convertView, @NonNull ViewGroup parent)
    {
        View r =convertView;

        ViewHolder viewHolder = null;
        if (r==null)
        {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.layout,null,true);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder)r.getTag();
        }

        viewHolder.textView1.setText(username[position]);
        viewHolder.textView2.setText(user_detail[position]);

        return r;
    }

    class ViewHolder{
        TextView textView1;
        TextView textView2;
        ViewHolder(View v){

            textView1 = (TextView)v.findViewById(R.id.userName);
            textView2 = (TextView)v.findViewById(R.id.userDetail);
        }

    }
}
