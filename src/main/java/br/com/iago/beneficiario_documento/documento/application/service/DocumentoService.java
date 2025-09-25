package br.com.iago.beneficiario_documento.documento.application.service;

import br.com.iago.beneficiario_documento.documento.application.api.DocumentoRequest;
import br.com.iago.beneficiario_documento.documento.application.api.DocumentoResponse;

public interface DocumentoService {
    DocumentoResponse criaDocumento(DocumentoRequest documentoRequest);
}
