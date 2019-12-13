package com.example.novelapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class PageAdapter extends FragmentStatePagerAdapter {
    private ArrayList<String> contents;

    public PageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);

        contents = new ArrayList<>();
        contents.add("Satu");
        contents.add("Dua");
        contents.add("Tiga");
        contents.add("Empat");
        contents.add("Lima");
        contents.add("Enam");
        contents.add("Tujuh");
        contents.add("Delapan");
        contents.add("Sembilan");
        contents.add("Sepuluh");
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        String pageContent = contents.get(position);
        return PageFragment.newInstance(pageContent);
    }

    @Override
    public int getCount() {
        return contents.size();
    }
}
