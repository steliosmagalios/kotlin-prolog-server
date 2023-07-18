package me.steliosmagalios.prologserver.controllers

import me.steliosmagalios.prologserver.services.PrologService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SchedulerController(val prologService: PrologService) {
    @GetMapping("/scheduler")
    fun schedulerCall(): String {
        return prologService.execute();
    }
}
