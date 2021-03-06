package cat.tecnocampus.domain;

import java.time.LocalDateTime;

/**
 * Created by roure on 19/09/2016.
 */
public class NoteLab {

    private String title;
    private String content;

    private final LocalDateTime dateCreation;

    private LocalDateTime dateEdit;

    public NoteLab(String title, String content, LocalDateTime time, LocalDateTime timeEdit) {
        this.setTitle(title);
        this.setContent(content);
        this.dateCreation = time;
        this.setDateEdit(timeEdit);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public LocalDateTime getDateEdit() {
        return dateEdit;
    }

    public void setDateEdit(LocalDateTime date_edit) {
        this.dateEdit = date_edit;
    }

    public String toString(){
        return "NoteLab: "+this.title+", Content: "+ this.content;
    }
}
