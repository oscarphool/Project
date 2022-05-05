package com.example.app_040922_nd.ui.visualizador3D;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.app_040922_nd.databinding.FragmentVisualizador3dBinding;
import com.example.app_040922_nd.ui.visualizador3D.Visualizador3DViewModel;
import com.example.app_040922_nd.ui.visualizador3D.Visualizador3DViewModel;

public class Visualizador3DFragment extends Fragment {

    private FragmentVisualizador3dBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Visualizador3DViewModel visualizador3DViewModelViewModel =
                new ViewModelProvider(this).get(Visualizador3DViewModel.class);

        binding = FragmentVisualizador3dBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        WebView wv = binding.view;
        Button btn_ir = binding.btnIr;

        WebSettings webSettings = wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setLoadWithOverviewMode(true);

        btn_ir.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                wv.setWebViewClient(new WebViewClient());
                wv.loadUrl("file:///android_asset/modelViewer.html");
            }});

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}