package br.com.iago.beneficiario_documento.documento.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class DocumentoRequest {
    @NotBlank
    private String tipoDocumento;
    @NotBlank
    private String numDocumento;
    @NotBlank
    private String descricao;
}
