package com.example.monage.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.monage.R;

import java.util.ArrayList;

public class dataKeuanganAdapter extends RecyclerView.Adapter<dataKeuanganAdapter.dataKeuanganHolder> {
    ArrayList<dataKeuangan> dataKeuangans;
    public dataKeuanganAdapter(ArrayList<dataKeuangan> dataKeuangans) {
        this.dataKeuangans = dataKeuangans;
    }

    @NonNull
    @Override
    public dataKeuanganHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_data_keuangan, parent, false);
        dataKeuanganHolder dataKeuanganHolder = new dataKeuanganHolder(view);
        return dataKeuanganHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull dataKeuanganHolder holder, int position) {
        dataKeuangan dataKeuangan = this.dataKeuangans.get(position);
        holder.kategori.setText(dataKeuangan.getKategori());
        holder.harga.setText(dataKeuangan.getHarga());
    }

    @Override
    public int getItemCount() {
        return dataKeuangans.size();
    }

    public class dataKeuanganHolder extends RecyclerView.ViewHolder{
        TextView kategori, harga;

        public dataKeuanganHolder(@NonNull View itemView) {
            super(itemView);
            kategori = itemView.findViewById(R.id.kategori);
            harga = itemView.findViewById(R.id.harga);
        }
    }
}
