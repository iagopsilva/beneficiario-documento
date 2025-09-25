package br.com.iago.beneficiario_documento.documento.application.api;

import br.com.iago.beneficiario_documento.documento.domain.TipoDocumento;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class DocumentoRequest {
    @Enumerated(EnumType.STRING)
    private TipoDocumento tipoDocumento;
    @NotBlank
    private String descricao;
}
