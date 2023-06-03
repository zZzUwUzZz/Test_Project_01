package com.exam.examproject.service;

import com.exam.examproject.Repository.BoardRepository;
import com.exam.examproject.dto.Board;
import com.exam.examproject.dto.BoardResponse;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

@Transactional
@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;
    public void savePost(BoardResponse boardDto) throws ParseException, ParseException {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
        Locale.setDefault(Locale.KOREA);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String todayfm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
        Date today = new Date(format.parse(todayfm).getTime());

        Board board = Board.builder()
                .title(boardDto.getTitle())
                .content(boardDto.getContent())
                .author(boardDto.getAuthor())
                .createdDate(todayfm)
                .modifiedDate(todayfm)
                .build();

        boardRepository.save(board);
    }
}
