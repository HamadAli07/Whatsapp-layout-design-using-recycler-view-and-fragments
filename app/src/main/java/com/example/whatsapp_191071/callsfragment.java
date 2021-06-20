package com.example.whatsapp_191071;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import model.call_class;
import model.call_recycleradapter;
import model.status_class;


public class callsfragment extends Fragment {

    View view;
    List<call_class> list_call = new ArrayList<>();
    RecyclerView recyclerView;
    call_recycleradapter call;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_callsfragment, container, false);
        list_call.add(new call_class("Hamad Ali","Just now",R.drawable.call_icon,R.drawable.pp));
        list_call.add(new call_class("Bhai","Today, 9:20 AM",R.drawable.video_icon,R.drawable.bhai));
        list_call.add(new call_class("Home","Today, 10:30 AM",R.drawable.call_icon,R.drawable.home));
        list_call.add(new call_class("ME","Today,6:13 PM",R.drawable.video_icon,R.drawable.mee));
        list_call.add(new call_class("Haider Ali","Today,11:30 PM",R.drawable.video_icon,R.drawable.baby));
        list_call.add(new call_class("Ali","Yesterday, 8:13 AM",R.drawable.call_icon,R.drawable.pp));
        list_call.add(new call_class("Saqib","Yesterday, 9:47 AM",R.drawable.video_icon,R.drawable.bhai));
        list_call.add(new call_class("Ahmed","Yesterday, 2:00 PM",R.drawable.call_icon,R.drawable.baby));
        list_call.add(new call_class("You","Yesterday, 7:07 PM",R.drawable.call_icon,R.drawable.home));
        list_call.add(new call_class("Saad","Today, 12:00 AM",R.drawable.video_icon,R.drawable.mee));
        recyclerView=view.findViewById(R.id.CALL_rv);
        call=new call_recycleradapter(getContext(),list_call);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(call);
        return view;
    }
}