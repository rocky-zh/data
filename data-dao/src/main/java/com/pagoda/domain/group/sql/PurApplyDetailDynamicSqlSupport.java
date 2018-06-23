package com.pagoda.domain.group.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.group.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * pur_apply_detail实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class PurApplyDetailDynamicSqlSupport {

  public static PurApplyDetailTable purApplyDetailTable = new PurApplyDetailTable();
  public static SqlColumn<Long> id = purApplyDetailTable.id;
  public static SqlColumn<Long> deleted = purApplyDetailTable.deleted;
  public static SqlColumn<Date> createdAt = purApplyDetailTable.createdAt;
  public static SqlColumn<String> creatorCode = purApplyDetailTable.creatorCode;
  public static SqlColumn<String> creatorName = purApplyDetailTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = purApplyDetailTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = purApplyDetailTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = purApplyDetailTable.modifierCode;
  public static SqlColumn<String> modifierName = purApplyDetailTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = purApplyDetailTable.modifierOrgCode;
  public static SqlColumn<Integer> version = purApplyDetailTable.version;
  public static SqlColumn<Long> applyId = purApplyDetailTable.applyId;
  public static SqlColumn<java.math.BigDecimal> applyPrice = purApplyDetailTable.applyPrice;
  public static SqlColumn<Integer> applyQty = purApplyDetailTable.applyQty;
  public static SqlColumn<String> basUnitCode = purApplyDetailTable.basUnitCode;
  public static SqlColumn<Long> basUnitId = purApplyDetailTable.basUnitId;
  public static SqlColumn<String> basUnitName = purApplyDetailTable.basUnitName;
  public static SqlColumn<Double> calCusOrderQty = purApplyDetailTable.calCusOrderQty;
  public static SqlColumn<Double> calCusSalQty = purApplyDetailTable.calCusSalQty;
  public static SqlColumn<Double> calInvQty = purApplyDetailTable.calInvQty;
  public static SqlColumn<Double> calOnWayQty = purApplyDetailTable.calOnWayQty;
  public static SqlColumn<Double> calOuterFerQty = purApplyDetailTable.calOuterFerQty;
  public static SqlColumn<Double> calPurRate = purApplyDetailTable.calPurRate;
  public static SqlColumn<Double> calReplenishmentQty = purApplyDetailTable.calReplenishmentQty;
  public static SqlColumn<Double> calStockUpQty = purApplyDetailTable.calStockUpQty;
  public static SqlColumn<Integer> confirmQty = purApplyDetailTable.confirmQty;
  public static SqlColumn<Integer> dealPurQty = purApplyDetailTable.dealPurQty;
  public static SqlColumn<String> dealSalOrgId = purApplyDetailTable.dealSalOrgId;
  public static SqlColumn<Integer> dealSalQty = purApplyDetailTable.dealSalQty;
  public static SqlColumn<Integer> dealStatus = purApplyDetailTable.dealStatus;
  public static SqlColumn<Integer> delId = purApplyDetailTable.delId;
  public static SqlColumn<Integer> goodsLevel = purApplyDetailTable.goodsLevel;
  public static SqlColumn<String> goodsOrion = purApplyDetailTable.goodsOrion;
  public static SqlColumn<java.math.BigDecimal> invPrice = purApplyDetailTable.invPrice;
  public static SqlColumn<String> purUnitCode = purApplyDetailTable.purUnitCode;
  public static SqlColumn<Long> purUnitId = purApplyDetailTable.purUnitId;
  public static SqlColumn<String> purUnitName = purApplyDetailTable.purUnitName;
  public static SqlColumn<Double> purUnitRate = purApplyDetailTable.purUnitRate;
  public static SqlColumn<Integer> requestQty = purApplyDetailTable.requestQty;

  public static final class PurApplyDetailTable extends SqlTable {
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

    public final SqlColumn<Long> applyId = column("apply_id", JDBCType.BIGINT);
    public final SqlColumn<java.math.BigDecimal> applyPrice =
        column("apply_price", JDBCType.DECIMAL);
    public final SqlColumn<Integer> applyQty = column("apply_qty", JDBCType.INTEGER);
    public final SqlColumn<String> basUnitCode = column("bas_unit_code", JDBCType.VARCHAR);
    public final SqlColumn<Long> basUnitId = column("bas_unit_id", JDBCType.BIGINT);
    public final SqlColumn<String> basUnitName = column("bas_unit_name", JDBCType.VARCHAR);
    public final SqlColumn<Double> calCusOrderQty = column("cal_cus_order_qty", JDBCType.DOUBLE);
    public final SqlColumn<Double> calCusSalQty = column("cal_cus_sal_qty", JDBCType.DOUBLE);
    public final SqlColumn<Double> calInvQty = column("cal_inv_qty", JDBCType.DOUBLE);
    public final SqlColumn<Double> calOnWayQty = column("cal_on_way_qty", JDBCType.DOUBLE);
    public final SqlColumn<Double> calOuterFerQty = column("cal_outer_fer_qty", JDBCType.DOUBLE);
    public final SqlColumn<Double> calPurRate = column("cal_pur_rate", JDBCType.DOUBLE);
    public final SqlColumn<Double> calReplenishmentQty =
        column("cal_replenishment_qty", JDBCType.DOUBLE);
    public final SqlColumn<Double> calStockUpQty = column("cal_stock_up_qty", JDBCType.DOUBLE);
    public final SqlColumn<Integer> confirmQty = column("confirm_qty", JDBCType.INTEGER);
    public final SqlColumn<Integer> dealPurQty = column("deal_pur_qty", JDBCType.INTEGER);
    public final SqlColumn<String> dealSalOrgId = column("deal_sal_org_id", JDBCType.VARCHAR);
    public final SqlColumn<Integer> dealSalQty = column("deal_sal_qty", JDBCType.INTEGER);
    public final SqlColumn<Integer> dealStatus = column("deal_status", JDBCType.INTEGER);
    public final SqlColumn<Integer> delId = column("del_id", JDBCType.INTEGER);
    public final SqlColumn<Integer> goodsLevel = column("goods_level", JDBCType.INTEGER);
    public final SqlColumn<String> goodsOrion = column("goods_orion", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> invPrice = column("inv_price", JDBCType.DECIMAL);
    public final SqlColumn<String> purUnitCode = column("pur_unit_code", JDBCType.VARCHAR);
    public final SqlColumn<Long> purUnitId = column("pur_unit_id", JDBCType.BIGINT);
    public final SqlColumn<String> purUnitName = column("pur_unit_name", JDBCType.VARCHAR);
    public final SqlColumn<Double> purUnitRate = column("pur_unit_rate", JDBCType.DOUBLE);
    public final SqlColumn<Integer> requestQty = column("request_qty", JDBCType.INTEGER);

    public PurApplyDetailTable() {
      super("PurApplyDetail");
    }
  }
}
