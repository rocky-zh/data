package com.pagoda.domain.purorder.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.purorder.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 采购订单明细表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class PurOrderDetailDynamicSqlSupport {

  public static PurOrderDetailTable purOrderDetailTable = new PurOrderDetailTable();
  public static SqlColumn<Long> id = purOrderDetailTable.id;
  public static SqlColumn<Long> deleted = purOrderDetailTable.deleted;
  public static SqlColumn<Date> createdAt = purOrderDetailTable.createdAt;
  public static SqlColumn<String> creatorCode = purOrderDetailTable.creatorCode;
  public static SqlColumn<String> creatorName = purOrderDetailTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = purOrderDetailTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = purOrderDetailTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = purOrderDetailTable.modifierCode;
  public static SqlColumn<String> modifierName = purOrderDetailTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = purOrderDetailTable.modifierOrgCode;
  public static SqlColumn<Integer> version = purOrderDetailTable.version;
  public static SqlColumn<Long> recOrgId = purOrderDetailTable.recOrgId;
  public static SqlColumn<String> recOrgCode = purOrderDetailTable.recOrgCode;
  public static SqlColumn<String> recOrgName = purOrderDetailTable.recOrgName;
  public static SqlColumn<Integer> isPrePrice = purOrderDetailTable.isPrePrice;
  public static SqlColumn<java.math.BigDecimal> purQty = purOrderDetailTable.purQty;
  public static SqlColumn<Integer> discountType = purOrderDetailTable.discountType;
  public static SqlColumn<Integer> isRec = purOrderDetailTable.isRec;
  public static SqlColumn<java.math.BigDecimal> recQty = purOrderDetailTable.recQty;
  public static SqlColumn<Integer> isRecInv = purOrderDetailTable.isRecInv;
  public static SqlColumn<Integer> billStatus = purOrderDetailTable.billStatus;
  public static SqlColumn<java.math.BigDecimal> billQty = purOrderDetailTable.billQty;
  public static SqlColumn<Long> orderId = purOrderDetailTable.orderId;
  public static SqlColumn<String> orderSeqno = purOrderDetailTable.orderSeqno;
  public static SqlColumn<Long> entId = purOrderDetailTable.entId;
  public static SqlColumn<Long> goodsId = purOrderDetailTable.goodsId;
  public static SqlColumn<String> goodsCode = purOrderDetailTable.goodsCode;
  public static SqlColumn<String> goodsName = purOrderDetailTable.goodsName;
  public static SqlColumn<String> goodsSpec = purOrderDetailTable.goodsSpec;
  public static SqlColumn<Integer> goodsLevel = purOrderDetailTable.goodsLevel;
  public static SqlColumn<String> goodsOrion = purOrderDetailTable.goodsOrion;
  public static SqlColumn<java.math.BigDecimal> applyQty = purOrderDetailTable.applyQty;
  public static SqlColumn<Long> purUnitId = purOrderDetailTable.purUnitId;
  public static SqlColumn<String> purUnitCode = purOrderDetailTable.purUnitCode;
  public static SqlColumn<String> purUnitName = purOrderDetailTable.purUnitName;
  public static SqlColumn<Long> basUnitId = purOrderDetailTable.basUnitId;
  public static SqlColumn<String> basUnitCode = purOrderDetailTable.basUnitCode;
  public static SqlColumn<String> basUnitName = purOrderDetailTable.basUnitName;
  public static SqlColumn<java.math.BigDecimal> purUnitRate = purOrderDetailTable.purUnitRate;
  public static SqlColumn<Long> arrOrgId = purOrderDetailTable.arrOrgId;
  public static SqlColumn<String> arrOrgCode = purOrderDetailTable.arrOrgCode;
  public static SqlColumn<String> arrOrgName = purOrderDetailTable.arrOrgName;
  public static SqlColumn<Integer> sourceType = purOrderDetailTable.sourceType;
  public static SqlColumn<java.math.BigDecimal> requestQty = purOrderDetailTable.requestQty;
  public static SqlColumn<java.util.Date> planRecDate = purOrderDetailTable.planRecDate;
  public static SqlColumn<java.math.BigDecimal> purPrice = purOrderDetailTable.purPrice;
  public static SqlColumn<java.math.BigDecimal> taxRate = purOrderDetailTable.taxRate;
  public static SqlColumn<java.math.BigDecimal> discountAmt = purOrderDetailTable.discountAmt;
  public static SqlColumn<Integer> isReturn = purOrderDetailTable.isReturn;
  public static SqlColumn<java.math.BigDecimal> returnQty = purOrderDetailTable.returnQty;
  public static SqlColumn<Long> applyId = purOrderDetailTable.applyId;
  public static SqlColumn<String> applySeqno = purOrderDetailTable.applySeqno;
  public static SqlColumn<Long> venOrgId = purOrderDetailTable.venOrgId;
  public static SqlColumn<String> venOrgCode = purOrderDetailTable.venOrgCode;
  public static SqlColumn<String> venOrgName = purOrderDetailTable.venOrgName;
  public static SqlColumn<String> remark = purOrderDetailTable.remark;
  public static SqlColumn<java.math.BigDecimal> stockinQty = purOrderDetailTable.stockinQty;

  public static final class PurOrderDetailTable extends SqlTable {
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

    public final SqlColumn<Long> recOrgId = column("rec_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> recOrgCode = column("rec_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> recOrgName = column("rec_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Integer> isPrePrice = column("is_pre_price", JDBCType.INTEGER);
    public final SqlColumn<java.math.BigDecimal> purQty = column("pur_qty", JDBCType.DECIMAL);
    public final SqlColumn<Integer> discountType = column("discount_type", JDBCType.INTEGER);
    public final SqlColumn<Integer> isRec = column("is_rec", JDBCType.INTEGER);
    public final SqlColumn<java.math.BigDecimal> recQty = column("rec_qty", JDBCType.DECIMAL);
    public final SqlColumn<Integer> isRecInv = column("is_rec_inv", JDBCType.INTEGER);
    public final SqlColumn<Integer> billStatus = column("bill_status", JDBCType.INTEGER);
    public final SqlColumn<java.math.BigDecimal> billQty = column("bill_qty", JDBCType.DECIMAL);
    public final SqlColumn<Long> orderId = column("order_id", JDBCType.BIGINT);
    public final SqlColumn<String> orderSeqno = column("order_seqno", JDBCType.VARCHAR);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);
    public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);
    public final SqlColumn<String> goodsCode = column("goods_code", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsName = column("goods_name", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsSpec = column("goods_spec", JDBCType.VARCHAR);
    public final SqlColumn<Integer> goodsLevel = column("goods_level", JDBCType.INTEGER);
    public final SqlColumn<String> goodsOrion = column("goods_orion", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> applyQty = column("apply_qty", JDBCType.DECIMAL);
    public final SqlColumn<Long> purUnitId = column("pur_unit_id", JDBCType.BIGINT);
    public final SqlColumn<String> purUnitCode = column("pur_unit_code", JDBCType.VARCHAR);
    public final SqlColumn<String> purUnitName = column("pur_unit_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> basUnitId = column("bas_unit_id", JDBCType.BIGINT);
    public final SqlColumn<String> basUnitCode = column("bas_unit_code", JDBCType.VARCHAR);
    public final SqlColumn<String> basUnitName = column("bas_unit_name", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> purUnitRate =
        column("pur_unit_rate", JDBCType.DECIMAL);
    public final SqlColumn<Long> arrOrgId = column("arr_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> arrOrgCode = column("arr_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> arrOrgName = column("arr_org_name", JDBCType.VARCHAR);
    public final SqlColumn<Integer> sourceType = column("source_type", JDBCType.INTEGER);
    public final SqlColumn<java.math.BigDecimal> requestQty =
        column("request_qty", JDBCType.DECIMAL);
    public final SqlColumn<java.util.Date> planRecDate = column("plan_rec_date", JDBCType.DATE);
    public final SqlColumn<java.math.BigDecimal> purPrice = column("pur_price", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> taxRate = column("tax_rate", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> discountAmt =
        column("discount_amt", JDBCType.DECIMAL);
    public final SqlColumn<Integer> isReturn = column("is_return", JDBCType.INTEGER);
    public final SqlColumn<java.math.BigDecimal> returnQty = column("return_qty", JDBCType.DECIMAL);
    public final SqlColumn<Long> applyId = column("apply_id", JDBCType.BIGINT);
    public final SqlColumn<String> applySeqno = column("apply_seqno", JDBCType.VARCHAR);
    public final SqlColumn<Long> venOrgId = column("ven_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> venOrgCode = column("ven_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> venOrgName = column("ven_org_name", JDBCType.VARCHAR);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> stockinQty =
        column("stockin_qty", JDBCType.DECIMAL);

    public PurOrderDetailTable() {
      super("PurOrderDetail");
    }
  }
}
