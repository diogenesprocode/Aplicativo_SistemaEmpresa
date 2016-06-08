package br.edu.hto.ifsp.Aplicativo_SistemaEmpresas.presenter;

import android.content.Context;
import android.util.Log;
import android.widget.ListView;

import java.util.List;

import br.edu.hto.ifsp.Aplicativo_SistemaEmpresas.adapter.DepartamentoAdapter;
import br.edu.hto.ifsp.Aplicativo_SistemaEmpresas.domain.Departamento;
import br.edu.hto.ifsp.Aplicativo_SistemaEmpresas.service.DepartamentoService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ListarDepartamentosPresenter {
    public static String baseUrl = "http://192.168.49.124:8080/";

    public void listarDepartamentos(final Context context, final ListView listView) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        DepartamentoService service = retrofit.create(DepartamentoService.class);
        Call<List<Departamento>> call = service.listarDepartamentos();

        call.enqueue(new Callback<List<Departamento>>() {
            @Override
            public void onResponse(Call<List<Departamento>> call, Response<List<Departamento>> response) {
                List<Departamento> list = response.body();
                //Log.d("teste", "teste");
                listView.setAdapter(new DepartamentoAdapter(context, list));
            }

            @Override
            public void onFailure(Call<List<Departamento>> call, Throwable t) {
                t.printStackTrace();

            }
        });
    }
}