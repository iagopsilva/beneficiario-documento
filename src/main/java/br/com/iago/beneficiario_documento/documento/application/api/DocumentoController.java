package br.com.iago.beneficiario_documento.documento.application.api;

import br.com.iago.beneficiario_documento.documento.application.service.DocumentoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class DocumentoController implements DocumentoAPI {

    private final DocumentoService documentoService;

    @Override
    public DocumentoResponse postDocumento(UUID idBeneficiario, @Valid DocumentoRequest documentoRequest) {
        log.info("[inicia] DocumentoController - postDocumento");
        log.info("[idBeneficiario] {}", idBeneficiario);
        DocumentoResponse documentoCriado = documentoService.criaDocumento(documentoRequest);
        log.info("[inicia] DocumentoController - postDocumento");
        return documentoCriado;
    }
}
