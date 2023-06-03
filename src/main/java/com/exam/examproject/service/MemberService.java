package com.exam.examproject.service;

import com.exam.examproject.Repository.memberRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Transactional
@Service
@RequiredArgsConstructor
public class MemberService {
    private final memberRepository memberRepo;

}
