package com.apollo.apolloserver

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication(scanBasePackages = ["com.apollo.api"])
class Application


fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}