package com.exam.examproject.controller;

import com.exam.examproject.dto.BoardResponse;
import com.exam.examproject.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;

@Controller
@RequiredArgsConstructor
public class ExamController {

    private final BoardService boardService;

    @RequestMapping("/")
    public String list() {
        return "/board/list.html";
    }
    @RequestMapping("/post")
    public String post() {
        return "/board/post.html";
    }

    @PostMapping("/post")
    public String write(BoardResponse boardDto) throws ParseException {
        boardService.savePost(boardDto);
        return "redirect:/";
    }

}
