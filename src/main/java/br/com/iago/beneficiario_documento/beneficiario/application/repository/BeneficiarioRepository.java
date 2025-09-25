package br.com.iago.beneficiario_documento.beneficiario.application.repository;

import br.com.iago.beneficiario_documento.beneficiario.domain.Beneficiario;

import java.util.List;
import java.util.UUID;

public interface BeneficiarioRepository {
    Beneficiario salva(Beneficiario beneficiario);

    List<Beneficiario> buscaTudosBeneficiarios();

    Beneficiario buscaBeneficiarioAtravesId(UUID idBeneficiario);
}
