package com.pagoda.domain.pridistribution.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.pridistribution.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 配送价调价单明细表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class PriceAdjustSalDetailDynamicSqlSupport {

  public static PriceAdjustSalDetailTable priceAdjustSalDetailTable =
      new PriceAdjustSalDetailTable();
  public static SqlColumn<Long> id = priceAdjustSalDetailTable.id;
  public static SqlColumn<Long> deleted = priceAdjustSalDetailTable.deleted;
  public static SqlColumn<Date> createdAt = priceAdjustSalDetailTable.createdAt;
  public static SqlColumn<String> creatorCode = priceAdjustSalDetailTable.creatorCode;
  public static SqlColumn<String> creatorName = priceAdjustSalDetailTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = priceAdjustSalDetailTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = priceAdjustSalDetailTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = priceAdjustSalDetailTable.modifierCode;
  public static SqlColumn<String> modifierName = priceAdjustSalDetailTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = priceAdjustSalDetailTable.modifierOrgCode;
  public static SqlColumn<Integer> version = priceAdjustSalDetailTable.version;
  public static SqlColumn<Long> adjustId = priceAdjustSalDetailTable.adjustId;
  public static SqlColumn<String> adjustSeqno = priceAdjustSalDetailTable.adjustSeqno;
  public static SqlColumn<Long> entId = priceAdjustSalDetailTable.entId;
  public static SqlColumn<Long> goodsId = priceAdjustSalDetailTable.goodsId;
  public static SqlColumn<String> goodsCode = priceAdjustSalDetailTable.goodsCode;
  public static SqlColumn<String> goodsName = priceAdjustSalDetailTable.goodsName;
  public static SqlColumn<String> goodsSpec = priceAdjustSalDetailTable.goodsSpec;
  public static SqlColumn<Long> goodsClassId = priceAdjustSalDetailTable.goodsClassId;
  public static SqlColumn<String> goodsClassCode = priceAdjustSalDetailTable.goodsClassCode;
  public static SqlColumn<String> goodsClassName = priceAdjustSalDetailTable.goodsClassName;
  public static SqlColumn<Long> unitId = priceAdjustSalDetailTable.unitId;
  public static SqlColumn<String> unitCode = priceAdjustSalDetailTable.unitCode;
  public static SqlColumn<String> unitName = priceAdjustSalDetailTable.unitName;
  public static SqlColumn<java.math.BigDecimal> unitRate = priceAdjustSalDetailTable.unitRate;
  public static SqlColumn<java.math.BigDecimal> salPrice = priceAdjustSalDetailTable.salPrice;
  public static SqlColumn<java.math.BigDecimal> returnPrice = priceAdjustSalDetailTable.returnPrice;
  public static SqlColumn<String> remark = priceAdjustSalDetailTable.remark;
  public static SqlColumn<String> venOrgName = priceAdjustSalDetailTable.venOrgName;
  public static SqlColumn<Integer> status = priceAdjustSalDetailTable.status;

  public static final class PriceAdjustSalDetailTable extends SqlTable {
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
    public final SqlColumn<java.math.BigDecimal> unitRate = column("unit_rate", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> salPrice = column("sal_price", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> returnPrice =
        column("return_price", JDBCType.DECIMAL);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);
    public final SqlColumn<String> venOrgName = column("ven_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

    public PriceAdjustSalDetailTable() {
      super("PriceAdjustSalDetail");
    }
  }
}
