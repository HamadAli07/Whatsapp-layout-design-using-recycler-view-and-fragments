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

import model.chat_class;
import model.chat_recycleradapter;

public class chatsfragment extends Fragment {

    RecyclerView recyclerView;
    List<chat_class> chat_List=new ArrayList<>();
    View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        view =inflater.inflate(R.layout.fragment_chatsfragment, container, false);
        chat_List.add(new chat_class("Hamad Ali","Hello .How are u?",R.drawable.pp,"10:10 PM"));
        chat_List.add(new chat_class("Bhai","Asslam O Aliequm",R.drawable.bhai,"9:15 PM"));
        chat_List.add(new chat_class("Home","Call me.",R.drawable.home,"6:20 AM"));
        chat_List.add(new chat_class("ME","Hello yar kese ho? ",R.drawable.mee,"8:35 PM"));
        chat_List.add(new chat_class("Saqib","Okay.",R.drawable.baby,"Yesterday"));
        chat_List.add(new chat_class("Ali","Fine and u?",R.drawable.pp,"Yesterday"));
        chat_List.add(new chat_class("Ahsan","Walaikum Asslam",R.drawable.bhai,"Yesterday"));
        chat_List.add(new chat_class("Umar","Call me.",R.drawable.baby,"Yesterday"));
        chat_List.add(new chat_class("Saad","right ",R.drawable.mee,"Yesterday"));
        chat_List.add(new chat_class("Usman","Nice.",R.drawable.baby,"Yesterday"));
        recyclerView= view.findViewById(R.id.CHAT_rv);
        chat_recycleradapter chat=new chat_recycleradapter(getContext(),chat_List);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(chat);
        return view;

    }

}