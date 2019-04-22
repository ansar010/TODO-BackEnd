package com.ansar.rest.webservices.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardCodedService {

	private static List<Todo> todo = new ArrayList<>();
	private static int idCounter=0;
	
	static {
		todo.add(new Todo(++idCounter,"ansar","Learn about Angular",new Date(),false));
		todo.add(new Todo(++idCounter,"ansar","Learn about Java",new Date(),false));
		todo.add(new Todo(++idCounter,"ansar","Learn about React",new Date(),false));
		todo.add(new Todo(++idCounter,"ansar","Learn about NodeJs",new Date(),false));
	}
	
	public List<Todo> findAll() {
		return todo;
	}

}
