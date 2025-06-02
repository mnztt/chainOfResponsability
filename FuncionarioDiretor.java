package org.example.chainOfResponsability;
public class FuncionarioDiretor extends Funcionario{

    public FuncionarioDiretor(Funcionario funcionario)
    {
        pilhaDeDocumentos.add(TipoDocumentoCertificado.getInstance());
        setFuncionarioSuperior(funcionario);
    }

    public String getCargo() {
        return "Diretor";
    }
}
