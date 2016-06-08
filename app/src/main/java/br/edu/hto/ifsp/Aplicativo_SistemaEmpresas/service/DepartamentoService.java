package br.edu.hto.ifsp.Aplicativo_SistemaEmpresas.service;



import java.util.List;

import br.edu.hto.ifsp.Aplicativo_SistemaEmpresas.domain.Departamento;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by dioge on 31/05/2016.
 */
public interface DepartamentoService {
    @GET("departamento/list")
    Call<List<Departamento>> listarDepartamentos();

    @Multipart
    @POST("departamento/new")
    Call<Departamento> criarDepartamento(@Part("departamento") Departamento departamento);
}
