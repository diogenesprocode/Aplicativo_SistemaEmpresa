package br.edu.hto.ifsp.Aplicativo_SistemaEmpresas.domain;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dioge on 31/05/2016.
 */
public class Empregado {
        @SerializedName("n_emp")
        private long id;
        @SerializedName("nome_emp")
        private String nome;
        @SerializedName("cargo")
        private String cargo;
        @SerializedName("chefe")
        private long chefe;
        @SerializedName("data_adm")
        private String dataAdmissao;
        @SerializedName("sal")
        private double salario;
        @SerializedName("com")
        private double comissao;
        @SerializedName("n_dep")
        private long numeroDepartamento;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCargo() {
            return cargo;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }

        public long getChefe() {
            return chefe;
        }

        public void setChefe(long chefe) {
            this.chefe = chefe;
        }

        public String getDataAdmissao() {
            return dataAdmissao;
        }

        public void setDataAdmissao(String dataAdmissao) {
            this.dataAdmissao = dataAdmissao;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public double getComissao() {
            return comissao;
        }

        public void setComissao(double comissao) {
            this.comissao = comissao;
        }

        public long getNumeroDepartamento() {
            return numeroDepartamento;
        }

        public void setNumeroDepartamento(long numeroDepartamento) {
            this.numeroDepartamento = numeroDepartamento;
        }
}
