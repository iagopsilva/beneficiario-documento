package br.com.iago.beneficiario_documento.documento.infra;

import br.com.iago.beneficiario_documento.documento.domain.Documento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DocumentoSpringJPARepository extends JpaRepository<Documento, UUID> {
}
