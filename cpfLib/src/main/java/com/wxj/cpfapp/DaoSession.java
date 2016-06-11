package com.wxj.cpfapp;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig cityCPFDaoConfig;

    private final CityCPFDao cityCPFDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        cityCPFDaoConfig = daoConfigMap.get(CityCPFDao.class).clone();
        cityCPFDaoConfig.initIdentityScope(type);

        cityCPFDao = new CityCPFDao(cityCPFDaoConfig, this);

        registerDao(CityCPF.class, cityCPFDao);
    }
    
    public void clear() {
        cityCPFDaoConfig.getIdentityScope().clear();
    }

    public CityCPFDao getCityCPFDao() {
        return cityCPFDao;
    }

}
