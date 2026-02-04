package backend.ticketsystem;

import java.util.Date;

public class Ticket {
    private int id;
    private String title;
    private String description;
    private String status;
    private String prority;
    private Date createdAt;

    public Ticket(int id, String title, String description, String status, String prority, Date createdAt) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.prority = prority;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrority() {
        return prority;
    }

    public void setPrority(String prority) {
        this.prority = prority;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
