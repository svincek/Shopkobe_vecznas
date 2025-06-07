package com.shopkobe.shopkobe.stores

import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class StoresController(
    private val storesService: StoresService
) {
    @GetMapping("/stores")
    fun getAllStores(
        @RequestParam(defaultValue = "0") page: Int,
        @RequestParam(defaultValue = "10") size: Int
    ): Page<StoreEntity> {
        return storesService.getAllStores(page, size)
    }
}
