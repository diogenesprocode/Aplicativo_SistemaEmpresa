package br.edu.hto.ifsp.Aplicativo_SistemaEmpresas.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import br.edu.hto.ifsp.Aplicativo_SistemaEmpresas.R;
import br.edu.hto.ifsp.Aplicativo_SistemaEmpresas.presenter.ListarEmpregadosPresenter;

public class ListarEmpregadosFragment extends Fragment {
    private ListView empList;

    public ListarEmpregadosFragment(){
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d("trace", "passei aqui 2");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_listar_empregado, container, false);

        empList = (ListView)view.findViewById(R.id.listViewEmpregado);
        Log.d("trace", "passei aqui 3");
        ListarEmpregadosPresenter listarEmpregadosPresenter = new ListarEmpregadosPresenter();

        listarEmpregadosPresenter.listarEmpregado(getContext(), empList);

        return view;
    }


}
