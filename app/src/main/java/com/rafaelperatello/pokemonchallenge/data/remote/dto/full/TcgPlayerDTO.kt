package com.rafaelperatello.pokemonchallenge.data.remote.dto.full

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal data class TcgPlayerDTO(

    @SerialName("url")
    var url: String? = null,

    @SerialName("updatedAt")
    var updatedAt: String? = null,

    @SerialName("prices")
    var pricesDTO: Map<String, HolofoilDTO>? = emptyMap<String, HolofoilDTO>()
)