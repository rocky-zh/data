package com.pagoda.domain.goods.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.goods.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 商品单位转换比实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasGoodsUnitDynamicSqlSupport {

  public static BasGoodsUnitTable basGoodsUnitTable = new BasGoodsUnitTable();
  public static SqlColumn<Long> id = basGoodsUnitTable.id;
  public static SqlColumn<Long> deleted = basGoodsUnitTable.deleted;
  public static SqlColumn<Date> createdAt = basGoodsUnitTable.createdAt;
  public static SqlColumn<String> creatorCode = basGoodsUnitTable.creatorCode;
  public static SqlColumn<String> creatorName = basGoodsUnitTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basGoodsUnitTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basGoodsUnitTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basGoodsUnitTable.modifierCode;
  public static SqlColumn<String> modifierName = basGoodsUnitTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basGoodsUnitTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basGoodsUnitTable.version;
  public static SqlColumn<Integer> isPermitDecimal = basGoodsUnitTable.isPermitDecimal;
  public static SqlColumn<Integer> isUsedPur = basGoodsUnitTable.isUsedPur;
  public static SqlColumn<Integer> isUsedSal = basGoodsUnitTable.isUsedSal;
  public static SqlColumn<Integer> isUsedRet = basGoodsUnitTable.isUsedRet;
  public static SqlColumn<Long> goodsId = basGoodsUnitTable.goodsId;
  public static SqlColumn<Long> unitId = basGoodsUnitTable.unitId;
  public static SqlColumn<String> unitCode = basGoodsUnitTable.unitCode;
  public static SqlColumn<String> unitName = basGoodsUnitTable.unitName;
  public static SqlColumn<Long> entId = basGoodsUnitTable.entId;
  public static SqlColumn<java.math.BigDecimal> unitRate = basGoodsUnitTable.unitRate;
  public static SqlColumn<Integer> sourceType = basGoodsUnitTable.sourceType;

  public static final class BasGoodsUnitTable extends SqlTable {
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

    public final SqlColumn<Integer> isPermitDecimal = column("is_permit_decimal", JDBCType.INTEGER);
    public final SqlColumn<Integer> isUsedPur = column("is_used_pur", JDBCType.INTEGER);
    public final SqlColumn<Integer> isUsedSal = column("is_used_sal", JDBCType.INTEGER);
    public final SqlColumn<Integer> isUsedRet = column("is_used_ret", JDBCType.INTEGER);
    public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);
    public final SqlColumn<Long> unitId = column("unit_id", JDBCType.BIGINT);
    public final SqlColumn<String> unitCode = column("unit_code", JDBCType.VARCHAR);
    public final SqlColumn<String> unitName = column("unit_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);
    public final SqlColumn<java.math.BigDecimal> unitRate = column("unit_rate", JDBCType.DECIMAL);
    public final SqlColumn<Integer> sourceType = column("source_type", JDBCType.INTEGER);

    public BasGoodsUnitTable() {
      super("BasGoodsUnit");
    }
  }
}
