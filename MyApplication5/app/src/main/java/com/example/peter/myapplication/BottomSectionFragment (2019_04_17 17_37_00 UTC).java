package com.example.peter.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BottomSectionFragment extends Fragment {

    TextView t1,t2;
    public BottomSectionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate( R.layout.fragment_bottom_section, container, false );
        t1=view.findViewById( R.id.txt );
        t2=view.findViewById( R.id.txt2 );
    return view;
    }
    public void setmemetext(String top,String bottom)
    {
        t1.setText( top );
        t2.setText( bottom );
    }
}
