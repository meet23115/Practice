package com.example.listadapters.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.listadapters.R;
import com.example.listadapters.model.User;

import java.util.ArrayList;

public class UserCustomAdapter extends BaseAdapter {

    ArrayList<User> users;

    public UserCustomAdapter(ArrayList<User> users){
        this.users = users;
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public User getItem(int position) {
        return users.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewholder;

        if (convertView == null) {

            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_row_layout, null);
            viewholder = new ViewHolder(convertView);
            convertView.setTag(viewholder);
        }else{
            viewholder = (ViewHolder) convertView.getTag();
        }

        User user = getItem(position);
        viewholder.usernameTv.setText( user.getUsername() );
        viewholder.passwordTv.setText( user.getPassword() );

        return convertView;
    }

    class ViewHolder{

        TextView usernameTv;
        TextView passwordTv;

        public ViewHolder(View view) {
            usernameTv = view.findViewById(R.id.username_row_layout);
            passwordTv = view.findViewById(R.id.password_row_layout);
        }
    }
}
