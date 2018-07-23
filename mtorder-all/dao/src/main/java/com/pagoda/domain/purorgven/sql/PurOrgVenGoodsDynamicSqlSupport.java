package com.pagoda.domain.purorgven.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.purorgven.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 供应商机构商品 实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class PurOrgVenGoodsDynamicSqlSupport {

  public static PurOrgVenGoodsTable purOrgVenGoodsTable = new PurOrgVenGoodsTable();
  public static SqlColumn<Long> id = purOrgVenGoodsTable.id;
  public static SqlColumn<Long> deleted = purOrgVenGoodsTable.deleted;
  public static SqlColumn<Date> createdAt = purOrgVenGoodsTable.createdAt;
  public static SqlColumn<String> creatorCode = purOrgVenGoodsTable.creatorCode;
  public static SqlColumn<String> creatorName = purOrgVenGoodsTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = purOrgVenGoodsTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = purOrgVenGoodsTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = purOrgVenGoodsTable.modifierCode;
  public static SqlColumn<String> modifierName = purOrgVenGoodsTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = purOrgVenGoodsTable.modifierOrgCode;
  public static SqlColumn<Integer> version = purOrgVenGoodsTable.version;
  public static SqlColumn<Long> venOrgId = purOrgVenGoodsTable.venOrgId;
  public static SqlColumn<String> venOrgCode = purOrgVenGoodsTable.venOrgCode;
  public static SqlColumn<String> venOrgName = purOrgVenGoodsTable.venOrgName;
  public static SqlColumn<Long> orgOrgId = purOrgVenGoodsTable.orgOrgId;
  public static SqlColumn<String> orgOrgCode = purOrgVenGoodsTable.orgOrgCode;
  public static SqlColumn<String> orgOrgName = purOrgVenGoodsTable.orgOrgName;
  public static SqlColumn<Long> goodsId = purOrgVenGoodsTable.goodsId;
  public static SqlColumn<String> goodsCode = purOrgVenGoodsTable.goodsCode;
  public static SqlColumn<String> goodsName = purOrgVenGoodsTable.goodsName;
  public static SqlColumn<String> goodsSpec = purOrgVenGoodsTable.goodsSpec;
  public static SqlColumn<String> goodsClassName = purOrgVenGoodsTable.goodsClassName;
  public static SqlColumn<String> basUnitName = purOrgVenGoodsTable.basUnitName;
  public static SqlColumn<Long> unitId = purOrgVenGoodsTable.unitId;
  public static SqlColumn<String> unitCode = purOrgVenGoodsTable.unitCode;
  public static SqlColumn<String> unitName = purOrgVenGoodsTable.unitName;
  public static SqlColumn<java.math.BigDecimal> unitRate = purOrgVenGoodsTable.unitRate;
  public static SqlColumn<java.math.BigDecimal> price = purOrgVenGoodsTable.price;
  public static SqlColumn<java.math.BigDecimal> billTaxRate = purOrgVenGoodsTable.billTaxRate;
  public static SqlColumn<java.math.BigDecimal> discountTaxRate =
      purOrgVenGoodsTable.discountTaxRate;
  public static SqlColumn<Integer> taxType = purOrgVenGoodsTable.taxType;
  public static SqlColumn<Integer> isDefault = purOrgVenGoodsTable.isDefault;
  public static SqlColumn<Integer> isEnabled = purOrgVenGoodsTable.isEnabled;
  public static SqlColumn<Integer> isAllowReturn = purOrgVenGoodsTable.isAllowReturn;
  public static SqlColumn<Long> purDepotId = purOrgVenGoodsTable.purDepotId;
  public static SqlColumn<Integer> isAllowOrder = purOrgVenGoodsTable.isAllowOrder;
  public static SqlColumn<Integer> isAllowRec = purOrgVenGoodsTable.isAllowRec;
  public static SqlColumn<Long> goodsClassId = purOrgVenGoodsTable.goodsClassId;
  public static SqlColumn<Long> basUnitId = purOrgVenGoodsTable.basUnitId;
  public static SqlColumn<Long> entId = purOrgVenGoodsTable.entId;

  public static final class PurOrgVenGoodsTable extends SqlTable {
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

    public final SqlColumn<Long> venOrgId = column("ven_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> venOrgCode = column("ven_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> venOrgName = column("ven_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> orgOrgId = column("org_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> orgOrgCode = column("org_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> orgOrgName = column("org_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);
    public final SqlColumn<String> goodsCode = column("goods_code", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsName = column("goods_name", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsSpec = column("goods_spec", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsClassName = column("goods_class_name", JDBCType.VARCHAR);
    public final SqlColumn<String> basUnitName = column("bas_unit_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> unitId = column("unit_id", JDBCType.BIGINT);
    public final SqlColumn<String> unitCode = column("unit_code", JDBCType.VARCHAR);
    public final SqlColumn<String> unitName = column("unit_name", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> unitRate = column("unit_rate", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> price = column("price", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> billTaxRate =
        column("bill_tax_rate", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> discountTaxRate =
        column("discount_tax_rate", JDBCType.DECIMAL);
    public final SqlColumn<Integer> taxType = column("tax_type", JDBCType.INTEGER);
    public final SqlColumn<Integer> isDefault = column("is_default", JDBCType.INTEGER);
    public final SqlColumn<Integer> isEnabled = column("is_enabled", JDBCType.INTEGER);
    public final SqlColumn<Integer> isAllowReturn = column("is_allow_return", JDBCType.INTEGER);
    public final SqlColumn<Long> purDepotId = column("pur_depot_id", JDBCType.BIGINT);
    public final SqlColumn<Integer> isAllowOrder = column("is_allow_order", JDBCType.INTEGER);
    public final SqlColumn<Integer> isAllowRec = column("is_allow_rec", JDBCType.INTEGER);
    public final SqlColumn<Long> goodsClassId = column("goods_class_id", JDBCType.BIGINT);
    public final SqlColumn<Long> basUnitId = column("bas_unit_id", JDBCType.BIGINT);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);

    public PurOrgVenGoodsTable() {
      super("PurOrgVenGoods");
    }
  }
}
