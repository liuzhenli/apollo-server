package com.apollo.api.controller


import com.apollo.api.TestApi
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController: TestApi {

    @GetMapping("/hello")
    override fun test():String {
        return "kotlin+gradle 搭建多模块"
    }

    @GetMapping("/hi")
     fun hello():String {
        return "kotlin+gradle 搭建多模块"
    }
}
