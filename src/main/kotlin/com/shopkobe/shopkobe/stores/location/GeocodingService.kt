package com.shopkobe.shopkobe.stores.location

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

@Component
class GeocodingService(
    @Value("\${google.api.key}") private val apiKey: String
) {
    private val webClient: WebClient = WebClient.create("https://maps.googleapis.com")
    private val objectMapper = ObjectMapper()

    fun getCoordinates(address: String): Pair<Double, Double>? {
        val encodedAddress = URLEncoder.encode(address, StandardCharsets.UTF_8.toString())
        val response = webClient.get()
            .uri { uriBuilder ->
                uriBuilder
                    .path("/maps/api/geocode/json")
                    .queryParam("address", encodedAddress)
                    .queryParam("key", apiKey)
                    .build()
            }
            .retrieve()
            .bodyToMono(String::class.java)
            .block()


        println("Geocode API response for [$address]: $response")

        return parseCoordinatesFromJson(response)
    }

    private fun parseCoordinatesFromJson(response: String?): Pair<Double, Double>? {
        if (response == null) return null

        return try {
            val json = objectMapper.readTree(response)
            val results = json["results"]
            if (results != null && results.isArray && results.size() > 0) {
                val location = results[0]["geometry"]["location"]
                val lat = location["lat"].asDouble()
                val lng = location["lng"].asDouble()
                lat to lng
            } else null
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}