package database;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table SYNC_DATE.
 */
public class SyncDate {

    private Long id;
    private java.util.Date date;

    public SyncDate() {
    }

    public SyncDate(Long id) {
        this.id = id;
    }

    public SyncDate(Long id, java.util.Date date) {
        this.id = id;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public java.util.Date getDate() {
        return date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }

}