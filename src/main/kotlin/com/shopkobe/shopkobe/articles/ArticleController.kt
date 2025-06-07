package com.shopkobe.shopkobe.articles

import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ArticleController(
    private val articleService: ArticlesService
) {
    @GetMapping("/articles")
    @ResponseBody
    fun getAllArticles(
        @RequestParam(defaultValue = "0") page: Int,
        @RequestParam(defaultValue = "10") size: Int
    ): Page<Any> {
        return articleService.getAllArticles(page, size)
    }
}