package com.exam.examproject.Repository;

import com.exam.examproject.dto.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface memberRepository extends JpaRepository<Member,Long> {
    public Member findByAccount(String account);
    public List<Member> findByName(String name);
    public Member findByPhone (String phone);
}
