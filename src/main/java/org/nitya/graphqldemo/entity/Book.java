package org.nitya.graphqldemo.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "project_book")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String title;
    private String description;
    private String author;
    private Double price;
    private  int pages;
}
