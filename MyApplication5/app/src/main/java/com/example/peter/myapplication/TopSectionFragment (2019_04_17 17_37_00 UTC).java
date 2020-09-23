package com.example.peter.myapplication;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class TopSectionFragment extends Fragment {

    Button b;
    EditText e1,e2;
    activitycommander a;
    public TopSectionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate( R.layout.fragment_top_section, container, false );
        b=view.findViewById(R.id.button);
        e1=view.findViewById( R.id.edittxt );
        e2=view.findViewById( R.id.edittxt1 );
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a.passdata( e1.getText().toString(),e2.getText().toString() );
            }
        } );


        return view;

    }
    interface activitycommander{
        public void passdata(String top,String bottom);
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach( context );
        try{
            a=(activitycommander) context;

        }
        catch(ClassCastException e){
            throw new ClassCastException( context.toString() );

        }
    }

}
