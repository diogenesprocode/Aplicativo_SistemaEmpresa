package br.edu.hto.ifsp.Aplicativo_SistemaEmpresas.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import br.edu.hto.ifsp.Aplicativo_SistemaEmpresas.R;
import br.edu.hto.ifsp.Aplicativo_SistemaEmpresas.domain.Departamento;
import br.edu.hto.ifsp.Aplicativo_SistemaEmpresas.service.DepartamentoService;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class NovoDepartamentoFragment extends Fragment {
    private Context context;


    public NovoDepartamentoFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceStace) {
        View view = inflater.inflate(R.layout.fragment_novo_empregado, container, false);

        Button btn_salvar = (Button) view.findViewById(R.id.btn_salvar);
        btn_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gravarDepartamento();
            }
        });


        return view;
    }

    private void gravarDepartamento(){
        String baseURL = "http://192.168.49.124:8080/";

        EditText editNomeDep = (EditText) getView().findViewById(R.id.edit_nomedep);
        EditText editLocalDep = (EditText) getView().findViewById(R.id.edit_localdep);

        Departamento departamento = new Departamento();
        departamento.setNome(editNomeDep.getText().toString());
        departamento.setLocal(editLocalDep.getText().toString());

        editNomeDep.setText("");
        editLocalDep.setText("");


    OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient.build())
            .build();
        DepartamentoService service = retrofit.create(DepartamentoService.class);

        Call<Departamento> call = service.criarDepartamento(departamento);

        call.enqueue(new Callback<Departamento>() {
            @Override
            public void onResponse(Call<Departamento> call, Response<Departamento> response) {

            }

            @Override
            public void onFailure(Call<Departamento> call, Throwable t) {

            }
        });

    }
}