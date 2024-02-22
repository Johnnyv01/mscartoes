package course.wscartoes.wscartoes.infra.repository;

import course.wscartoes.wscartoes.domain.ClienteCartao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteCartaoRepository extends JpaRepository<ClienteCartao, Long> {
   List<ClienteCartao> findByCpf(String cpf);
}
