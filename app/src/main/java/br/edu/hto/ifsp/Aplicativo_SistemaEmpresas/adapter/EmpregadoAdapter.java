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
import br.edu.hto.ifsp.Aplicativo_SistemaEmpresas.domain.Empregado;

/**
 * Created by dioge on 31/05/2016.
 */
public class EmpregadoAdapter extends BaseAdapter {

    private final Context context;
    private final List<Empregado> empregados;

    public EmpregadoAdapter(Context context, List empregados){
        this.context = context;
        this.empregados = empregados;
    }

    @Override
    public int getCount() {
        return empregados != null ? empregados.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return empregados.get(position);
    }

    @Override
    public long getItemId(int position) {
        return empregados.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.d("trace", "passei aqui 6");
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_empregado, parent, false);

        TextView txtNome         = (TextView) view.findViewById(R.id.txtNomeEmp);
        TextView txtCargo        = (TextView) view.findViewById(R.id.txtCargoEmp);
        //TextView txtChefe        = (TextView) view.findViewById(R.id.txtChefeEmp);
        TextView txtDataAdm      = (TextView) view.findViewById(R.id.txtDataAdmEmp);
        TextView txtSalario      = (TextView) view.findViewById(R.id.txtSalarioEmp);
        TextView txtComissao     = (TextView) view.findViewById(R.id.txtComEmp);
        //TextView txtDepartamento = (TextView) view.findViewById(R.id.txtDepEmp);

        Empregado empregado = empregados.get(position);
        txtNome.setText(empregado.getNome());
        txtCargo.setText(empregado.getCargo());
        //txtChefe.setText(empregado.getChefe());
        txtDataAdm.setText(empregado.getDataAdmissao());
        txtSalario.setText((int) empregado.getSalario());
        txtComissao.setText((int) empregado.getComissao());
        //txtDepartamento.setText(empregado.getNumeroDepartamento());

        return view;
    }
}
