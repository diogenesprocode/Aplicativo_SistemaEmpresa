package br.edu.hto.ifsp.Aplicativo_SistemaEmpresas.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import br.edu.hto.ifsp.Aplicativo_SistemaEmpresas.R;
import br.edu.hto.ifsp.Aplicativo_SistemaEmpresas.domain.Departamento;

/**
 * Created by dioge on 31/05/2016.
 */
public class DepartamentoAdapter extends BaseAdapter {
    private final Context context;
    private final List<Departamento> departamentos;

    public DepartamentoAdapter(Context context, List departamentos){
        this.context = context;
        this.departamentos = departamentos;
    }

    @Override
    public int getCount() {
        return departamentos != null ? departamentos.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return departamentos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return departamentos.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_departamento, parent, false);

        TextView txtNome_dep = (TextView) view.findViewById(R.id.txtNomeDep);
        TextView txtLocal_dep = (TextView) view.findViewById(R.id.txtLocalDep);

        Departamento departamento = departamentos.get(position);
        txtNome_dep.setText(departamento.getNome());
        txtLocal_dep.setText(departamento.getLocal());

        return view;
    }
}
