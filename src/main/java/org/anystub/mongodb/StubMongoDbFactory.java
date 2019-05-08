package org.anystub.mongodb;

import com.mongodb.DB;
import com.mongodb.client.MongoDatabase;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.support.PersistenceExceptionTranslator;
import org.springframework.data.mongodb.MongoDbFactory;

public class StubMongoDbFactory implements MongoDbFactory {
    @Override
    public MongoDatabase getDb() throws DataAccessException {
        return null;
    }

    @Override
    public MongoDatabase getDb(String s) throws DataAccessException {
        return null;
    }

    @Override
    public PersistenceExceptionTranslator getExceptionTranslator() {
        return null;
    }

    @Override
    public DB getLegacyDb() {
        return null;
    }
}
