package org.example.chainOfResponsability;
public class FuncionarioReitor extends Funcionario{
    public FuncionarioReitor(Funcionario funcionario)
    {
        pilhaDeDocumentos.add(TipoDocumentoDiploma.getInstance());
        setFuncionarioSuperior(funcionario);
    }

    public String getCargo() {
        return "Reitor";
    }

}
