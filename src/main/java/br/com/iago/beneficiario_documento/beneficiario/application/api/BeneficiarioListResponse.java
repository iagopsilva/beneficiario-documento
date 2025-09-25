package br.com.iago.beneficiario_documento.beneficiario.application.api;

import br.com.iago.beneficiario_documento.beneficiario.domain.Beneficiario;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class BeneficiarioListResponse {
    private UUID idBeneficiario;
    private String nome;

    public static List<BeneficiarioListResponse> converte(List<Beneficiario> beneficiarios) {
        return beneficiarios.stream()
                .map(BeneficiarioListResponse::new)
                .collect(Collectors.toList());
    }

    public BeneficiarioListResponse(Beneficiario beneficiario) {
        this.idBeneficiario = beneficiario.getIdBeneficiario();
        this.nome = beneficiario.getNome();
    }
}
