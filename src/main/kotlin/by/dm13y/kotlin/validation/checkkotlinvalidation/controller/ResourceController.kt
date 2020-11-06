package by.dm13y.kotlin.validation.checkkotlinvalidation.controller

import by.dm13y.kotlin.validation.checkkotlinvalidation.model.dto.ResourceDto
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
class ResourceController {
    @PostMapping
    fun createResource(@RequestBody @Valid resource: ResourceDto) {
        println(resource)
    }
}