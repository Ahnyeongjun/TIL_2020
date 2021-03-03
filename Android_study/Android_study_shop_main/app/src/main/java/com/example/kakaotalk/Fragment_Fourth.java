package com.example.kakaotalk;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class Fragment_Fourth extends Fragment {
    public ViewPager viewPager;

    public Fragment_Fourth() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fourth, container, false);

        Button kakaostory = (Button) view.findViewById(R.id.kakaostory);
        kakaostory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                    Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kakaocorp.com/service/KakaoStory"));
                    startActivity(myIntent);
            }
        }
        );
        Button myinformation1 = (Button) view.findViewById(R.id.myinformation1);
        myinformation1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( v.getContext(), plusFriend.class);
                startActivity(intent);
            }
        });
        ImageButton myinformation = (ImageButton) view.findViewById(R.id.myinformation);
        myinformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( v.getContext(), MinerFourth.class);
                startActivity(intent);
            }
        });
        Button plusfriend1 = (Button) view.findViewById(R.id.plusfriend1);
        plusfriend1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( v.getContext(), plusFriend.class);
                startActivity(intent);
            }
        });
        ImageButton plusfriend = (ImageButton) view.findViewById(R.id.plusfriend);
        plusfriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( v.getContext(), plusFriend.class);
                startActivity(intent);
            }
        });
        Button moreinformation1 = (Button) view.findViewById(R.id.moreinformation1);
        moreinformation1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( v.getContext(), moreinformation.class);
                startActivity(intent);
            }
        });
        ImageButton moreinformation = (ImageButton) view.findViewById(R.id.moreinformation);
        moreinformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( v.getContext(), moreinformation.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
