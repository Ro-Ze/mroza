package database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import de.greenrobot.dao.AbstractDaoMaster;
import de.greenrobot.dao.identityscope.IdentityScopeType;

import database.SyncDateDao;
import database.TherapistDao;
import database.ChildDao;
import database.TermSolutionDao;
import database.ProgramDao;
import database.TableTemplateDao;
import database.TableRowDao;
import database.TableFieldDao;
import database.ChildTableDao;
import database.TableFieldFillingDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * Master of DAO (schema version 1086): knows all DAOs.
*/
public class DaoMaster extends AbstractDaoMaster {
    public static final int SCHEMA_VERSION = 1086;

    /** Creates underlying database table using DAOs. */
    public static void createAllTables(SQLiteDatabase db, boolean ifNotExists) {
        SyncDateDao.createTable(db, ifNotExists);
        TherapistDao.createTable(db, ifNotExists);
        ChildDao.createTable(db, ifNotExists);
        TermSolutionDao.createTable(db, ifNotExists);
        ProgramDao.createTable(db, ifNotExists);
        TableTemplateDao.createTable(db, ifNotExists);
        TableRowDao.createTable(db, ifNotExists);
        TableFieldDao.createTable(db, ifNotExists);
        ChildTableDao.createTable(db, ifNotExists);
        TableFieldFillingDao.createTable(db, ifNotExists);
    }
    
    /** Drops underlying database table using DAOs. */
    public static void dropAllTables(SQLiteDatabase db, boolean ifExists) {
        SyncDateDao.dropTable(db, ifExists);
        TherapistDao.dropTable(db, ifExists);
        ChildDao.dropTable(db, ifExists);
        TermSolutionDao.dropTable(db, ifExists);
        ProgramDao.dropTable(db, ifExists);
        TableTemplateDao.dropTable(db, ifExists);
        TableRowDao.dropTable(db, ifExists);
        TableFieldDao.dropTable(db, ifExists);
        ChildTableDao.dropTable(db, ifExists);
        TableFieldFillingDao.dropTable(db, ifExists);
    }
    
    public static abstract class OpenHelper extends SQLiteOpenHelper {

        public OpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory, SCHEMA_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            Log.i("greenDAO", "Creating tables for schema version " + SCHEMA_VERSION);
            createAllTables(db, false);
        }
    }
    
    /** WARNING: Drops all table on Upgrade! Use only during development. */
    public static class DevOpenHelper extends OpenHelper {
        public DevOpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            Log.i("greenDAO", "Upgrading schema from version " + oldVersion + " to " + newVersion + " by dropping all tables");
            dropAllTables(db, true);
            onCreate(db);
        }
    }

    public DaoMaster(SQLiteDatabase db) {
        super(db, SCHEMA_VERSION);
        registerDaoClass(SyncDateDao.class);
        registerDaoClass(TherapistDao.class);
        registerDaoClass(ChildDao.class);
        registerDaoClass(TermSolutionDao.class);
        registerDaoClass(ProgramDao.class);
        registerDaoClass(TableTemplateDao.class);
        registerDaoClass(TableRowDao.class);
        registerDaoClass(TableFieldDao.class);
        registerDaoClass(ChildTableDao.class);
        registerDaoClass(TableFieldFillingDao.class);
    }
    
    public DaoSession newSession() {
        return new DaoSession(db, IdentityScopeType.Session, daoConfigMap);
    }
    
    public DaoSession newSession(IdentityScopeType type) {
        return new DaoSession(db, type, daoConfigMap);
    }
    
}