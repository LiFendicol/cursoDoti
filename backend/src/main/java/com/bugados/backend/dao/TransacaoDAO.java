package com.bugados.backend.dao;

import org.springframework.data.repository.CrudRepository;

import com.bugados.backend.model.Transacao;

public interface TransacaoDAO extends CrudRepository<Transacao, Integer> {

}
