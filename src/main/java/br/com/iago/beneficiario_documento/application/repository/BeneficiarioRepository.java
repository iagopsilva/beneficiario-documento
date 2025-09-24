package br.com.iago.beneficiario_documento.application.repository;

import br.com.iago.beneficiario_documento.application.domain.Beneficiario;

public interface BeneficiarioRepository {
    Beneficiario salva(Beneficiario beneficiario);
}
