package br.com.vainoracha.core.web

import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

/**
 * Created by JoaoPedroCardoso on 23/05/18
 */
@RestController
class HelloController {

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @GetMapping("/hello/{name}", produces = [(MediaType.APPLICATION_JSON_UTF8_VALUE)])
    fun hello(@PathVariable(value = "name") name: String): String = "Hello $name !"
}