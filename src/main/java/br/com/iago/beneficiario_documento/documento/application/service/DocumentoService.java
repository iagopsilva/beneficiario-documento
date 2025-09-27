package br.com.iago.beneficiario_documento.documento.application.service;

import br.com.iago.beneficiario_documento.documento.application.api.DocumentoBeneficiarioListResponse;
import br.com.iago.beneficiario_documento.documento.application.api.DocumentoRequest;
import br.com.iago.beneficiario_documento.documento.application.api.DocumentoResponse;

import java.util.List;
import java.util.UUID;

public interface DocumentoService {
    DocumentoResponse criaDocumento(UUID idBeneficiario, DocumentoRequest documentoRequest);

    List<DocumentoBeneficiarioListResponse> buscaDocumentosDoBeneficiario(UUID idBeneficiario);
}
