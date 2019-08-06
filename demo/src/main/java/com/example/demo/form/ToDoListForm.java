package com.example.demo.form;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * ToDoリストフォーム
 */
public class ToDoListForm {
	
	// ID
	private Long id;

	// ToDo名
	private String name;
	
	// 期限
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate deadline;
	
	// 作成日
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate createdAt;
	
	// 完了
	private boolean isFinished;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the deadline
	 */
	public LocalDate getDeadline() {
		return deadline;
	}

	/**
	 * @param deadline the deadline to set
	 */
	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	/**
	 * @return the createdAt
	 */
	public LocalDate getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * @return the isFinished
	 */
	public boolean isFinished() {
		return isFinished;
	}

	/**
	 * @param isFinished the isFinished to set
	 */
	public void setFinished(boolean isFinished) {
		this.isFinished = isFinished;
	}
}
