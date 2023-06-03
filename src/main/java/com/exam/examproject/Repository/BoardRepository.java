package com.exam.examproject.Repository;

import com.exam.examproject.dto.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
