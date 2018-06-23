package com.pagoda.domain.group;

import com.pagoda.platform.jms.annotation.*;
import com.pagoda.platform.jms.hibernate.SnowflakeGenerator;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.group.*;

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
 * sal_consign_detail实体树形闭包扩展表定义
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "`sal_consign_detail_tree`")
@org.hibernate.annotations.Table(
  appliesTo = "`sal_consign_detail_tree`",
  comment = "sal_consign_detail 树形闭包扩展表"
)
@EntityListeners({AuditingEntityListener.class, PagodaEntityListener.class})
public class SalConsignDetailTree implements Serializable {
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

  public SalConsignDetailTree() {}

  public SalConsignDetailTree(Long pid, Long cid, Long distance, Long catId, Long entId) {
    this.pid = pid;
    this.cid = cid;
    this.distance = distance;
    this.catId = catId;
    this.entId = entId;
  }
}
