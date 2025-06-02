package org.example.chainOfResponsability;

import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList pilhaDeDocumentos = new ArrayList<>();
    private Funcionario funcionarioSuperior;

    public abstract String getCargo();

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public String assinarDocumento(Documento documento){
        pilhaDeDocumentos.contains(documento.getTipoDocumento());
        if(pilhaDeDocumentos.contains(documento.getTipoDocumento())){
            return "Documento assinado por " + getCargo();
        }else{
            if(getFuncionarioSuperior() != null){
                return funcionarioSuperior.assinarDocumento(documento);
            } else{
                return "Documento não pode ser assinado";
            }
        }
    }

}
