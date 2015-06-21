package com.example.anand.memecreator;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Anand on 21-06-2015.
 */
public class BottomSectionFragment extends Fragment {

    private TextView topmemeText;
    private TextView bottommemeText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.bottom_section_fragment,container,false);

        topmemeText = (TextView)view.findViewById(R.id.topmemeText);
        bottommemeText = (TextView)view.findViewById(R.id.bottommemeText);
        return view;
    }

    public void setMemeText(String top,String bottom)
    {
        topmemeText.setText(top);
        bottommemeText.setText(bottom);
    }
}
