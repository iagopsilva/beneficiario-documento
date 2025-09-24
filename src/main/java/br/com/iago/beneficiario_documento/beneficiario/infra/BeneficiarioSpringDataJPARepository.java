package br.com.iago.beneficiario_documento.beneficiario.infra;

import br.com.iago.beneficiario_documento.beneficiario.domain.Beneficiario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BeneficiarioSpringDataJPARepository extends JpaRepository<Beneficiario, UUID> {

}
