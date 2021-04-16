package com.defense.notecase.Adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.defense.notecase.PdfShowActivity;
import com.defense.notecase.R;

import java.io.File;

class PayslipViewHolder extends RecyclerView.ViewHolder {
    public TextView slipName;
    public LinearLayout slip;
    public PayslipViewHolder(@NonNull View itemView) {
        super(itemView);
        slipName = itemView.findViewById(R.id.slipName);
        slip = itemView.findViewById(R.id.slip);
    }

}

public class PayslipAdapter extends RecyclerView.Adapter<PayslipViewHolder>{
    private File[] files;
    private Context context;

    public PayslipAdapter(File[] files,Context context)
    {
        this.files = files;
        this.context = context;
    }
    @NonNull
    @Override
    public PayslipViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View itemView=inflater.inflate(R.layout.payslip_row,parent,false);
        return new PayslipViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PayslipViewHolder holder, int position) {
         holder.slipName.setText(files[position].getName().toString().trim());
         holder.slip.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(context, PdfShowActivity.class);
                 intent.putExtra("path",files[position].getPath());
                 context.startActivity(intent);
             }
         });
    }

    @Override
    public int getItemCount() {
        return files.length;
    }
}
