package br.com.iago.beneficiario_documento.beneficiario.infra;


import br.com.iago.beneficiario_documento.beneficiario.application.repository.BeneficiarioRepository;
import br.com.iago.beneficiario_documento.beneficiario.domain.Beneficiario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioInfraRepository implements BeneficiarioRepository {

    private final BeneficiarioSpringDataJPARepository beneficiarioSpringDataJPARepository;

    @Override
    public Beneficiario salva(Beneficiario beneficiario) {
        log.info("[inicia] BeneficiarioInfraRepository - salva");
        beneficiarioSpringDataJPARepository.save(beneficiario);
        log.info("[finaliza] BeneficiarioInfraRepository - salva");
        return beneficiario;
    }

    @Override
    public List<Beneficiario> buscaTudosBeneficiarios() {
        log.info("[inicia] BeneficiarioInfraRepository - buscaTudosBeneficiarios");
        List<Beneficiario> todosBeneficiarios = beneficiarioSpringDataJPARepository.findAll();
        log.info("[finaliza] BeneficiarioInfraRepository - buscaTudosBeneficiarios");
        return todosBeneficiarios;
    }

    @Override
    public Beneficiario buscaBeneficiarioAtravesId(UUID idBeneficiario) {
        log.info("[inicia] BeneficiarioInfraRepository - buscaBeneficiarioAtravesId");
        Beneficiario beneficiario = beneficiarioSpringDataJPARepository.findById(idBeneficiario)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado!"));
        log.info("[finaliza] BeneficiarioInfraRepository - buscaBeneficiarioAtravesId");
        return beneficiario;
    }

    @Override
    public void deletaBeneficiario(Beneficiario beneficiario) {
        log.info("[inicia] BeneficiarioInfraRepository - deletaBeneficiario");
        beneficiarioSpringDataJPARepository.delete(beneficiario);
        log.info("[finaliza] BeneficiarioInfraRepository - deletaBeneficiario");
    }
}
