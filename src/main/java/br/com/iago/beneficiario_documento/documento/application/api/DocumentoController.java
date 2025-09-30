package br.com.iago.beneficiario_documento.documento.application.api;

import br.com.iago.beneficiario_documento.documento.application.service.DocumentoService;
import br.com.iago.beneficiario_documento.documento.domain.Documento;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
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

    @Override
    public List<DocumentoBeneficiarioListResponse> getDocumentosDoBeneficiario(UUID idBeneficiario) {
        log.info("[inicia] DocumentoController - getDocumentosDoBeneficiario");
        log.info("[idBeneficiario] {}", idBeneficiario);
        List<DocumentoBeneficiarioListResponse> documentosDoBeneficiario = documentoService.buscaDocumentosDoBeneficiario(idBeneficiario);
        log.info("[finaliza] DocumentoController - getDocumentosDoBeneficiario");
        return documentosDoBeneficiario;
    }

    @Override
    public DocumentoBeneficiarioDetalhadoResponse getDocumentoDoBeneficiarioAtravesId(UUID idBeneficiario, UUID idDocumento) {
        log.info("[inicia] DocumentoController - getDocumentoDoBeneficiarioAtravesId");
        log.info("[idBeneficiario] {} - [idDocumento] {}", idBeneficiario, idDocumento);
        log.info("[finaliza] DocumentoController - getDocumentoDoBeneficiarioAtravesId");
        return null;
    }
}
