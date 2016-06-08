package br.edu.hto.ifsp.Aplicativo_SistemaEmpresas.service;



import java.util.List;

import br.edu.hto.ifsp.Aplicativo_SistemaEmpresas.domain.Departamento;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by dioge on 31/05/2016.
 */
public interface DepartamentoService {
    @GET("departamento/list")
    Call<List<Departamento>> listarDepartamentos();
}
