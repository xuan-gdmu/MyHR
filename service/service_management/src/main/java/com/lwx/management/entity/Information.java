package com.lwx.management.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;


/**
 * <p>
 * 
 * </p>
 *
 * @author testjava
 * @since 2021-03-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Information对象", description="")
public class Information implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    private String name;

    private String phoneno;

    private String deptno;

    private String postno;

    private String email;

    private String location;

    private String remark;


    private Date joinDate;

    private String staffType;

    private String staffStatus;

    private String probation;

    private Date getPositionDate;

    private String documentType;

    private String identity;

    private Boolean sex;

    private Date bornDate;

    private Integer age;

    private String birthPlace;

    private String nationality;

    private String ethnicGroups;

    private Boolean marry;

    private Boolean hasBorn;

    private String politicCountenance;

    private String liveIn;

    private Long socialSecurityCard;

    private Long housingAccumulationFund;

    private Long accountNumber;

    private String bankName;

    private String bankLocation;

    private String emergencyContact;

    private String emergencyPhone;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;

    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;

    private String avatar;

    private String employeeId;


}
