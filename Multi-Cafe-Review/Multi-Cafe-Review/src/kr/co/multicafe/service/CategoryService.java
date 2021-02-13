package kr.co.multicafe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.multicafe.dao.CategoryMapper;
import kr.co.multicafe.dto.Cafe;
import kr.co.multicafe.dto.Category;

@Service
@Transactional
public class CategoryService {
//	public List<Category> listViewCategory();
//	public Category getCategory(int category_id);
	
	@Autowired
	CategoryMapper categoryMapper;
	
	public List<Category> listViewCategory(){
		return categoryMapper.listViewCategory();
	}
	
	public Category getCategory(int categoryId) {
		return categoryMapper.getCategory(categoryId);
	}
}