    package com.example.app_040922_nd.ui.abriraplicaciones;

    import android.content.Intent;
    import android.os.Bundle;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.ImageButton;
    import android.widget.TextView;

    import androidx.annotation.NonNull;
    import androidx.fragment.app.Fragment;
    import androidx.lifecycle.ViewModelProvider;

    import com.example.app_040922_nd.databinding.FragmentAbriraplicacionesBinding;
    import com.example.app_040922_nd.ui.abriraplicaciones.AbrirAplicacionesViewModel;

    public class AbrirAplicacionesFragment extends Fragment {

        private FragmentAbriraplicacionesBinding binding;

        public View onCreateView(@NonNull LayoutInflater inflater,
                                 ViewGroup container, Bundle savedInstanceState) {
            AbrirAplicacionesViewModel abriraplicacionesViewModel =
                    new ViewModelProvider(this).get(AbrirAplicacionesViewModel.class);

            binding = FragmentAbriraplicacionesBinding.inflate(inflater, container, false);
            View root = binding.getRoot();

            final ImageButton ib_clima = binding.ibClima;
            final ImageButton ib_musica = binding.ibMusica;
            final ImageButton ib_facebook = binding.ibFacebook;
            final ImageButton ib_steam = binding.ibSteam;

            ib_clima.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { Intent clima = getActivity().getPackageManager().getLaunchIntentForPackage("com.miui.weather2"); startActivity(clima); }});
            ib_musica.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { Intent musica = getActivity().getPackageManager().getLaunchIntentForPackage("com.miui.player"); startActivity(musica); }});
            ib_facebook.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { Intent facebook = getActivity().getPackageManager().getLaunchIntentForPackage("com.facebook.katana"); startActivity(facebook); }});
            ib_steam.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { Intent steam = getActivity().getPackageManager().getLaunchIntentForPackage("com.valvesoftware.android.steam.community"); startActivity(steam); }});

            return root;
        }

        @Override
        public void onDestroyView() {
            super.onDestroyView();
            binding = null;
        }
    }