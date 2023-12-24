package com.springboot.blog.service;

import com.springboot.blog.payload.CommentDto;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;


public interface CommentService {
    CommentDto createComment(long postId, CommentDto commentDto);
    List<CommentDto> getCommentsByPostId(long postId);
    CommentDto getCommentById(Long postId,Long commentId);
    CommentDto updateComment(Long postId,Long commentId,CommentDto commentRequest);
    void deleteComment(Long postId,Long commentId );

}
