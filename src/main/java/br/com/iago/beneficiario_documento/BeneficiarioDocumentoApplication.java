package br.com.iago.beneficiario_documento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class BeneficiarioDocumentoApplication {

    @GetMapping
    public String getHomeTeste() {
        return "Beneficiario API Home";
    }

    public static void main(String[] args) {

        SpringApplication.run(BeneficiarioDocumentoApplication.class, args);
    }

}
