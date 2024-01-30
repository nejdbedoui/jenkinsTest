package com.example.jenkinstesting.Controller;

import com.example.jenkinstesting.Service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class testApi {
    private final TestService testService;
    @GetMapping("get")
    public String getc(){return testService.get();}
}
