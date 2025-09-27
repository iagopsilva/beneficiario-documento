package br.com.iago.beneficiario_documento.documento.application.repository;

import br.com.iago.beneficiario_documento.documento.domain.Documento;

import java.util.List;
import java.util.UUID;

public interface DocumentoRepository {
    Documento salvaDocumento(Documento documento);

    List<Documento> buscaDocumentosDoBeneficiario(UUID idBeneficiario);
}
