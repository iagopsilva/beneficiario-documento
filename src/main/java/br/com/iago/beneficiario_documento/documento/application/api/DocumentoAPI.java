package br.com.iago.beneficiario_documento.documento.application.api;


import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/v1/beneficiario/{idBeneficiario}/documento")
public interface DocumentoAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    DocumentoResponse postDocumento(@PathVariable UUID IdBeneficiario,
                                    @Valid @RequestBody DocumentoRequest documentoRequest);

}

