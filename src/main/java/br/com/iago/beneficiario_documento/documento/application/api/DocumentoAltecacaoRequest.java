package br.com.iago.beneficiario_documento.documento.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class DocumentoAltecacaoRequest {
    @NotBlank
    private String tipoDocumento;
    @NotBlank
    private String numDocumento;
    @NotBlank
    private String descricao;
}
