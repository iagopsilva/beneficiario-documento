package br.com.iago.beneficiario_documento.documento.application.api;

import br.com.iago.beneficiario_documento.documento.domain.Documento;
import lombok.Value;

import java.util.UUID;

@Value
public class DocumentoBeneficiarioDetalhadoResponse {
    private UUID idDocumento;
    private String tipoDocumento;
    private String numDocumento;
    private String descricao;

    public DocumentoBeneficiarioDetalhadoResponse(Documento documento) {
        this.idDocumento = getIdDocumento();
        this.tipoDocumento = getTipoDocumento();
        this.numDocumento = getNumDocumento();
        this.descricao = getDescricao();
    }
}
