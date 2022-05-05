package com.example.app_040922_nd.ui.sonidos;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.app_040922_nd.R;
import com.example.app_040922_nd.databinding.FragmentSonidosBinding;

public class SonidosFragment extends Fragment {

    private FragmentSonidosBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SonidosViewModel sonidosViewModel =
                new ViewModelProvider(this).get(SonidosViewModel.class);

        binding = FragmentSonidosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //--------------------------------
        final ImageButton ib_mirage = binding.ibMirage;
        final ImageButton ib_wraith = binding.ibWraith;
        final ImageButton ib_crypto = binding.ibCrypto;
        final ImageButton ib_lifeline = binding.ibLifeline;
        final ImageButton ib_bloodhound = binding.ibBloodhound;
        final ImageButton ib_octane = binding.ibOctane;
        final ImageButton ib_pathfinder = binding.ibPathfinder;
        final ImageButton ib_loba = binding.ibLoba;
        final ImageButton ib_gibraltar = binding.ibGibraltar;
        final ImageButton ib_ash = binding.ibAsh;

        ib_mirage.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.mirage); mp.start(); }});
        ib_wraith.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.wraith); mp.start(); }});
        ib_crypto.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.crypto); mp.start(); }});
        ib_lifeline.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.lifeline); mp.start(); }});
        ib_bloodhound.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.bloodhound); mp.start(); }});
        ib_octane.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.octane); mp.start(); }});
        ib_pathfinder.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.pathfinder); mp.start(); }});
        ib_loba.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.loba); mp.start(); }});
        ib_gibraltar.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.gibraltar); mp.start(); }});
        ib_ash.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.ash); mp.start(); }});

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}