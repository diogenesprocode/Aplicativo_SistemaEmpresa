package br.edu.hto.ifsp.Aplicativo_SistemaEmpresas.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import br.edu.hto.ifsp.Aplicativo_SistemaEmpresas.R;
import br.edu.hto.ifsp.Aplicativo_SistemaEmpresas.presenter.ListarDepartamentosPresenter;

public class ListarDepartamentoFragment extends Fragment {
    private ListView depList;

    public ListarDepartamentoFragment(){
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //Log.d("teste", "teste");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_listar_departamento,container, false);

        depList = (ListView) view.findViewById(R.id.listViewDepartamento);
        ListarDepartamentosPresenter listarDepartamentoPresenter = new ListarDepartamentosPresenter();

        listarDepartamentoPresenter.listarDepartamentos(getContext(), depList);
        //Log.d("teste", "passou aq tbm");

        return view;
    }
}
