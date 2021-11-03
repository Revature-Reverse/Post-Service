package com.reverse.postservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "profile_pictures")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProfilePicture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "image_location", nullable = false)
    private ImageLocation imageLocation;

    @Column(name = "image_name", nullable = false, length = 50)
    private String imageName;
}