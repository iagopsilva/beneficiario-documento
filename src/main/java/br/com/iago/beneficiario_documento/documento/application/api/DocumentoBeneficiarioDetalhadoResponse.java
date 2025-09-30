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
        this.idDocumento = documento.getIdDocumento();
        this.tipoDocumento = documento.getTipoDocumento();
        this.numDocumento = documento.getNumDocumento();
        this.descricao = documento.getDescricao();
    }
}
