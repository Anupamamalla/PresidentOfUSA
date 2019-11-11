package com.example.presidents;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class PresidentAdapter extends RecyclerView.Adapter<PresidentAdapter.PresidentViewHolder> {
    Context mContext;
    List<President> listOfpresident;

    public PresidentAdapter(Context mContext, List<President> listOfpresident){
        this.mContext=mContext;
        this.listOfpresident=listOfpresident;
    }

    @NonNull
    @Override
    public PresidentAdapter.PresidentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view;
        LayoutInflater mInflater=LayoutInflater.from(mContext);
        view=mInflater.inflate(R.layout.presidentlist,parent,false);
        return new PresidentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PresidentViewHolder holder, int position) {
        final President president=listOfpresident.get(position);

        holder.imgPres.setImageResource(president.getImgPres());
        holder.presName.setText(president.getName());

        holder.imgPres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mContext,Detail.class);

                intent.putExtra("image",president.getImgPres());
                intent.putExtra("name",president.getName());
                intent.putExtra("detail",president.getDetail());

                mContext.startActivity(intent);
            }
        });
         }

    @Override
    public int getItemCount() {
        return  listOfpresident.size();
    }

    public class PresidentViewHolder  extends RecyclerView.ViewHolder{

        CircleImageView imgPres;
        TextView presName,detail;
        CardView cardView;

        public PresidentViewHolder(@NonNull View itemView) {
            super(itemView);

            presName= itemView.findViewById(R.id.presName);
            imgPres = itemView.findViewById(R.id.imgPres);
            detail = itemView.findViewById(R.id.detail);
        }
    }
}
