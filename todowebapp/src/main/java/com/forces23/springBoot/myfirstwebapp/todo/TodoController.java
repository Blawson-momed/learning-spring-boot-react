package com.forces23.springBoot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("uname")
public class TodoController {

	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	private TodoService todoService;

	// shows all todos on page
	@RequestMapping("/list-todos")
	public String listAllTodos(ModelMap model) {
		String username = getLoggedinUsername(model);
		List<Todo> todos = todoService.findByUsername(username);
		model.addAttribute("todos", todos);
		return "listTodos";
	}
	
	// ----------------- add todo below -------------------
	
	// allows you to add todos to your todo list
	@RequestMapping(value = "/add-todo", method = RequestMethod.GET)
	public String showNewTodoPage(ModelMap model) {
		String username = getLoggedinUsername(model);
		Todo todo = new Todo(0, username, "test", LocalDate.now().plusYears(1), false);
		model.put("todo", todo);
		return "todo";
	}

	

	/*
	 * this is a validation for the addtodo page and if you pass, it calls addTodo()
	 * from TodoService Class and adds the todo to the list and if you dont pass the
	 * validation then you return to the add todo page instead of the white label
	 * error page
	 */
	@RequestMapping(value = "/add-todo", method = RequestMethod.POST)
	public String addNewTodo(ModelMap model, @Valid Todo todo, BindingResult result) {

		if (result.hasErrors()) {
			//------- change this to logs -------
			System.out.println("LIST OF ERRORS (TodoController -- add todo) .... ");
			result.getAllErrors().forEach(System.out::println);
			System.out.println("END OF ERRORS (TodoController -- add todo) .... ");
			return "todo";
		}

		String username = getLoggedinUsername(model);
		todoService.addTodo(username, todo.getDescription(), todo.getTargetdate(), false);
		return "redirect:/list-todos";
	}
	// ----------------- delete todo below -------------------
	
	// allows you to delete todos
	@RequestMapping("/delete-todo")
	public String deleteTodo(@RequestParam int id) {
		todoService.deleteById(id);
		return "redirect:/list-todos";
	}

	// ----------------- update todo below -------------------
	
	@RequestMapping(value="/update-todo", method=RequestMethod.GET )
	public String updateTodo(@RequestParam int id, ModelMap model) {
		Todo todo = todoService.findById(id);
		model.addAttribute("updateTodo", todo);
		return "updateTodo";
	}
	
	@RequestMapping(value="/update-todo", method=RequestMethod.POST) 
	public String updateTodo(@RequestParam int id, ModelMap model, @Valid Todo todo, BindingResult result ) {
		if(result.hasErrors()){ 
			//------- change this to logs -------
			System.out.println("LIST OF ERRORS (TodoController -- update todo) .... ");
			result.getAllErrors().forEach(System.out::println);
			System.out.println("END OF ERRORS (TodoController -- update todo) .... ");
			
			return "updateTodo"; 
		}
		
		String username = getLoggedinUsername(model);
		todo.setUsername(username);
		todoService.updateTodo(todo);
		return "redirect:/list-todos";
	}
	
	private String getLoggedinUsername(ModelMap model) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
	
				

}
