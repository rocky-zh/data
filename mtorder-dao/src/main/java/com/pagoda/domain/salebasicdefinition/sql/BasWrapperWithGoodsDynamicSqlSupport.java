package com.pagoda.domain.salebasicdefinition.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.salebasicdefinition.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 单品包装物带出清单实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasWrapperWithGoodsDynamicSqlSupport {

  public static BasWrapperWithGoodsTable basWrapperWithGoodsTable = new BasWrapperWithGoodsTable();
  public static SqlColumn<Long> id = basWrapperWithGoodsTable.id;
  public static SqlColumn<Long> deleted = basWrapperWithGoodsTable.deleted;
  public static SqlColumn<Date> createdAt = basWrapperWithGoodsTable.createdAt;
  public static SqlColumn<String> creatorCode = basWrapperWithGoodsTable.creatorCode;
  public static SqlColumn<String> creatorName = basWrapperWithGoodsTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basWrapperWithGoodsTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basWrapperWithGoodsTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basWrapperWithGoodsTable.modifierCode;
  public static SqlColumn<String> modifierName = basWrapperWithGoodsTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basWrapperWithGoodsTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basWrapperWithGoodsTable.version;
  public static SqlColumn<Long> orgOrgId = basWrapperWithGoodsTable.orgOrgId;
  public static SqlColumn<String> orgOrgCode = basWrapperWithGoodsTable.orgOrgCode;
  public static SqlColumn<String> orgOrgName = basWrapperWithGoodsTable.orgOrgName;
  public static SqlColumn<Long> mainGoodsId = basWrapperWithGoodsTable.mainGoodsId;
  public static SqlColumn<String> mainGoodsCode = basWrapperWithGoodsTable.mainGoodsCode;
  public static SqlColumn<String> mainGoodsName = basWrapperWithGoodsTable.mainGoodsName;
  public static SqlColumn<Long> mainUnitId = basWrapperWithGoodsTable.mainUnitId;
  public static SqlColumn<String> mainUnitName = basWrapperWithGoodsTable.mainUnitName;
  public static SqlColumn<java.math.BigDecimal> mainCardinal =
      basWrapperWithGoodsTable.mainCardinal;
  public static SqlColumn<Long> wrapGoodsId = basWrapperWithGoodsTable.wrapGoodsId;
  public static SqlColumn<String> wrapGoodsCode = basWrapperWithGoodsTable.wrapGoodsCode;
  public static SqlColumn<String> wrapGoodsName = basWrapperWithGoodsTable.wrapGoodsName;
  public static SqlColumn<Long> wrapUnitId = basWrapperWithGoodsTable.wrapUnitId;
  public static SqlColumn<String> wrapUnitName = basWrapperWithGoodsTable.wrapUnitName;
  public static SqlColumn<java.math.BigDecimal> wrapCardinal =
      basWrapperWithGoodsTable.wrapCardinal;
  public static SqlColumn<Integer> isRound = basWrapperWithGoodsTable.isRound;
  public static SqlColumn<Integer> isEnabled = basWrapperWithGoodsTable.isEnabled;

  public static final class BasWrapperWithGoodsTable extends SqlTable {
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

    public final SqlColumn<Long> orgOrgId = column("org_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> orgOrgCode = column("org_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> orgOrgName = column("org_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> mainGoodsId = column("main_goods_id", JDBCType.BIGINT);
    public final SqlColumn<String> mainGoodsCode = column("main_goods_code", JDBCType.VARCHAR);
    public final SqlColumn<String> mainGoodsName = column("main_goods_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> mainUnitId = column("main_unit_id", JDBCType.BIGINT);
    public final SqlColumn<String> mainUnitName = column("main_unit_name", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> mainCardinal =
        column("main_cardinal", JDBCType.DECIMAL);
    public final SqlColumn<Long> wrapGoodsId = column("wrap_goods_id", JDBCType.BIGINT);
    public final SqlColumn<String> wrapGoodsCode = column("wrap_goods_code", JDBCType.VARCHAR);
    public final SqlColumn<String> wrapGoodsName = column("wrap_goods_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> wrapUnitId = column("wrap_unit_id", JDBCType.BIGINT);
    public final SqlColumn<String> wrapUnitName = column("wrap_unit_name", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> wrapCardinal =
        column("wrap_cardinal", JDBCType.DECIMAL);
    public final SqlColumn<Integer> isRound = column("is_round", JDBCType.INTEGER);
    public final SqlColumn<Integer> isEnabled = column("is_enabled", JDBCType.INTEGER);

    public BasWrapperWithGoodsTable() {
      super("BasWrapperWithGoods");
    }
  }
}
