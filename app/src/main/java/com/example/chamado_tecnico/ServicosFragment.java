package com.example.chamado_tecnico;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ServicosFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ServicosFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ServicosFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ServicosFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ServicosFragment newInstance(String param1, String param2) {
        ServicosFragment fragment = new ServicosFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // 1. Infla o layout primeiro e guarda na variável 'view'
        View view = inflater.inflate(R.layout.fragment_servicos, container, false);

        // 2. Procura o botão DENTRO da 'view' que você acabou de inflar
        Button btnAbrirServicos = view.findViewById(R.id.btnAbrirServicos);

        btnAbrirServicos.setOnClickListener(v -> {
            Intent intent = new Intent(requireContext(), CadastroAcitivity.class);
            startActivity(intent);
        });

        // 3. Retorna a view configurada
        return view;
    }
}