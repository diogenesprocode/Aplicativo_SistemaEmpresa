package br.edu.hto.ifsp.Aplicativo_SistemaEmpresas.presenter;

import android.content.Context;
import android.widget.ListView;

import java.util.List;

import br.edu.hto.ifsp.Aplicativo_SistemaEmpresas.adapter.EmpregadoAdapter;
import br.edu.hto.ifsp.Aplicativo_SistemaEmpresas.domain.Empregado;
import br.edu.hto.ifsp.Aplicativo_SistemaEmpresas.service.EmpregadoService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by dioge on 31/05/2016.
 */
public class ListarEmpregadosPresenter {
    public static String baseUrl = "http://192.168.49.124:8080/";

    public void listarEmpregado(final Context context, final ListView listView) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        EmpregadoService service = retrofit.create(EmpregadoService.class);
        Call<List<Empregado>> call = service.listarEmpregados();

        call.enqueue(new Callback<List<Empregado>>() {
            @Override
            public void onResponse(Call<List<Empregado>> call, Response<List<Empregado>> response) {
                List<Empregado> list = response.body();
                listView.setAdapter(new EmpregadoAdapter(context, list));
            }

            @Override
            public void onFailure(Call<List<Empregado>> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
