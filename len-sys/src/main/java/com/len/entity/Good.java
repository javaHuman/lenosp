package com.len.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by xu on 2019/4/25.
 */
@Table(name = "sys_good")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Good {

    @Id
    @Column(name = "good_id")
    private Integer goodId;

    @Column(name = "good_name")
    private String goodName;

    @Column(name = "good_state")
    private Integer goodState;

    @Column(name = "good_type")
    private Integer goodType;

    @Column(name = "good_date")
    private Date goodDate;



}
