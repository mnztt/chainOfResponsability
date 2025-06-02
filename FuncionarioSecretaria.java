package org.example.chainOfResponsability;
public class FuncionarioSecretaria extends Funcionario{

    public FuncionarioSecretaria(Funcionario funcionario)
    {
        pilhaDeDocumentos.add(TipoDocumentoHistorico.getInstance());
        setFuncionarioSuperior(funcionario);
    }

    public String getCargo() {
        return "Secretária";
    }

}
