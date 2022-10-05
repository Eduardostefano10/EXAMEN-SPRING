package com.example.demo.Edu.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Edu.dao.Todo;
import com.example.demo.Edu.daoImpl.CategoriaDaoIMpl;
import com.example.demo.Edu.entity.Categories;


@Service
public class CategoriaService implements Todo<Categories> {

	@Autowired
	private CategoriaDaoIMpl daoIMpl;

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return daoIMpl.readAll2();
	}

	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return daoIMpl.readAll3();
	}

	


}
