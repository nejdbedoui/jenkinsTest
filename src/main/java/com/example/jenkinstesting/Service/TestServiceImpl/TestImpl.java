package com.example.jenkinstesting.Service.TestServiceImpl;

import com.example.jenkinstesting.Service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestImpl implements TestService {
    @Override
    public String get() {
        return "hello";
    }

    @Override
    public String get2() {
        return null;
    }
}
