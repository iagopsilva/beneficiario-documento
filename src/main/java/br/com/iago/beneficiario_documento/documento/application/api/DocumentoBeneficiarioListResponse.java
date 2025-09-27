package br.com.iago.beneficiario_documento.documento.application.api;

import br.com.iago.beneficiario_documento.documento.domain.Documento;
import lombok.Getter;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Getter
public class DocumentoBeneficiarioListResponse {
    private UUID idDocumento;
    private String tipoDocumento;
    private String numDocumento;
    private String descricao;

    public static List<DocumentoBeneficiarioListResponse> converte(List<Documento> documentosDoBenficiario) {
        return documentosDoBenficiario.stream()
                .map(DocumentoBeneficiarioListResponse::new)
                .collect(Collectors.toList());
    }

    public DocumentoBeneficiarioListResponse(Documento documento) {
        this.idDocumento = documento.getIdDocumento();
        this.tipoDocumento = documento.getTipoDocumento();
        this.numDocumento = documento.getNumDocumento();
        this.descricao = documento.getDescricao();
    }
}
