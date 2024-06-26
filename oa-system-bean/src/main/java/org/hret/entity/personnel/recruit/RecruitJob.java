package org.hret.entity.personnel.recruit;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.*;
import org.hret.entity.utils.query.Page;

import java.io.Serial;
import java.io.Serializable;

/**
 * (SysJob)实体类
 *
 * @author makejava
 * @since 2024-03-13 09:19:12
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName("recruit_job")
@ApiModel("职位实体类")
public class RecruitJob extends Page implements Serializable {
    @Serial
    private static final long serialVersionUID = -17107097014328568L;
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    @Excel(name = "职位id",width = 20,isImportField = "true")
    private Integer jobId;
    /**
     * 职位名称
     */
    @Excel(name = "职位名称",width = 20,isImportField = "true")
    private String jobName;
    /**
     * 招聘人数
     */
    @Excel(name = "招聘人数", width = 20,isImportField = "true")
    private Integer jobNumber;
    /**
     * 招聘状态
     */
    @Excel(name = "招聘状态",width = 20,isImportField = "true")
    private String jobStatus;
    /**
     * 用人部门
     */
    @Excel(name = "用人部门", width = 20,isImportField = "true")
    private String jobDept;
    /**
     * 工作地点
     */
    @Excel(name = "工作地点",width = 20,isImportField = "true")
    private String jobAddress;
    /**
     * 详细地址
     */
    @Excel(name = "详细地址", width = 20,isImportField = "true")
    private String jobDetailedAddress;
    /**
     * 最低薪资
     */
    @Excel(name = "最低薪资",width = 20,isImportField = "true")
    private String jobMinPay;
    /**
     * 最高薪资
     */
    @Excel(name = "最高薪资", width = 20,isImportField = "true")
    private String jobMaxPay;
    /**
     * 薪
     */
    @Excel(name = "薪", width = 20,isImportField = "true")
    private String jobNumPay;
    /**
     * 学历要求
     */
    @Excel(name = "学历要求", width = 20,isImportField = "true")
    private String jobEducation;
    /**
     * 工作经验
     */
    @Excel(name = "工作经验", width = 20,isImportField = "true")
    private String jobExperience;
    /**
     * 专业
     */
    @Excel(name = "专业", width = 20,isImportField = "true")
    private String jobMajor;
    /**
     * 职位描述
     */
    @Excel(name = "职位描述", width = 20,isImportField = "true")
    private String jobDescribe;
    /**
     * 上传文件
     */
    @Excel(name = "上传文件", width = 20,isImportField = "true")
    private String jobFile;

    /**
     * 职位负责人
     */
    @Excel(name = "职位负责人",width = 20,isImportField = "true")
    private String jobPrincipal;

    /**
     * 职位性质
     */
    @Excel(name = "职位性质",width = 20,isImportField = "true")
    private String jobNature;
    /**
     * 发起时间
     */
    @Excel(name = "发起时间",width = 20,isImportField = "true")
    private String jobTime;
    /**
     * 计划开始时间
     */
    @Excel(name = "计划开始时间",width = 20,isImportField = "true")
    private String jobPostStartTime;
    /**
     * 计划结束时间
     */
    @Excel(name = "计划结束时间",width = 20,isImportField = "true")
    private String jobPostEndTime;

    /*8
    性别
     */
    @Excel(name = "性别",width = 20,isImportField = "true")
    private Integer jobSex;

    /**
     * 年龄
     */
    @Excel(name = "年龄",width = 20,isImportField = "true")
    private String jobAge;
    /**
     * 开始时间
     */
    @TableField(exist = false)
    private String jobStartTime;

    /**
     * 结束时间
     */
    @TableField(exist = false)
    private String jobEndTime;

}

