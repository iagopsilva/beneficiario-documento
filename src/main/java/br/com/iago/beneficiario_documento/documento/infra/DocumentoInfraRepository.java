package br.com.iago.beneficiario_documento.documento.infra;

import br.com.iago.beneficiario_documento.documento.application.repository.DocumentoRepository;
import br.com.iago.beneficiario_documento.documento.domain.Documento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class DocumentoInfraRepository implements DocumentoRepository {
    private final DocumentoSpringJPARepository documentoSpringJPARepository;

    @Override
    public Documento salvaDocumento(Documento documento) {
        log.info("[inicia] DocumentoInfraRepository - salvaDocumento");
        documentoSpringJPARepository.save(documento);
        log.info("[finaliza] DocumentoInfraRepository - salvaDocumento");
        return documento;
    }

    @Override
    public List<Documento> buscaDocumentosDoBeneficiario(UUID idBeneficiario) {
        log.info("[inicia] DocumentoInfraRepository - buscaDocumentosDoBeneficiario");
        var documentos = documentoSpringJPARepository.findByIdBeneficiarioTitular(idBeneficiario);
        log.info("[finaliza] DocumentoInfraRepository - buscaDocumentosDoBeneficiario");
        return documentos;
    }
}
