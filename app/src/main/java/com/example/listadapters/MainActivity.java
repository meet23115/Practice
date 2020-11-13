package com.example.listadapters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.listadapters.adapters.UserCustomAdapter;
import com.example.listadapters.model.User;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<User> users;

    public ArrayList<User> generateUsers(){
        ArrayList<User> users = new ArrayList<>();
        users.add( new User( "ABC", "ABC123"));
        users.add( new User( "XYZ", "XYZ123"));
        return users;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.userListView);
        users = generateUsers();
        UserCustomAdapter adapter = new UserCustomAdapter(users);
        listView.setAdapter(adapter);

    }
}