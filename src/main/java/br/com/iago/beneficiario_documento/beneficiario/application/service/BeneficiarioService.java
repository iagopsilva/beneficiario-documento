package br.com.iago.beneficiario_documento.beneficiario.application.service;

import br.com.iago.beneficiario_documento.beneficiario.application.api.BeneficiarioRequest;
import br.com.iago.beneficiario_documento.beneficiario.application.api.BeneficiarioResponse;

public interface BeneficiarioService {
    public BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest);
}
