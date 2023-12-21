package com.lms.dto;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddCourseDto {

	@NotEmpty(message = "coursename cannot be empty")
	private String courseName;

	@NotEmpty(message = "courseTrainer cannot be empty")
	private String courseTrainer;

	private String description;

	private MultipartFile courseImage;

}
