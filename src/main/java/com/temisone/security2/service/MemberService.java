package com.temisone.security2.service;

import com.temisone.security2.dto.member.MemberJoinRequestDto;
import com.temisone.security2.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    public String addUser(MemberJoinRequestDto requestDto){
        return memberRepository.save(requestDto.toEntity(passwordEncoder)).getUsername();
    }

}
