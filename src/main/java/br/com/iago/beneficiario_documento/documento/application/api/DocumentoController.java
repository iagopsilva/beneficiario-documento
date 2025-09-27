package br.com.iago.beneficiario_documento.documento.application.api;

import br.com.iago.beneficiario_documento.documento.application.service.DocumentoService;
import br.com.iago.beneficiario_documento.documento.domain.Documento;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Log4j2
public class DocumentoController implements DocumentoAPI {

    private final DocumentoService documentoService;

    public DocumentoController(DocumentoService documentoService) {
        this.documentoService = documentoService;
    }

    @Override
    public DocumentoResponse postDocumento(UUID idBeneficiario, DocumentoRequest documentoRequest) {
        log.info("[inicia] DocumentoController - postDocumento");
        log.info("[idBeneficiario] {}", idBeneficiario);
        DocumentoResponse documento = documentoService.criaDocumento(idBeneficiario, documentoRequest);
        log.info("[finaliza] DocumentoController - postDocumento");
        return documento;
    }
}
