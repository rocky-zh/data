package com.pagoda.domain.cat;

import com.pagoda.platform.jms.annotation.*;
import com.pagoda.platform.jms.hibernate.SnowflakeGenerator;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.cat.*;

import lombok.Data;
import ma.glasnost.orika.*;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.hibernate.annotations.*;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 目录分类表:全系统多维度树形结构表[包含：机构，供应商，部门，客户，库房...等] 1-level： tab实体树形闭包扩展表定义
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "`bas_cat_class_tree`")
@org.hibernate.annotations.Table(
  appliesTo = "`bas_cat_class_tree`",
  comment = "目录分类表:全系统多维度树形结构表[包含：机构，供应商，部门，客户，库房...等]  1-level： tab 树形闭包扩展表"
)
@EntityListeners({AuditingEntityListener.class, PagodaEntityListener.class})
public class BasCatClassTree implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @FieldMeta(
    name = "id",
    nameCN = "主键id",
    type = "long",
    visible = false,
    canQuery = false,
    readOnly = true
  )
  private Long id;

  @FieldMeta(
    name = "pid",
    nameCN = "祖先节点id",
    type = "long",
    visible = false,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "pid", columnDefinition = "bigint default 0 COMMENT '祖先节点id'")
  private Long pid = 0L;

  @FieldMeta(
    name = "cid",
    nameCN = "子节点id",
    type = "long",
    visible = false,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "cid", columnDefinition = "bigint default 0 COMMENT '子节点id'")
  private Long cid = 0L;

  @FieldMeta(
    name = "distance",
    nameCN = "父子节点距离",
    type = "long",
    visible = false,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "distance", columnDefinition = "bigint default 0 COMMENT '父子节点距离'")
  private Long distance = 0L;

  @FieldMeta(
    name = "entId",
    nameCN = "企业id",
    type = "long",
    visible = false,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "ent_id", columnDefinition = "bigint default 0 COMMENT '企业id'")
  private Long entId = 0L;

  @FieldMeta(
    name = "catId",
    nameCN = "目录id",
    type = "long",
    visible = false,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "cat_id", columnDefinition = "bigint default 0 COMMENT '目录id'")
  private Long catId = 0L;

  public BasCatClassTree() {}

  public BasCatClassTree(Long pid, Long cid, Long distance, Long catId, Long entId) {
    this.pid = pid;
    this.cid = cid;
    this.distance = distance;
    this.catId = catId;
    this.entId = entId;
  }
}
