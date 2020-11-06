package by.dm13y.kotlin.validation.checkkotlinvalidation.model.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.validation.constraints.NotNull

@JsonIgnoreProperties(ignoreUnknown = true)
data class ResourceDto(
    @field:NotNull(message = "resource is empty")
    val resourceName: String = "default value"
)
