package com.example.whatsapp_191071;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import model.status_class;
import model.status_recycleradapter;


public class statusfragment extends Fragment {

    RecyclerView recyclerView;
    List<status_class> statuslist =new ArrayList<>();
    View view;

    public statusfragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       view=inflater.inflate(R.layout.fragment_statusfragment, container, false);
       statuslist.add(new status_class("Hamad Ali","6 minute ago",R.drawable.pp));
        statuslist.add(new status_class("Haider Ali","20 minute ago",R.drawable.baby));
        statuslist.add(new status_class("Ali","40 minute ago",R.drawable.mee));
        statuslist.add(new status_class("Saqib ","58 minute ago",R.drawable.bhai));
        statuslist.add(new status_class("Home","Today, 10:20 PM ",R.drawable.home));
        statuslist.add(new status_class("Bhai","Today, 5:48 AM",R.drawable.bhai));
        statuslist.add(new status_class("Usman","Today, 10:20 PM ",R.drawable.pp));
        statuslist.add(new status_class("Saad","Today, 5:48 AM",R.drawable.baby));
        statuslist.add(new status_class("ME","Yesterday, 11:20 PM",R.drawable.mee));
        statuslist.add(new status_class("You","Yesterday, 3:20 AM",R.drawable.pp));
        recyclerView= view.findViewById(R.id.STATUS_rv);
        status_recycleradapter status =new status_recycleradapter(getContext(),statuslist);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(status);
        return view;
    }
}