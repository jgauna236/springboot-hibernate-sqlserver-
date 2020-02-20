package com.example.springboot.service;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Service;

import com.example.springboot.repository.GenericRepository;

@Service
public abstract class  GenericService<T, PK extends Serializable>{
	
	
	public T save(T entity) throws Exception {
		try {
			return getRepository().save(entity);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	
	public List<T> getAll() throws Exception {
		try {
			return getRepository().getAll();
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	
	public T get(PK id) throws Exception {
		try {
			if (id != null) {
				return getRepository().get(id);
			}
			else {
				return null;
			}
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	
	public void delete(T entity) throws Exception {
		try {
			if (entity != null) {
				getRepository().delete(entity);
			}
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	
	public List<T> save(List<T> entities) throws Exception{
		try {
			if (entities != null && !entities.isEmpty()) {
				getRepository().save(entities);
				return entities;
			}
			return null;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	public abstract GenericRepository<T, PK> getRepository();

}
