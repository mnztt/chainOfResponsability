package chainOfResponsability;

import org.example.chainOfResponsability.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DocumentoTest {

    Funcionario reitor;
    Funcionario diretor;
    Funcionario coordenador;
    Funcionario secretaria;

    @BeforeEach
    void setUp() {
        reitor = new FuncionarioReitor(null);
        diretor = new FuncionarioDiretor(reitor);
        coordenador = new FuncionarioCoordenador(diretor);
        secretaria = new FuncionarioSecretaria(coordenador);
    }

    @Test
    void deveRetornarSecretariaParaAssinaturaHistorico() {
        assertEquals("Documento assinado por Secretária", secretaria.assinarDocumento(new Documento(TipoDocumentoHistorico.getInstance())));
    }

    @Test
    void deveRetornarCoordenadorParaAssinaturaMatricula() {
        Documento documento = new Documento(TipoDocumentoMatricula.getInstance());
        assertEquals("Documento assinado por Coordenador", coordenador.assinarDocumento(documento));
    }

    @Test
    void deveRetornarDiretorParaAssinaturaCertificado() {
        Documento documento = new Documento(TipoDocumentoCertificado.getInstance());
        assertEquals("Documento assinado por Diretor", diretor.assinarDocumento(documento));
    }

    @Test
    void deveRetornarReitorParaAssinaturaDiploma() {
        Documento documento = new Documento(TipoDocumentoDiploma.getInstance());
        assertEquals("Documento assinado por Reitor", reitor.assinarDocumento(documento));
    }

    @Test
    void deveRetornarNaoAssinadoParaBoleto() {
        Documento documento = new Documento(TipoDocumentoBoleto.getInstance());
        assertEquals("Documento não pode ser assinado", secretaria.assinarDocumento(documento));
    }
}
