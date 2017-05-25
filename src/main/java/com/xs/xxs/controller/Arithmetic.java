package com.xs.xxs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
public class Arithmetic {
    @RequestMapping({"/arithmetic","/arithmetic.html"})
    public ModelAndView arithmetic(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        Map<String, Object> data = new HashMap<String, Object>();
        return new ModelAndView("templates/arithmetic", data);
    }
}
