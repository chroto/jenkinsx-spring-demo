package com.example.jenkinsxspringdemo

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.Controller

@Controller
class HomeController

@RequestMapping("/")
fun home() = "Hello"
