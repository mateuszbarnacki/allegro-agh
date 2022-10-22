package com.agh.allegro

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AllegroApplication

fun main(args: Array<String>) {
	runApplication<AllegroApplication>(*args)
}
