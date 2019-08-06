package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.ToDo;
import com.example.demo.form.ToDoListForm;

/**
 * TODOサービス
 */
@Service
public class ToDoService {

	/**
	 * エンティティをフォームに変換します
	 * @param toDo
	 * @return フォーム
	 */
	public ToDoListForm convertEntityToForm(ToDo toDo) {
		ToDoListForm form = new ToDoListForm();
		form.setId(toDo.getId());
		form.setName(toDo.getName());
		form.setDeadline(toDo.getDeadline());
		form.setCreatedAt(toDo.getCreatedAt());
		form.setFinished(toDo.isFinished());
		return form;
	}
	
	/**
	 * フォームをエンティティに変換します
	 * @param toDoListForm
	 * @return エンティティ
	 */
	public ToDo convertFormToEntity(ToDoListForm toDoListForm) {
		ToDo toDo = new ToDo();
		toDo.setId(toDoListForm.getId());
		toDo.setName(toDoListForm.getName());
		toDo.setDeadline(toDoListForm.getDeadline());
		toDo.setCreatedAt(toDoListForm.getCreatedAt());
		toDo.setFinished(toDoListForm.isFinished());
		return toDo;
	}
}
