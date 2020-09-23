package com.example.peter.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RecyclerADapter extends RecyclerView.Adapter<RecyclerADapter.viewholder> {
    private String[] data;
   public RecyclerADapter(String[] data){
       this.data=data;

    }
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from( parent.getContext() );
        View view=inflater.inflate( R.layout.list_item_layout,parent,false );

        return new viewholder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
       String title=data[position];
       holder.t.setText( title   );

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class viewholder extends RecyclerView.ViewHolder {
       ImageView img;
       TextView t;
        public viewholder(View itemView) {
            super( itemView );
            img=itemView.findViewById( R.id.img );
            t=itemView.findViewById( R.id.txt );


        }
    }
}
