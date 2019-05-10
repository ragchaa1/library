package se.lab.library.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "PRODUCT")

public class Product {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pid;

    @Column(name = "productNumber")
    private Long productNumber;

    @Column(name = "name")
    private String name;

    @Column(name = "unitPrice")
    private Float unitPrice;

    @Column(name = "dateMfd")
    private LocalDate dateMfd;
}
