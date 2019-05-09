package com.example.blog.repository;

import com.example.blog.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ArticleRepository {

    @Select("select * from article where a_id = 98")
    Article selectArticleById();

    Integer insertOneArticle(@Param("article") Article article);

    Integer deleteOneArticleById(@Param("aid") Integer aid);

    List<Article> queryArticleList();
}
