package com.example.demo.Model;


import javax.persistence.*;

@Entity
@Table(name = "Cart")
public class CartModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long prod_id;

    @Column(name = "Name", length = 255)
    private String name_prod;

    @Column(name = "Desc", nullable = false, length = 255)
    private String desc;

    public long getProd_id() {
        return prod_id;
    }

    public void setProd_id(long prod_id) {
        this.prod_id = prod_id;
    }

    public String getName() {
        return name_prod;
    }

    public void setName(String name_prod) {
        this.name_prod = name_prod;
        }


    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    
    
}