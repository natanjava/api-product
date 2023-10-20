package apiproduct.service;

import java.util.List;

import org.springframework.stereotype.Service;

import apiproduct.entity.Produto;
import apiproduct.repository.ProdutoRepository;

@Service
public class ProdutoServiceImpl implements ProdutoService {
	
	private final ProdutoRepository produtoRepository;
	
	public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}


	
	@Override
	public List<Produto> buscarTodos() {
		return produtoRepository.findAll();
	}

	@Override
	public Produto salvar(Produto produto) {
		 return produtoRepository.save(produto);
	}

	@Override
	public void delete(Long id) {
        try {
            produtoRepository.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException("Error deleting product");
        }
    }
		
}


