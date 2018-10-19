package com.soto.bootscala.service;

import com.soto.bootscala.domain.MetaDatabase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MetaDataServiceTest {

    @Autowired
    private MetaDatabaseService metaDatabaseService;


    @Test
    public void testSave() {
        MetaDatabase metaDatabase = new MetaDatabase();
        metaDatabase.setName("default");
        metaDatabase.setLocation("hdfs://sotowang-pc:8020/user/hive/warehouse");

        metaDatabaseService.save(metaDatabase);
    }


    @Test
    public void testQuery(){
        Iterable<MetaDatabase> metaDatabases = metaDatabaseService.query();

        for (MetaDatabase metaDatabase : metaDatabases) {
            System.out.println(metaDatabase.getId());
            System.out.println(metaDatabase.getLocation());
            System.out.println(metaDatabase.getName());

        }

    }


}
