package br.com.iago.beneficiario_documento.beneficiario.application.service;

import br.com.iago.beneficiario_documento.beneficiario.application.api.*;
import br.com.iago.beneficiario_documento.beneficiario.domain.Beneficiario;
import br.com.iago.beneficiario_documento.beneficiario.application.repository.BeneficiarioRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioApplicationService implements BeneficiarioService {

    private final BeneficiarioRepository beneficiarioRepository;

    @Override
    public BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest) {
        log.info("[inicia] BeneficiarioApplicationService - criaBeneficiario");
        Beneficiario beneficiario = beneficiarioRepository.salva(new Beneficiario(beneficiarioRequest));
        log.info("[finaliza] BeneficiarioApplicationService - criaBeneficiario");
        return BeneficiarioResponse.builder()
                .idBeneficiario(beneficiario.getIdBeneficiario())
                .build();
    }

    @Override
    public List<BeneficiarioListResponse> buscaTudosBeneficiarios() {
        log.info("[inicia] BeneficiarioApplicationService - buscaTudosBeneficiarios");
        List<Beneficiario> beneficiarios = beneficiarioRepository.buscaTudosBeneficiarios();
        log.info("[inicia] BeneficiarioApplicationService - buscaTudosBeneficiarios");
        return BeneficiarioListResponse.converte(beneficiarios);
    }

    @Override
    public BeneficiarioDetalhadoResponse buscaBeneficiarioAtravesId(UUID idBeneficiario) {
        log.info("[inicia] BeneficiarioApplicationService - buscaBeneficiarioAtravesId");
        Beneficiario beneficiario = beneficiarioRepository.buscaBeneficiarioAtravesId(idBeneficiario);
        log.info("[finaliza] BeneficiarioApplicationService - buscaBeneficiarioAtravesId");
        return new BeneficiarioDetalhadoResponse(beneficiario);
    }

    @Override
    public void deletaBeneficiarioAtravesId(UUID idBeneficiario) {
        log.info("[inicia] BeneficiarioApplicationService - deletaBeneficiarioAtravesId");
        Beneficiario beneficiario = beneficiarioRepository.buscaBeneficiarioAtravesId(idBeneficiario);
        beneficiarioRepository.deletaBeneficiario(beneficiario);
        log.info("[finaliza] BeneficiarioApplicationService - deletaBeneficiarioAtravesId");
    }

    @Override
    public void patchAlteraBeneficiario(UUID idBeneficiario, BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest) {
        log.info("[inicia] BeneficiarioApplicationService - patchAlteraBeneficiario");
        Beneficiario beneficiario = beneficiarioRepository.buscaBeneficiarioAtravesId(idBeneficiario);
        beneficiario.altera(beneficiarioAlteracaoRequest);
        beneficiarioRepository.salva(beneficiario);
        log.info("[finaliza] BeneficiarioApplicationService - patchAlteraBeneficiario");
    }
}
