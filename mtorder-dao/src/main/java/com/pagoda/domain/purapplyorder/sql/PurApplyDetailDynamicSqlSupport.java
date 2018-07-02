package com.pagoda.domain.purapplyorder.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.purapplyorder.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 采购请购单明细表实体表定义
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
  public static SqlColumn<String> applySeqno = purApplyDetailTable.applySeqno;
  public static SqlColumn<String> goodsOrion = purApplyDetailTable.goodsOrion;
  public static SqlColumn<Long> purUnitId = purApplyDetailTable.purUnitId;
  public static SqlColumn<String> purUnitCode = purApplyDetailTable.purUnitCode;
  public static SqlColumn<String> purUnitName = purApplyDetailTable.purUnitName;
  public static SqlColumn<Long> basUnitId = purApplyDetailTable.basUnitId;
  public static SqlColumn<String> basUnitCode = purApplyDetailTable.basUnitCode;
  public static SqlColumn<String> basUnitName = purApplyDetailTable.basUnitName;
  public static SqlColumn<java.math.BigDecimal> purUnitRate = purApplyDetailTable.purUnitRate;
  public static SqlColumn<java.math.BigDecimal> requestQty = purApplyDetailTable.requestQty;
  public static SqlColumn<java.math.BigDecimal> applyQty = purApplyDetailTable.applyQty;
  public static SqlColumn<java.math.BigDecimal> confirmQty = purApplyDetailTable.confirmQty;
  public static SqlColumn<java.math.BigDecimal> invPrice = purApplyDetailTable.invPrice;
  public static SqlColumn<java.math.BigDecimal> dealPurQty = purApplyDetailTable.dealPurQty;
  public static SqlColumn<java.math.BigDecimal> dealSalQty = purApplyDetailTable.dealSalQty;
  public static SqlColumn<Integer> dealStatus = purApplyDetailTable.dealStatus;
  public static SqlColumn<Long> dealSalOrgId = purApplyDetailTable.dealSalOrgId;
  public static SqlColumn<java.math.BigDecimal> calCusOrderQty = purApplyDetailTable.calCusOrderQty;
  public static SqlColumn<java.math.BigDecimal> calOuterFerQty = purApplyDetailTable.calOuterFerQty;
  public static SqlColumn<java.math.BigDecimal> calCusSalQty = purApplyDetailTable.calCusSalQty;
  public static SqlColumn<java.math.BigDecimal> calInvQty = purApplyDetailTable.calInvQty;
  public static SqlColumn<java.math.BigDecimal> calOnWayQty = purApplyDetailTable.calOnWayQty;
  public static SqlColumn<java.math.BigDecimal> calStockUpQty = purApplyDetailTable.calStockUpQty;
  public static SqlColumn<java.math.BigDecimal> calReplenishmentQty =
      purApplyDetailTable.calReplenishmentQty;
  public static SqlColumn<Long> goodsId = purApplyDetailTable.goodsId;
  public static SqlColumn<String> goodsCode = purApplyDetailTable.goodsCode;
  public static SqlColumn<String> goodsName = purApplyDetailTable.goodsName;
  public static SqlColumn<String> goodsSpec = purApplyDetailTable.goodsSpec;
  public static SqlColumn<java.util.Date> planRecDate = purApplyDetailTable.planRecDate;
  public static SqlColumn<String> remark = purApplyDetailTable.remark;
  public static SqlColumn<java.math.BigDecimal> calPurRate = purApplyDetailTable.calPurRate;

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
    public final SqlColumn<String> applySeqno = column("apply_seqno", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsOrion = column("goods_orion", JDBCType.VARCHAR);
    public final SqlColumn<Long> purUnitId = column("pur_unit_id", JDBCType.BIGINT);
    public final SqlColumn<String> purUnitCode = column("pur_unit_code", JDBCType.VARCHAR);
    public final SqlColumn<String> purUnitName = column("pur_unit_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> basUnitId = column("bas_unit_id", JDBCType.BIGINT);
    public final SqlColumn<String> basUnitCode = column("bas_unit_code", JDBCType.VARCHAR);
    public final SqlColumn<String> basUnitName = column("bas_unit_name", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> purUnitRate =
        column("pur_unit_rate", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> requestQty =
        column("request_qty", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> applyQty = column("apply_qty", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> confirmQty =
        column("confirm_qty", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> invPrice = column("inv_price", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> dealPurQty =
        column("deal_pur_qty", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> dealSalQty =
        column("deal_sal_qty", JDBCType.DECIMAL);
    public final SqlColumn<Integer> dealStatus = column("deal_status", JDBCType.INTEGER);
    public final SqlColumn<Long> dealSalOrgId = column("deal_sal_org_id", JDBCType.BIGINT);
    public final SqlColumn<java.math.BigDecimal> calCusOrderQty =
        column("cal_cus_order_qty", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> calOuterFerQty =
        column("cal_outer_fer_qty", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> calCusSalQty =
        column("cal_cus_sal_qty", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> calInvQty =
        column("cal_inv_qty", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> calOnWayQty =
        column("cal_on_way_qty", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> calStockUpQty =
        column("cal_stock_up_qty", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> calReplenishmentQty =
        column("cal_replenishment_qty", JDBCType.DECIMAL);
    public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);
    public final SqlColumn<String> goodsCode = column("goods_code", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsName = column("goods_name", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsSpec = column("goods_spec", JDBCType.VARCHAR);
    public final SqlColumn<java.util.Date> planRecDate = column("plan_rec_date", JDBCType.DATE);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> calPurRate =
        column("cal_pur_rate", JDBCType.DECIMAL);

    public PurApplyDetailTable() {
      super("PurApplyDetail");
    }
  }
}
