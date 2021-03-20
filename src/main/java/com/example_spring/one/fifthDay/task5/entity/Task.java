package com.example_spring.one.fifthDay.task5.entity;

import com.example_spring.one.fifthDay.task5.entity.enums.Behavior;
import lombok.*;

import javax.persistence.*;


@Entity
@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Task {

  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY )
  private int id;

  private String name;

  @Enumerated(EnumType.STRING)
  private Behavior behavior;

}
