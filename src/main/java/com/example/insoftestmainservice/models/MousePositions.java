package com.example.insoftestmainservice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table(name = "mouse_positions")
@Getter
@Setter
public class MousePositions {

    public MousePositions() { }

    public MousePositions(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "x")
    private int x;


    @Column(name = "y")
    private int y;

    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    protected Date createdAt;

}
