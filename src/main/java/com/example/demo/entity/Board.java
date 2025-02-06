package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Board {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
//	@JsonProperty("title")
	private String title;
	
//	@JsonProperty("content")
	@Column(columnDefinition = "TEXT")
	private String content;
	
//	@JsonProperty("writer")
	private String writer;
}
