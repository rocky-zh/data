package com.pagoda.domain.purorgven.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.purorgven.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 供应商返利商品明细表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasVenRebateGoodsDetailDynamicSqlSupport {

  public static BasVenRebateGoodsDetailTable basVenRebateGoodsDetailTable =
      new BasVenRebateGoodsDetailTable();
  public static SqlColumn<Long> id = basVenRebateGoodsDetailTable.id;
  public static SqlColumn<Long> deleted = basVenRebateGoodsDetailTable.deleted;
  public static SqlColumn<Date> createdAt = basVenRebateGoodsDetailTable.createdAt;
  public static SqlColumn<String> creatorCode = basVenRebateGoodsDetailTable.creatorCode;
  public static SqlColumn<String> creatorName = basVenRebateGoodsDetailTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basVenRebateGoodsDetailTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basVenRebateGoodsDetailTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basVenRebateGoodsDetailTable.modifierCode;
  public static SqlColumn<String> modifierName = basVenRebateGoodsDetailTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basVenRebateGoodsDetailTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basVenRebateGoodsDetailTable.version;
  public static SqlColumn<Long> rebateId = basVenRebateGoodsDetailTable.rebateId;
  public static SqlColumn<String> rebateNo = basVenRebateGoodsDetailTable.rebateNo;
  public static SqlColumn<Long> entId = basVenRebateGoodsDetailTable.entId;
  public static SqlColumn<Long> goodsId = basVenRebateGoodsDetailTable.goodsId;
  public static SqlColumn<String> goodsCode = basVenRebateGoodsDetailTable.goodsCode;
  public static SqlColumn<String> goodsName = basVenRebateGoodsDetailTable.goodsName;
  public static SqlColumn<String> goodsSpec = basVenRebateGoodsDetailTable.goodsSpec;
  public static SqlColumn<Long> goodsClassId = basVenRebateGoodsDetailTable.goodsClassId;
  public static SqlColumn<String> goodsClassCode = basVenRebateGoodsDetailTable.goodsClassCode;
  public static SqlColumn<String> goodsClassName = basVenRebateGoodsDetailTable.goodsClassName;
  public static SqlColumn<Long> unitId = basVenRebateGoodsDetailTable.unitId;
  public static SqlColumn<String> unitCode = basVenRebateGoodsDetailTable.unitCode;
  public static SqlColumn<String> unitName = basVenRebateGoodsDetailTable.unitName;
  public static SqlColumn<java.util.Date> effectDate = basVenRebateGoodsDetailTable.effectDate;
  public static SqlColumn<java.util.Date> expiryDate = basVenRebateGoodsDetailTable.expiryDate;
  public static SqlColumn<Integer> status = basVenRebateGoodsDetailTable.status;
  public static SqlColumn<String> remark = basVenRebateGoodsDetailTable.remark;

  public static final class BasVenRebateGoodsDetailTable extends SqlTable {
    public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

    public final SqlColumn<Long> deleted = column("deleted", JDBCType.BIGINT);

    public final SqlColumn<Date> createdAt = column("created_at", JDBCType.DATE);
    public final SqlColumn<String> creatorCode = column("creator_code", JDBCType.VARCHAR);
    public final SqlColumn<String> creatorName = column("creator_name", JDBCType.VARCHAR);
    public final SqlColumn<String> creatorOrgCode = column("creator_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> lastModifiedAt = column("last_modified_at", JDBCType.DATE);
    public final SqlColumn<String> modifierName = column("modifier_name", JDBCType.VARCHAR);
    public final SqlColumn<String> modifierCode = column("modifier_code", JDBCType.VARCHAR);
    public final SqlColumn<String> modifierOrgCode = column("modifier_org_code", JDBCType.VARCHAR);
    public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

    public final SqlColumn<Long> rebateId = column("rebate_id", JDBCType.BIGINT);
    public final SqlColumn<String> rebateNo = column("rebate_no", JDBCType.VARCHAR);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);
    public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);
    public final SqlColumn<String> goodsCode = column("goods_code", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsName = column("goods_name", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsSpec = column("goods_spec", JDBCType.VARCHAR);
    public final SqlColumn<Long> goodsClassId = column("goods_class_id", JDBCType.BIGINT);
    public final SqlColumn<String> goodsClassCode = column("goods_class_code", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsClassName = column("goods_class_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> unitId = column("unit_id", JDBCType.BIGINT);
    public final SqlColumn<String> unitCode = column("unit_code", JDBCType.VARCHAR);
    public final SqlColumn<String> unitName = column("unit_name", JDBCType.VARCHAR);
    public final SqlColumn<java.util.Date> effectDate = column("effect_date", JDBCType.DATE);
    public final SqlColumn<java.util.Date> expiryDate = column("expiry_date", JDBCType.DATE);
    public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);

    public BasVenRebateGoodsDetailTable() {
      super("BasVenRebateGoodsDetail");
    }
  }
}
