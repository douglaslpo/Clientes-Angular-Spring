package io.github.douglaslpo.clientes.model.repository;

import io.github.douglaslpo.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Cliente, Integer> {
}
