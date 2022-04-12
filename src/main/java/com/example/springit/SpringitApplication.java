package com.example.springit;

import com.example.springit.domain.Comment;
import com.example.springit.domain.Link;
import com.example.springit.repositories.CommentRepository;
import com.example.springit.repositories.LinkRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class SpringitApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringitApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringitApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository){
        return args -> {
            Link link = new Link("Getting started with spring boot 2","https://www.mustafaguler.com/spring-boot");
            linkRepository.save(link);

            Comment comment = new Comment("This spring-boot is awesome",link);
            commentRepository.save(comment);

            link.addComment(comment);

            //Link firstLink = linkRepository.findByTitle("Getting started with spring boot 2");
            //System.out.println(firstLink.getTitle());
        };
    }
}


















