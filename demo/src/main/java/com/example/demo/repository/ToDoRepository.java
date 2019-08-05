package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ToDo;

/**
 * ToDoリポジトリ
 */
public interface ToDoRepository extends JpaRepository<ToDo, Long> {
	
	/**
	 * 全件取得します
	 * @return ToDo一覧
	 */
	public List<ToDo> findAll();
}
