package ch.zli.m223.model.impl;

import ch.zli.m223.model.Rebate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity (name = "Rebate")
public class RebateImpl implements Rebate {

    @Id
    @GeneratedValue
    private Long id;

    private Integer rebate;

    public RebateImpl(Integer rebate) {
        this.rebate = rebate;
    }

    protected RebateImpl() {
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public Integer getRebate() {
        return rebate;
    }
}
