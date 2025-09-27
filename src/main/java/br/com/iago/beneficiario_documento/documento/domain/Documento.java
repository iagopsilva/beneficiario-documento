package br.com.iago.beneficiario_documento.documento.domain;

import br.com.iago.beneficiario_documento.beneficiario.application.api.BeneficiarioAlteracaoRequest;
import br.com.iago.beneficiario_documento.beneficiario.application.api.BeneficiarioRequest;
import br.com.iago.beneficiario_documento.documento.application.api.DocumentoRequest;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idDocumento", updatable = false, unique = true, nullable = false)
    private UUID idDocumento;
    @NotNull
    /*@Column(columnDefinition = "uuid", name = "idDocumento", nullable = false)*/
    private UUID idBeneficiarioTitular;
    @NotBlank
    private String tipoDocumento;
    @NotBlank
    private String numDocumento;
    @NotBlank
    private String descricao;

    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;

    public Documento(UUID idBeneficiario, @Valid DocumentoRequest documentoRequest) {
        this.idBeneficiarioTitular = idBeneficiario;
        this.tipoDocumento = documentoRequest.getTipoDocumento();
        this.numDocumento = documentoRequest.getNumDocumento();
        this.descricao = documentoRequest.getDescricao();
        this.dataInclusao = LocalDateTime.now();
    }

}