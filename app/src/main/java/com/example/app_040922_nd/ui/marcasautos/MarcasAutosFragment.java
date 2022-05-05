package com.example.app_040922_nd.ui.marcasautos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.app_040922_nd.databinding.FragmentMarcasautosBinding;

public class MarcasAutosFragment extends Fragment {

    private FragmentMarcasautosBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MaravillasModernasViewModel maravillasmodernasViewModel =
                new ViewModelProvider(this).get(MaravillasModernasViewModel.class);

        binding = FragmentMarcasautosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}