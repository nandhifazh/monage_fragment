package com.example.monage.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.monage.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    RecyclerView recyclerView;
    dataKeuanganAdapter dataKeuanganAdapter;

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final ArrayList<dataKeuangan> dataKeuangans = new ArrayList<>();
        dataKeuangans.add(new dataKeuangan("9 April 2021", "Uang Makan", "-Rp. 50.000","-"));
        dataKeuangans.add(new dataKeuangan("10 April 2021", "Gaji", "Rp. 5.000.000","-"));
        dataKeuangans.add(new dataKeuangan("11 April 2021", "Skincare", "-Rp. 500.000","-"));
        dataKeuangans.add(new dataKeuangan("12 April 2021", "jajan", "Rp. 50.000","-"));
        dataKeuangans.add(new dataKeuangan("13 April 2021", "Belanja Bulanan", "-Rp. 300.000","-"));

        recyclerView = root.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        dataKeuanganAdapter = new dataKeuanganAdapter(dataKeuangans);
        recyclerView.setAdapter(dataKeuanganAdapter);
        return root;
    }
}
