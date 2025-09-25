package br.com.iago.beneficiario_documento.documento.domain;

import br.com.iago.beneficiario_documento.beneficiario.application.api.BeneficiarioAlteracaoRequest;
import br.com.iago.beneficiario_documento.beneficiario.application.api.BeneficiarioRequest;
import jakarta.persistence.*;
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
    @NotBlank
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "string", name = "idDocumento", updatable = false, unique = true, nullable = false)
    private String numDocumento;
    @Enumerated(EnumType.STRING)
    private TipoDocumento tipoDocumento;
    @NotBlank
    private String descricao;

    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;

}