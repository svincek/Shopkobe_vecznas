package com.shopkobe.shopkobe.stores

import com.shopkobe.shopkobe.stores.location.GeocodingService
import org.slf4j.LoggerFactory
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service

@Service
class StoresService(
    private val storesRepo: StoresRepo,
    private val geocodingService: GeocodingService
) {
    private val logger = LoggerFactory.getLogger(StoresService::class.java)

    fun getAllStores(page: Int, size: Int): Page<StoreEntity> {
        val pageable = PageRequest.of(page, size)
        val storesPage = storesRepo.findAll(pageable)

        val updatedStores = storesPage.content.map { store ->
            if (store.latitude == null || store.longitude == null) {
                val fullAddress = "${store.address}, ${store.city}"
                val coords = geocodingService.getCoordinates(fullAddress)
                if (coords != null) {
                    logger.info("Updating store ${store.storeId} with coords: $coords")
                    store.copy(latitude = coords.first, longitude = coords.second)
                } else {
                    logger.warn("No coordinates found for address: $fullAddress")
                    store
                }
            } else {
                store
            }
        }

        updatedStores.filter { it.latitude != null && it.longitude != null }.forEach {
            storesRepo.save(it)
        }

        return storesRepo.findAll(pageable)
    }
}



