package apiproduct.service;

import java.util.List;

import apiproduct.entity.Produto;

public interface ProdutoService {
	
	List<Produto> buscarTodos();
	
	Produto salvar (Produto produto);
	
	void delete (Long id);
	

}
