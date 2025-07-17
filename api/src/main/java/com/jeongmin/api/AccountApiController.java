package com.jeongmin.api;

import com.jeongmin.db.AccountEntity;
import com.jeongmin.db.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/account")
public class AccountApiController {

    private final AccountRepository accountRepository;

    @GetMapping("")
    public void save() {
        var acc = AccountEntity.builder().build();
        accountRepository.save(acc);
    }
}
