package com.generation.eletronico.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.eletronico.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	public List<Produto> findAllByNomeContainingIgnoreCase (String nome);
	public List<Produto> findAllByPrecoBetween (double valorInicio, double valorFim);
	@Query (value="select * from tb_produto where preco > :valor1 and preco < :valor2", nativeQuery=true)
	public List<Produto> rangePreco(@Param("valor1") double valor1, @Param("valor2") double valor2);
	@Query (value="select * from tb_produto inner join tb_tipo_eletro "
			+ "on tb_tipo_eletro.id = tb_produto.tipo_eletro_id "
			+ "where tb_tipo_eletro.id = :tipo_id "
			+ "and preco <= :valor", nativeQuery = true)
	public List<Produto> FiltroTipoAndValor(@Param("tipo_id") long tipo_id, @Param("valor") double valor);
	//teste com descricao do tipo_eletro
	@Query (value="select * from tb_produto inner join tb_tipo_eletro "
			+ "on tb_tipo_eletro.id = tb_produto.tipo_eletro_id "
			+ "where tb_tipo_eletro.descricao like CONCAT(:descricao, '%') "
			+ "and preco <= :valor", nativeQuery = true)
	public List<Produto> FiltroDescricaoAndValor(@Param("descricao") String descricao, @Param("valor") double valor);
}
