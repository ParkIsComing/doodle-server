package com.example.doodle.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class ClgDTO {
    private String clgid;
    private String clgname;
    private String clgmanagerid;
    private String clginfo;
    private int clgmemberno;
    private Date clgterm;
}
