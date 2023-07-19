package com.leonardovbdo.crudspring.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
// @Table(name = "cursos")
public class Course implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 200, nullable = false)
  private String name;

  @Column(length = 10, nullable = false)
  private String category;

}
