package org.hret.entity.personnel.assess;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.io.Serializable;

/**
 * 考核表(Assess)实体类
 *
 * @author makejava
 * @since 2024-03-18 20:47:23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Assess implements Serializable {
    private static final long serialVersionUID = -49452775890884099L;
/**
     * 考核id
     */
    @TableId(value = "assess_id", type = IdType.AUTO)
    private Integer assessId;
/**
     * 考核名称
     */
    private String assessName;
/**
     * 考核周期
     */
    private Date assessTime;
/**
     * 考核范围(0:技术部;1:产品部;2:销售部;3:市场部;4:人事部;)
     */
    private String assessRange;
/**
     * 负责人id
     */
    private Integer headId;
/**
     * 考核描述
     */
    private String assessDescription;
/**
     * 考核模板id
     */
    private Integer assessTemplateId;
/**
     * 被考核人可见(0:上级评语;1:上级评分;2:同时评分;3:同事评语;4:总分;5:等级;)
     */
    private String assessVisible;
/**
     * 绩效公布方式(0:负责人手动发布;1:结束自动发布;2:定时发布;)
     */
    private String performanceAnnouncement;
/**
     * 状态(0:全部;1:未开始;2:进行中;3:已完成;)
     */
    private String status;
/**
     * 考核计划类型(0:周期;1:非周期;)
     */
    private String assessType;


}

