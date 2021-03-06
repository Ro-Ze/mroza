package database;

import java.util.List;
import database.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table PROGRAM.
 */
public class Program {

    private Long id;
    /** Not-null value. */
    private String symbol;
    /** Not-null value. */
    private String name;
    private String description;
    private java.util.Date createDate;
    private boolean isFinished;
    private Long childId;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient ProgramDao myDao;

    private Child child;
    private Long child__resolvedKey;

    private List<TableTemplate> tableTemplateList;

    public Program() {
    }

    public Program(Long id) {
        this.id = id;
    }

    public Program(Long id, String symbol, String name, String description, java.util.Date createDate, boolean isFinished, Long childId) {
        this.id = id;
        this.symbol = symbol;
        this.name = name;
        this.description = description;
        this.createDate = createDate;
        this.isFinished = isFinished;
        this.childId = childId;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getProgramDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getSymbol() {
        return symbol;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /** Not-null value. */
    public String getName() {
        return name;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public java.util.Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    public boolean getIsFinished() {
        return isFinished;
    }

    public void setIsFinished(boolean isFinished) {
        this.isFinished = isFinished;
    }

    public Long getChildId() {
        return childId;
    }

    public void setChildId(Long childId) {
        this.childId = childId;
    }

    /** To-one relationship, resolved on first access. */
    public Child getChild() {
        Long __key = this.childId;
        if (child__resolvedKey == null || !child__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            ChildDao targetDao = daoSession.getChildDao();
            Child childNew = targetDao.load(__key);
            synchronized (this) {
                child = childNew;
            	child__resolvedKey = __key;
            }
        }
        return child;
    }

    public void setChild(Child child) {
        synchronized (this) {
            this.child = child;
            childId = child == null ? null : child.getId();
            child__resolvedKey = childId;
        }
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<TableTemplate> getTableTemplateList() {
        if (tableTemplateList == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            TableTemplateDao targetDao = daoSession.getTableTemplateDao();
            List<TableTemplate> tableTemplateListNew = targetDao._queryProgram_TableTemplateList(id);
            synchronized (this) {
                if(tableTemplateList == null) {
                    tableTemplateList = tableTemplateListNew;
                }
            }
        }
        return tableTemplateList;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetTableTemplateList() {
        tableTemplateList = null;
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}
