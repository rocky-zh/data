package com.pagoda.domain.pridistribution.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.pridistribution.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 配送价格目录定义明细表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class PriceCatalogSalDetailDynamicSqlSupport {

  public static PriceCatalogSalDetailTable priceCatalogSalDetailTable =
      new PriceCatalogSalDetailTable();
  public static SqlColumn<Long> id = priceCatalogSalDetailTable.id;
  public static SqlColumn<Long> deleted = priceCatalogSalDetailTable.deleted;
  public static SqlColumn<Date> createdAt = priceCatalogSalDetailTable.createdAt;
  public static SqlColumn<String> creatorCode = priceCatalogSalDetailTable.creatorCode;
  public static SqlColumn<String> creatorName = priceCatalogSalDetailTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = priceCatalogSalDetailTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = priceCatalogSalDetailTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = priceCatalogSalDetailTable.modifierCode;
  public static SqlColumn<String> modifierName = priceCatalogSalDetailTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = priceCatalogSalDetailTable.modifierOrgCode;
  public static SqlColumn<Integer> version = priceCatalogSalDetailTable.version;
  public static SqlColumn<Long> priceCatId = priceCatalogSalDetailTable.priceCatId;
  public static SqlColumn<String> priceCatCode = priceCatalogSalDetailTable.priceCatCode;
  public static SqlColumn<String> priceCatName = priceCatalogSalDetailTable.priceCatName;
  public static SqlColumn<java.math.BigDecimal> salPrice = priceCatalogSalDetailTable.salPrice;
  public static SqlColumn<Long> entId = priceCatalogSalDetailTable.entId;
  public static SqlColumn<Long> goodsId = priceCatalogSalDetailTable.goodsId;
  public static SqlColumn<String> goodsCode = priceCatalogSalDetailTable.goodsCode;
  public static SqlColumn<String> goodsName = priceCatalogSalDetailTable.goodsName;
  public static SqlColumn<String> goodsSpec = priceCatalogSalDetailTable.goodsSpec;
  public static SqlColumn<Long> unitId = priceCatalogSalDetailTable.unitId;
  public static SqlColumn<String> unitCode = priceCatalogSalDetailTable.unitCode;
  public static SqlColumn<String> unitName = priceCatalogSalDetailTable.unitName;
  public static SqlColumn<java.math.BigDecimal> unitRate = priceCatalogSalDetailTable.unitRate;
  public static SqlColumn<java.math.BigDecimal> returnPrice =
      priceCatalogSalDetailTable.returnPrice;
  public static SqlColumn<String> remark = priceCatalogSalDetailTable.remark;

  public static final class PriceCatalogSalDetailTable extends SqlTable {
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

    public final SqlColumn<Long> priceCatId = column("price_cat_id", JDBCType.BIGINT);
    public final SqlColumn<String> priceCatCode = column("price_cat_code", JDBCType.VARCHAR);
    public final SqlColumn<String> priceCatName = column("price_cat_name", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> salPrice = column("sal_price", JDBCType.DECIMAL);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);
    public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);
    public final SqlColumn<String> goodsCode = column("goods_code", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsName = column("goods_name", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsSpec = column("goods_spec", JDBCType.VARCHAR);
    public final SqlColumn<Long> unitId = column("unit_id", JDBCType.BIGINT);
    public final SqlColumn<String> unitCode = column("unit_code", JDBCType.VARCHAR);
    public final SqlColumn<String> unitName = column("unit_name", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> unitRate = column("unit_rate", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> returnPrice =
        column("return_price", JDBCType.DECIMAL);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);

    public PriceCatalogSalDetailTable() {
      super("PriceCatalogSalDetail");
    }
  }
}
