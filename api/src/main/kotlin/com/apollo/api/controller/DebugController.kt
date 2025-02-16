package com.apollo.api.controller

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@RestController
@RequestMapping("/api")
class DebugController {
    private val logger = LoggerFactory.getLogger(DebugController::class.java)

    @GetMapping("/debug")
    fun debug(): Map<String, Any> {
        logger.debug("Debug endpoint called")
        return mapOf(
            "timestamp" to System.currentTimeMillis(),
            "message" to "Debug endpoint response",
            "status" to "OK"
        )
    }

    @GetMapping("/health")
    fun health(): String {
        logger.info("Health check called")
        return "Service is up and running!"
    }
}