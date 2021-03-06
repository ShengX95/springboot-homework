package com.sx;

import com.sx.dao.ArticleDao;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootApplicationTests {

    @Autowired
    private ArticleDao articleDao;
    @Test
    void contextLoads() {
        System.out.println(articleDao.findAll());
    }

}
