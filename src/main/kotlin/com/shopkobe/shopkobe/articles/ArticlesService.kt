package com.shopkobe.shopkobe.articles

import org.springframework.data.domain.Page
import org.springframework.data.domain.PageImpl
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class ArticlesService(
    private val eurospinRepo: EurospinRepo,
    private val kauflandRepo: KauflandRepo,
    private val konzumRepo: KonzumRepo,
    private val ktcRepo: KtcRepo,
    private val lidlRepo: LidlRepo,
    private val metroRepo: MetroRepo,
    private val ntlRepo: NtlRepo,
    private val plodineRepo: PlodineRepo,
    private val ribolaRepo: RibolaRepo,
    private val sparRepo: SparRepo,
    private val studenacRepo: StudenacRepo,
    private val tommyRepo: TommyRepo,
    private val trgocentarRepo: TrgocentarRepo
) {
    fun getAllArticles(page: Int, size: Int): Page<Any> {
        val pageable: Pageable = PageRequest.of(page, size)
        val eurospinArticles = eurospinRepo.findAll(pageable)
        val kauflandArticles = kauflandRepo.findAll(pageable)
        val konzumArticles = konzumRepo.findAll(pageable)
        val ktcArticles = ktcRepo.findAll(pageable)
        val lidlArticles = lidlRepo.findAll(pageable)
        val metroArticles = metroRepo.findAll(pageable)
        val ntlArticles = ntlRepo.findAll(pageable)
        val plodineArticles = plodineRepo.findAll(pageable)
        val ribolaArticles = ribolaRepo.findAll(pageable)
        val sparArticles = sparRepo.findAll(pageable)
        val studenacArticles = studenacRepo.findAll(pageable)
        val tommyArticles = tommyRepo.findAll(pageable)
        val trgocentarArticles = trgocentarRepo.findAll(pageable)

        val allArticles = listOf(
            eurospinArticles.content,
            kauflandArticles.content,
            konzumArticles.content,
            ktcArticles.content,
            lidlArticles.content,
            metroArticles.content,
            ntlArticles.content,
            plodineArticles.content,
            ribolaArticles.content,
            sparArticles.content,
            studenacArticles.content,
            tommyArticles.content,
            trgocentarArticles.content
        ).flatten()

        return PageImpl(allArticles, pageable, allArticles.size.toLong())
    }
}