package org.example.chainOfResponsability;
public class FuncionarioCoordenador extends Funcionario{
    public FuncionarioCoordenador(Funcionario funcionario)
    {
        pilhaDeDocumentos.add(TipoDocumentoMatricula.getInstance());
        setFuncionarioSuperior(funcionario);
    }


    public String getCargo() {
        return "Coordenador";
    }

}
