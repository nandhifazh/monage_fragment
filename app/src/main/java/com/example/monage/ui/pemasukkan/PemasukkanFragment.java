package com.example.monage.ui.pemasukkan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.monage.R;

public class PemasukkanFragment extends Fragment {

    private PemasukkanViewModel pemasukkanViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        pemasukkanViewModel =
                new ViewModelProvider(this).get(PemasukkanViewModel.class);
        View root = inflater.inflate(R.layout.fragment_pemasukkan, container, false);
        return root;
    }
}
