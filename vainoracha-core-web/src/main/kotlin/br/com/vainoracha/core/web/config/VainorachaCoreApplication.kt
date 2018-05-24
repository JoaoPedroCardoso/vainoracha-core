package br.com.vainoracha.core.web.config

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = ["br.com.vainoracha.core", "br.com.vainoracha.core.service",
    "br.com.vainoracha.core.api"])
@EnableAutoConfiguration
open class VainorachaCoreApplication

fun main(args: Array<String>) {
    runApplication<VainorachaCoreApplication>(*args)
}
