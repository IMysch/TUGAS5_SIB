package com.example.tugas5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Mahasiswaadapter extends RecyclerView.Adapter>Mahasiswaadapter.MahasiswaViewHolder{

   private ArrayList<mahasiswa> listmahasiswa;

    public Mahasiswaadapter(ArrayList<mahasiswa> listmahasiswa) {
        this.listmahasiswa = listmahasiswa;
    }

    @NonNull
    @Override
    public Mahasiswaadapter.MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_mahasiswa, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Mahasiswaadapter.MahasiswaViewHolder holder, int position) {
        holder.tvNPM.setText(listmahasiswa.get(position).getNPM());
        holder.tvNama.setText(listmahasiswa.get(position).getNama());
        holder.tvKelas.setText(listmahasiswa.get(position).getKelas());
    }

    @Override
    public int getItemCount() {
        return (listmahasiswa!= null) ? listmahasiswa.size() : 0 ;
    }
    public class MahasiswaViewHolder extends RecyclerView.ViewHolder{

        private TextView tvNPM, tvNama, tvKelas;

        public MahasiswaViewHolder (View view){
            super(view);

            tvNPM = view.findViewById(R.id.tv_NPM);
            tvNama = view.findViewById(R.id.tv_Nama);
            tvKelas = view.findViewById(R.id.tv_Kelas);

        }
    }
}
