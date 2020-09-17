package com.api.library.model;

import org.springframework.context.annotation.Configuration;

import javax.persistence.*;

@Entity
@Table(name="role")
public class AppRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "role_name")
    private String roleName;

    @Override
    public String toString() {
        return "AppRole{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(final String roleName) {
        this.roleName = roleName;
    }
}
