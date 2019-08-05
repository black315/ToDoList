package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.ToDo;
import com.example.demo.form.ToDoListForm;

/**
 * TODOサービス
 */
@Service
public class ToDoService {

	public ToDoListForm convertEntityToForm(ToDo toDo) {
		ToDoListForm form = new ToDoListForm();
		form.setName(toDo.getName());
		form.setDeadline(toDo.getDeadline());
		form.setCreatedAt(toDo.getCreatedAt());
		form.setFinished(toDo.isFinished());
		return form;
	}
}
