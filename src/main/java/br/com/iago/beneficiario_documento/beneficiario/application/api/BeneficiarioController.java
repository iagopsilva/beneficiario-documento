package br.com.iago.beneficiario_documento.beneficiario.application.api;

import br.com.iago.beneficiario_documento.beneficiario.application.service.BeneficiarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioController implements BeneficiarioAPI {

    private final BeneficiarioService beneficiarioService;

    @Override
    public BeneficiarioResponse postBeneficiario(BeneficiarioRequest beneficiarioRequest) {
        log.info("[inicia] BeneficiarioController - postBeneficiario");
        BeneficiarioResponse beneficarioCriado = beneficiarioService.criaBeneficiario(beneficiarioRequest);
        log.info("[inicia] BeneficiarioController - postBeneficiario");
        return beneficarioCriado;
    }
}
