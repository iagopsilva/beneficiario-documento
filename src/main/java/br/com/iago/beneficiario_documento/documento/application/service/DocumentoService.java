package br.com.iago.beneficiario_documento.documento.application.service;

import br.com.iago.beneficiario_documento.documento.application.api.*;

import java.util.List;
import java.util.UUID;

public interface DocumentoService {
    DocumentoResponse criaDocumento(UUID idBeneficiario, DocumentoRequest documentoRequest);

    List<DocumentoBeneficiarioListResponse> buscaDocumentosDoBeneficiario(UUID idBeneficiario);

    DocumentoBeneficiarioDetalhadoResponse buscaDocumentoDoBeneficiario(UUID idBeneficiario, UUID idDocumento);

    void deletaDocumentoDoBeneficiario(UUID idBeneficiario, UUID idDocumento);

    void alteraDocumentoDoBeneficiario(UUID idBeneficiario, UUID idDocumento, DocumentoAltecacaoRequest documentoAltecacaoRequest);
}
