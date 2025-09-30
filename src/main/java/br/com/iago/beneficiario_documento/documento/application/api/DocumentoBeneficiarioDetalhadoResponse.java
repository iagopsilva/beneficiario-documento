package br.com.iago.beneficiario_documento.documento.application.api;

import lombok.Value;

import java.util.UUID;

@Value
public class DocumentoBeneficiarioDetalhadoResponse {
    private UUID idDocumento;
    private UUID idBeneficiarioTitular;
    private String tipoDocumento;
    private String numDocumento;
    private String descricao;
}
