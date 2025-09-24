package br.com.iago.beneficiario_documento.application.service;

import br.com.iago.beneficiario_documento.application.api.BeneficiarioRequest;
import br.com.iago.beneficiario_documento.application.api.BeneficiarioResponse;

public interface BeneficiarioService {
    public BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest);
}
