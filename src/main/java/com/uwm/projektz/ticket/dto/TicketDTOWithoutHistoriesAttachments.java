package com.uwm.projektz.ticket.dto;

import com.uwm.projektz.enums.TicketType;
import com.uwm.projektz.enums.Type;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * Created by Tomasz Komoszeski on 2016-05-12.
 */

@ApiModel
public class TicketDTOWithoutHistoriesAttachments implements Serializable {
    private Long id;
    private TicketType kind;
    private Type type;
    private String description;
    private String user;
    private String priority;
    private String project;

    public TicketDTOWithoutHistoriesAttachments() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TicketType getKind() {
        return kind;
    }

    public void setKind(TicketType kind) {
        this.kind = kind;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public TicketDTOWithoutHistoriesAttachments(Long id, TicketType kind, Type type, String description, String user, String priority, String project) {
        this.id = id;
        this.kind = kind;
        this.type = type;
        this.description = description;
        this.user = user;
        this.priority = priority;
        this.project = project;
    }
}
