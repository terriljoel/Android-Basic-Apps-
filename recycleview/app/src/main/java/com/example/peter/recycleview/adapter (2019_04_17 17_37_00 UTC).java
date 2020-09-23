package com.example.peter.recycleview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class adapter extends RecyclerView.Adapter<adapter.adaptervholder> {
    @NonNull

           static dsource data[];
    adapter(dsource data[]){
        this.data=data;

    }
    public adaptervholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from( parent.getContext());
        View view=inflater.inflate(R.layout.r_layout,parent,false);
        return new adaptervholder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull adaptervholder holder, int position) {
    holder.t.setText(data[position].s  );

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class adaptervholder extends RecyclerView.ViewHolder{

        public adaptervholder(View itemView) {
            super( itemView );
            t=itemView.findViewById( R.id.demo );
            itemView.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int p=getAdapterPosition();
                }
            } );
        }
    TextView t;

    }
}
