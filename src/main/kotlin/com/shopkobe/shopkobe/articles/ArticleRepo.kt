package com.shopkobe.shopkobe.articles

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface EurospinRepo : MongoRepository<ArticleEurospin, String>{
    override fun findAll(pageable: Pageable): Page<ArticleEurospin>
}
@Document("articles_eurospin")
data class ArticleEurospin(
    @Id val id: ObjectId = ObjectId(),
    val product_id: String?, val barcode: String?, val name: String?, val brand: String?,
    val category: String?, val subcategory: String?, val unit: String?, val quantity: String?,
    val price: Double?, val unit_price: Double?, val best_price: Double?, val anchor_price: Double?,
    val special_price: Double?, val store: String?
)

@Repository
interface KauflandRepo : MongoRepository<ArticleKaufland, String>{
    override fun findAll(pageable: Pageable): Page<ArticleKaufland>
}
@Document("articles_kaufland")
data class ArticleKaufland(
    @Id val id: ObjectId = ObjectId(),
    val product_id: String?, val barcode: String?, val name: String?, val brand: String?,
    val category: String? = null, val subcategory: String? = null, val unit: String?, val quantity: String?,
    val price: Double?, val unit_price: Double?, val best_price: Double?, val anchor_price: Double?,
    val special_price: Double?, val store: String?
)

@Repository interface KonzumRepo : MongoRepository<ArticleKonzum, String>{
    override fun findAll(pageable: Pageable): Page<ArticleKonzum>
}
@Document("articles_konzum")
data class ArticleKonzum(
    @Id val id: ObjectId = ObjectId(),
    val product_id: String?, val barcode: String?, val name: String?, val brand: String?,
    val category: String? = null, val subcategory: String? = null, val unit: String?, val quantity: String?,
    val price: Double?, val unit_price: Double?, val best_price: Double?, val anchor_price: Double?,
    val special_price: Double?, val store: String?
)

@Repository interface KtcRepo : MongoRepository<ArticleKtc, String>{
    override fun findAll(pageable: Pageable): Page<ArticleKtc>
}
@Document("articles_ktc")
data class ArticleKtc(
    @Id val id: ObjectId = ObjectId(),
    val product_id: String?, val barcode: String?, val name: String?, val brand: String?,
    val category: String? = null, val subcategory: String? = null, val unit: String?, val quantity: String?,
    val price: Double?, val unit_price: Double?, val best_price: Double?, val anchor_price: Double?,
    val special_price: Double?, val store: String?
)

@Repository interface LidlRepo : MongoRepository<ArticleLidl, String>{
    override fun findAll(pageable: Pageable): Page<ArticleLidl>
}
@Document("articles_lidl")
data class ArticleLidl(
    @Id val id: ObjectId = ObjectId(),
    val product_id: String?, val barcode: String?, val name: String?, val brand: String?,
    val category: String? = null, val subcategory: String? = null, val unit: String?, val quantity: String?,
    val price: Double?, val unit_price: Double?, val best_price: Double?, val anchor_price: Double?,
    val special_price: Double?, val store: String?
)

@Repository interface MetroRepo : MongoRepository<ArticleMetro, String>{
    override fun findAll(pageable: Pageable): Page<ArticleMetro>
}
@Document("articles_metro")
data class ArticleMetro(
    @Id val id: ObjectId = ObjectId(),
    val product_id: String?, val barcode: String?, val name: String?, val brand: String?,
    val category: String? = null, val subcategory: String? = null, val unit: String?, val quantity: String?,
    val price: Double?, val unit_price: Double?, val best_price: Double?, val anchor_price: Double?,
    val special_price: Double?, val store: String?
)

