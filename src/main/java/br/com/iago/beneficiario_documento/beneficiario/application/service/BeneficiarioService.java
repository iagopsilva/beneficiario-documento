package br.com.iago.beneficiario_documento.beneficiario.application.service;

import br.com.iago.beneficiario_documento.beneficiario.application.api.*;

import java.util.List;
import java.util.UUID;

public interface BeneficiarioService {
    public BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest);

    List<BeneficiarioListResponse> buscaTudosBeneficiarios();

    BeneficiarioDetalhadoResponse buscaBeneficiarioAtravesId(UUID idBeneficiario);

    void deletaBeneficiarioAtravesId(UUID idBeneficiario);

    void patchAlteraBeneficiario(UUID idBeneficiario, BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest);
}
