package com.shopkobe.shopkobe.stores

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface StoresRepo : MongoRepository<StoreEntity, String> {
    override fun findAll(pageable: Pageable): Page<StoreEntity>
}

@Document("stores")
data class StoreEntity(
    @Id
    val id: ObjectId? = null,
    @Field("store_id")
    val storeId: String,
    val address: String,
    val brand: String,
    val city: String,
    val name: String,
    val type: String,
    val zipcode: Double,
    @Field("work_time")
    val workTime: String,

    val latitude: Double? = null,
    val longitude: Double? = null
)