package com.pagoda.domain.goods.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.goods.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 机构商品定义实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasOrgGoodsDynamicSqlSupport {

  public static BasOrgGoodsTable basOrgGoodsTable = new BasOrgGoodsTable();
  public static SqlColumn<Long> id = basOrgGoodsTable.id;
  public static SqlColumn<Long> deleted = basOrgGoodsTable.deleted;
  public static SqlColumn<Date> createdAt = basOrgGoodsTable.createdAt;
  public static SqlColumn<String> creatorCode = basOrgGoodsTable.creatorCode;
  public static SqlColumn<String> creatorName = basOrgGoodsTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basOrgGoodsTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basOrgGoodsTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basOrgGoodsTable.modifierCode;
  public static SqlColumn<String> modifierName = basOrgGoodsTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basOrgGoodsTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basOrgGoodsTable.version;
  public static SqlColumn<String> orgCode = basOrgGoodsTable.orgCode;
  public static SqlColumn<String> orgName = basOrgGoodsTable.orgName;
  public static SqlColumn<Integer> isOrgLot = basOrgGoodsTable.isOrgLot;
  public static SqlColumn<Integer> isPur = basOrgGoodsTable.isPur;
  public static SqlColumn<String> purRetOutDepotCode = basOrgGoodsTable.purRetOutDepotCode;
  public static SqlColumn<String> purRetOutDepotName = basOrgGoodsTable.purRetOutDepotName;
  public static SqlColumn<Long> purRetOutDepotId = basOrgGoodsTable.purRetOutDepotId;
  public static SqlColumn<Long> purRecInDepotId = basOrgGoodsTable.purRecInDepotId;
  public static SqlColumn<String> purRecInDepotCode = basOrgGoodsTable.purRecInDepotCode;
  public static SqlColumn<String> purRecInDepotName = basOrgGoodsTable.purRecInDepotName;
  public static SqlColumn<String> salConInDepotCode = basOrgGoodsTable.salConInDepotCode;
  public static SqlColumn<String> salConInDepotName = basOrgGoodsTable.salConInDepotName;
  public static SqlColumn<String> salRetOutDepotCode = basOrgGoodsTable.salRetOutDepotCode;
  public static SqlColumn<String> salRetOutDepotName = basOrgGoodsTable.salRetOutDepotName;
  public static SqlColumn<Integer> isDataDetail = basOrgGoodsTable.isDataDetail;
  public static SqlColumn<java.math.BigDecimal> batchQty = basOrgGoodsTable.batchQty;
  public static SqlColumn<Integer> batchPolicy = basOrgGoodsTable.batchPolicy;
  public static SqlColumn<Integer> isSale = basOrgGoodsTable.isSale;
  public static SqlColumn<Integer> isReturn = basOrgGoodsTable.isReturn;
  public static SqlColumn<Integer> isTrans = basOrgGoodsTable.isTrans;
  public static SqlColumn<java.math.BigDecimal> conCycle = basOrgGoodsTable.conCycle;
  public static SqlColumn<Integer> isStockInv = basOrgGoodsTable.isStockInv;
  public static SqlColumn<Integer> isRet = basOrgGoodsTable.isRet;
  public static SqlColumn<Integer> isMustRet = basOrgGoodsTable.isMustRet;
  public static SqlColumn<java.math.BigDecimal> purExcRatio = basOrgGoodsTable.purExcRatio;
  public static SqlColumn<Integer> isDefDepot = basOrgGoodsTable.isDefDepot;
  public static SqlColumn<Long> orgId = basOrgGoodsTable.orgId;
  public static SqlColumn<Long> goodsId = basOrgGoodsTable.goodsId;
  public static SqlColumn<String> goodsCode = basOrgGoodsTable.goodsCode;
  public static SqlColumn<String> goodsName = basOrgGoodsTable.goodsName;
  public static SqlColumn<Long> entId = basOrgGoodsTable.entId;
  public static SqlColumn<java.math.BigDecimal> taxRate = basOrgGoodsTable.taxRate;
  public static SqlColumn<Integer> isEnabled = basOrgGoodsTable.isEnabled;
  public static SqlColumn<Long> salConInDepotId = basOrgGoodsTable.salConInDepotId;
  public static SqlColumn<Long> salConOutDepotId = basOrgGoodsTable.salConOutDepotId;
  public static SqlColumn<String> salConOutDepotCode = basOrgGoodsTable.salConOutDepotCode;
  public static SqlColumn<String> salConOutDepotName = basOrgGoodsTable.salConOutDepotName;
  public static SqlColumn<Long> salRetInDepotId = basOrgGoodsTable.salRetInDepotId;
  public static SqlColumn<String> salRetInDepotCode = basOrgGoodsTable.salRetInDepotCode;
  public static SqlColumn<String> salRetInDepotName = basOrgGoodsTable.salRetInDepotName;
  public static SqlColumn<Long> salRetOutDepotId = basOrgGoodsTable.salRetOutDepotId;

  public static final class BasOrgGoodsTable extends SqlTable {
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

    public final SqlColumn<String> orgCode = column("org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> orgName = column("org_name", JDBCType.VARCHAR);
    public final SqlColumn<Integer> isOrgLot = column("is_org_lot", JDBCType.INTEGER);
    public final SqlColumn<Integer> isPur = column("is_pur", JDBCType.INTEGER);
    public final SqlColumn<String> purRetOutDepotCode =
        column("pur_ret_out_depot_code", JDBCType.VARCHAR);
    public final SqlColumn<String> purRetOutDepotName =
        column("pur_ret_out_depot_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> purRetOutDepotId = column("pur_ret_out_depot_id", JDBCType.BIGINT);
    public final SqlColumn<Long> purRecInDepotId = column("pur_rec_in_depot_id", JDBCType.BIGINT);
    public final SqlColumn<String> purRecInDepotCode =
        column("pur_rec_in_depot_code", JDBCType.VARCHAR);
    public final SqlColumn<String> purRecInDepotName =
        column("pur_rec_in_depot_name", JDBCType.VARCHAR);
    public final SqlColumn<String> salConInDepotCode =
        column("sal_con_in_depot_code", JDBCType.VARCHAR);
    public final SqlColumn<String> salConInDepotName =
        column("sal_con_in_depot_name", JDBCType.VARCHAR);
    public final SqlColumn<String> salRetOutDepotCode =
        column("sal_ret_out_depot_code", JDBCType.VARCHAR);
    public final SqlColumn<String> salRetOutDepotName =
        column("sal_ret_out_depot_name", JDBCType.VARCHAR);
    public final SqlColumn<Integer> isDataDetail = column("is_data_detail", JDBCType.INTEGER);
    public final SqlColumn<java.math.BigDecimal> batchQty = column("batch_qty", JDBCType.DECIMAL);
    public final SqlColumn<Integer> batchPolicy = column("batch_policy", JDBCType.INTEGER);
    public final SqlColumn<Integer> isSale = column("is_sale", JDBCType.INTEGER);
    public final SqlColumn<Integer> isReturn = column("is_return", JDBCType.INTEGER);
    public final SqlColumn<Integer> isTrans = column("is_trans", JDBCType.INTEGER);
    public final SqlColumn<java.math.BigDecimal> conCycle = column("con_cycle", JDBCType.DECIMAL);
    public final SqlColumn<Integer> isStockInv = column("is_stock_inv", JDBCType.INTEGER);
    public final SqlColumn<Integer> isRet = column("is_ret", JDBCType.INTEGER);
    public final SqlColumn<Integer> isMustRet = column("is_must_ret", JDBCType.INTEGER);
    public final SqlColumn<java.math.BigDecimal> purExcRatio =
        column("pur_exc_ratio", JDBCType.DECIMAL);
    public final SqlColumn<Integer> isDefDepot = column("is_def_depot", JDBCType.INTEGER);
    public final SqlColumn<Long> orgId = column("org_id", JDBCType.BIGINT);
    public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);
    public final SqlColumn<String> goodsCode = column("goods_code", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsName = column("goods_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);
    public final SqlColumn<java.math.BigDecimal> taxRate = column("tax_rate", JDBCType.DECIMAL);
    public final SqlColumn<Integer> isEnabled = column("is_enabled", JDBCType.INTEGER);
    public final SqlColumn<Long> salConInDepotId = column("sal_con_in_depot_id", JDBCType.BIGINT);
    public final SqlColumn<Long> salConOutDepotId = column("sal_con_out_depot_id", JDBCType.BIGINT);
    public final SqlColumn<String> salConOutDepotCode =
        column("sal_con_out_depot_code", JDBCType.VARCHAR);
    public final SqlColumn<String> salConOutDepotName =
        column("sal_con_out_depot_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> salRetInDepotId = column("sal_ret_in_depot_id", JDBCType.BIGINT);
    public final SqlColumn<String> salRetInDepotCode =
        column("sal_ret_in_depot_code", JDBCType.VARCHAR);
    public final SqlColumn<String> salRetInDepotName =
        column("sal_ret_in_depot_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> salRetOutDepotId = column("sal_ret_out_depot_id", JDBCType.BIGINT);

    public BasOrgGoodsTable() {
      super("BasOrgGoods");
    }
  }
}
