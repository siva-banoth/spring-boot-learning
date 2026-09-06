package com.vector.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.TableGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Author {
	
	
	@Id
	@TableGenerator(
			name = "table_gen",
			table = "id_generator",
			pkColumnName = "gen_name",
			valueColumnName = "gen_value",
			pkColumnValue = "authorid",
			allocationSize = 1
			)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "table_gen")
	private Long id;
	
	private String name;
	
	
	@ManyToMany(mappedBy = "authors")
	List<Book> books = new ArrayList<>();
	
	

}
