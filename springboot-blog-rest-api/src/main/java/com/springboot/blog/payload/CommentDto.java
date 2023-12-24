package com.springboot.blog.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CommentDto {
    private long id;
    //should not br empty or null
    @NotEmpty(message = "must not be empty")
    private String name;
    //should not be null or empty
    //email validation
    @NotEmpty(message = "must not be empty")
    @Email
    private String email;
    //should not be null or empty
    //must be at least 10 characters
    @NotEmpty(message = "must not be empty")
    @Size(min = 10,message = "must be at least 10 characters")
    private String body;
}
