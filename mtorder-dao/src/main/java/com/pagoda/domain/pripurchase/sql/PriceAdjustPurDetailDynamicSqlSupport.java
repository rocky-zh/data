package com.pagoda.domain.pripurchase.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.pripurchase.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 采购调价单明细实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class PriceAdjustPurDetailDynamicSqlSupport {

  public static PriceAdjustPurDetailTable priceAdjustPurDetailTable =
      new PriceAdjustPurDetailTable();
  public static SqlColumn<Long> id = priceAdjustPurDetailTable.id;
  public static SqlColumn<Long> deleted = priceAdjustPurDetailTable.deleted;
  public static SqlColumn<Date> createdAt = priceAdjustPurDetailTable.createdAt;
  public static SqlColumn<String> creatorCode = priceAdjustPurDetailTable.creatorCode;
  public static SqlColumn<String> creatorName = priceAdjustPurDetailTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = priceAdjustPurDetailTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = priceAdjustPurDetailTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = priceAdjustPurDetailTable.modifierCode;
  public static SqlColumn<String> modifierName = priceAdjustPurDetailTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = priceAdjustPurDetailTable.modifierOrgCode;
  public static SqlColumn<Integer> version = priceAdjustPurDetailTable.version;
  public static SqlColumn<Long> adjustId = priceAdjustPurDetailTable.adjustId;
  public static SqlColumn<String> adjustSeqno = priceAdjustPurDetailTable.adjustSeqno;
  public static SqlColumn<Long> entId = priceAdjustPurDetailTable.entId;
  public static SqlColumn<String> goodsCode = priceAdjustPurDetailTable.goodsCode;
  public static SqlColumn<String> goodsName = priceAdjustPurDetailTable.goodsName;
  public static SqlColumn<Long> goodsId = priceAdjustPurDetailTable.goodsId;
  public static SqlColumn<String> goodsSpec = priceAdjustPurDetailTable.goodsSpec;
  public static SqlColumn<Long> goodsClassId = priceAdjustPurDetailTable.goodsClassId;
  public static SqlColumn<String> goodsClassCode = priceAdjustPurDetailTable.goodsClassCode;
  public static SqlColumn<String> goodsClassName = priceAdjustPurDetailTable.goodsClassName;
  public static SqlColumn<Long> unitId = priceAdjustPurDetailTable.unitId;
  public static SqlColumn<String> unitCode = priceAdjustPurDetailTable.unitCode;
  public static SqlColumn<String> unitName = priceAdjustPurDetailTable.unitName;
  public static SqlColumn<java.math.BigDecimal> unitRate = priceAdjustPurDetailTable.unitRate;
  public static SqlColumn<java.math.BigDecimal> purPrice = priceAdjustPurDetailTable.purPrice;
  public static SqlColumn<String> remark = priceAdjustPurDetailTable.remark;

  public static final class PriceAdjustPurDetailTable extends SqlTable {
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

    public final SqlColumn<Long> adjustId = column("adjust_id", JDBCType.BIGINT);
    public final SqlColumn<String> adjustSeqno = column("adjust_seqno", JDBCType.VARCHAR);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);
    public final SqlColumn<String> goodsCode = column("goods_code", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsName = column("goods_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);
    public final SqlColumn<String> goodsSpec = column("goods_spec", JDBCType.VARCHAR);
    public final SqlColumn<Long> goodsClassId = column("goods_class_id", JDBCType.BIGINT);
    public final SqlColumn<String> goodsClassCode = column("goods_class_code", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsClassName = column("goods_class_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> unitId = column("unit_id", JDBCType.BIGINT);
    public final SqlColumn<String> unitCode = column("unit_code", JDBCType.VARCHAR);
    public final SqlColumn<String> unitName = column("unit_name", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> unitRate = column("unit_rate", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> purPrice = column("pur_price", JDBCType.DECIMAL);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);

    public PriceAdjustPurDetailTable() {
      super("PriceAdjustPurDetail");
    }
  }
}