@Repository interface NtlRepo : MongoRepository<ArticleNtl, String>{
    override fun findAll(pageable: Pageable): Page<ArticleNtl>
}
@Document("articles_ntl")
data class ArticleNtl(
    @Id val id: ObjectId = ObjectId(),
    val product_id: String?, val barcode: String?, val name: String?, val brand: String?,
    val category: String? = null, val subcategory: String? = null, val unit: String?, val quantity: String?,
    val price: Double?, val unit_price: Double?, val best_price: Double?, val anchor_price: Double?,
    val special_price: Double?, val store: String?
)

@Repository interface PlodineRepo : MongoRepository<ArticlePlodine, String>{
    override fun findAll(pageable: Pageable): Page<ArticlePlodine>
}
@Document("articles_plodine")
data class ArticlePlodine(
    @Id val id: ObjectId = ObjectId(),
    val product_id: String?, val barcode: String?, val name: String?, val brand: String?,
    val category: String? = null, val subcategory: String? = null, val unit: String?, val quantity: String?,
    val price: Double?, val unit_price: Double?, val best_price: Double?, val anchor_price: Double?,
    val special_price: Double?, val store: String?
)

@Repository interface RibolaRepo : MongoRepository<ArticleRibola, String>{
    override fun findAll(pageable: Pageable): Page<ArticleRibola>
}
@Document("articles_ribola")
data class ArticleRibola(
    @Id val id: ObjectId = ObjectId(),
    val product_id: String?, val barcode: String?, val name: String?, val brand: String?,
    val category: String? = null, val subcategory: String? = null, val unit: String?, val quantity: String?,
    val price: Double?, val unit_price: Double?, val best_price: Double?, val anchor_price: Double?,
    val special_price: Double?, val store: String?
)

@Repository interface SparRepo : MongoRepository<ArticleSpar, String>{
    override fun findAll(pageable: Pageable): Page<ArticleSpar>
}
@Document("articles_spar")
data class ArticleSpar(
    @Id val id: ObjectId = ObjectId(),
    val product_id: String?, val barcode: String?, val name: String?, val brand: String?,
    val category: String? = null, val subcategory: String? = null, val unit: String?, val quantity: String?,
    val price: Double?, val unit_price: Double?, val best_price: Double?, val anchor_price: Double?,
    val special_price: Double?, val store: String?
)

@Repository interface StudenacRepo : MongoRepository<ArticleStudenac, String>{
    override fun findAll(pageable: Pageable): Page<ArticleStudenac>
}
@Document("articles_studenac")
data class ArticleStudenac(
    @Id val id: ObjectId = ObjectId(),
    val product_id: String?, val barcode: String?, val name: String?, val brand: String?,
    val category: String? = null, val subcategory: String? = null, val unit: String?, val quantity: String?,
    val price: Double?, val unit_price: Double?, val best_price: Double?, val anchor_price: Double?,
    val special_price: Double?, val store: String?
)

@Repository interface TommyRepo : MongoRepository<ArticleTommy, String>{
    override fun findAll(pageable: Pageable): Page<ArticleTommy>
}
@Document("articles_tommy")
data class ArticleTommy(
    @Id val id: ObjectId = ObjectId(),
    val product_id: String?, val barcode: String?, val name: String?, val brand: String?,
    val category: String? = null, val subcategory: String? = null, val unit: String?, val quantity: String?,
    val price: Double?, val unit_price: Double?, val best_price: Double?, val anchor_price: Double?,
    val special_price: Double?, val store: String?
)

@Repository interface TrgocentarRepo : MongoRepository<ArticleTrgocentar, String>{
    override fun findAll(pageable: Pageable): Page<ArticleTrgocentar>
}
@Document("articles_trgocentar")
data class ArticleTrgocentar(
    @Id val id: ObjectId = ObjectId(),
    val product_id: String?, val barcode: String?, val name: String?, val brand: String?,
    val category: String? = null, val subcategory: String? = null, val unit: String?, val quantity: String?,
    val price: Double?, val unit_price: Double?, val best_price: Double?, val anchor_price: Double?,
    val special_price: Double?, val store: String?
)
