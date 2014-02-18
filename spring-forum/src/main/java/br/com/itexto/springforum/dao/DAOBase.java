package br.com.itexto.springforum.dao;

import java.util.List;

public interface DAOBase<T> {
	
	//Teste: funcionou, Vini!
	// Tô vendo !!!
	//Alterando a partir da interface web
	public List<T> list(int offset, int max);
	
	public void persistir(T objeto);
	
	public void excluir(T objeto);
	
	public T get(Long id);
	
}
