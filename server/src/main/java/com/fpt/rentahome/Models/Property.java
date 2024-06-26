package com.fpt.rentahome.Models;

import java.util.Date;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "property")
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String category;
    private String description;
    private float price;
    private float area;
    private String status;

    //One to one relationship with Location
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location", referencedColumnName = "id")
    private Location location;
    private String rent_type;
    private int bathroom_count;
    private int room_count;
    private boolean equipped;
    //@OneToMany(mappedBy = "property", cascade = CascadeType.ALL)
    //private List<Comment> comments;
    private Date publish_date;

//    public List<Comment> getComments() {
//        return comments;
//    }
}