package com.example.blog.controller;

import com.example.blog.entity.Article;
import com.example.blog.repository.ArticleRepository;
import com.example.blog.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/article")
@Slf4j
public class ArticleController {

    @Autowired
    private Article article;

    @Autowired
    private ArticleService articleService;

    @Autowired
    private ArticleRepository articleRepository;
    @RequestMapping("/list")
    public List<Article> queryArticleList(){
        List<Article> articles = articleRepository.queryArticleList();
        return articles;
    }

    @RequestMapping("/detail")
    public Article queryArticleDetail(){
        return articleRepository.selectArticleById();
    }

   @RequestMapping("/insert")
    public Integer insertArticle( @RequestBody Article article){
        log.debug(article.toString());
        return articleRepository.insertOneArticle(article);
    }

    @RequestMapping("/delete")
    public Integer deleteArticle(@RequestParam("aid") Integer aid){
        return articleRepository.deleteOneArticleById(aid);
    }


}
