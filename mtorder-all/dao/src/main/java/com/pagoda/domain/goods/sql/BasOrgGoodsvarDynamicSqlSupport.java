package com.pagoda.domain.goods.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.goods.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 机构销售商品定义实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasOrgGoodsvarDynamicSqlSupport {

  public static BasOrgGoodsvarTable basOrgGoodsvarTable = new BasOrgGoodsvarTable();
  public static SqlColumn<Long> id = basOrgGoodsvarTable.id;
  public static SqlColumn<Long> deleted = basOrgGoodsvarTable.deleted;
  public static SqlColumn<Date> createdAt = basOrgGoodsvarTable.createdAt;
  public static SqlColumn<String> creatorCode = basOrgGoodsvarTable.creatorCode;
  public static SqlColumn<String> creatorName = basOrgGoodsvarTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basOrgGoodsvarTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basOrgGoodsvarTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basOrgGoodsvarTable.modifierCode;
  public static SqlColumn<String> modifierName = basOrgGoodsvarTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basOrgGoodsvarTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basOrgGoodsvarTable.version;
  public static SqlColumn<java.math.BigDecimal> badGoodsRate = basOrgGoodsvarTable.badGoodsRate;
  public static SqlColumn<String> prodArea = basOrgGoodsvarTable.prodArea;
  public static SqlColumn<String> qualSituDesc = basOrgGoodsvarTable.qualSituDesc;
  public static SqlColumn<String> supplyStateDesc = basOrgGoodsvarTable.supplyStateDesc;
  public static SqlColumn<String> supplyTrendDesc = basOrgGoodsvarTable.supplyTrendDesc;
  public static SqlColumn<Integer> isMustSale = basOrgGoodsvarTable.isMustSale;
  public static SqlColumn<String> mustSaleDesc = basOrgGoodsvarTable.mustSaleDesc;
  public static SqlColumn<String> difference = basOrgGoodsvarTable.difference;
  public static SqlColumn<String> goodsWrapDesc = basOrgGoodsvarTable.goodsWrapDesc;
  public static SqlColumn<String> goodsEva = basOrgGoodsvarTable.goodsEva;
  public static SqlColumn<String> techDesc = basOrgGoodsvarTable.techDesc;
  public static SqlColumn<Integer> isBEnabledC = basOrgGoodsvarTable.isBEnabledC;
  public static SqlColumn<Integer> isCEnabledA = basOrgGoodsvarTable.isCEnabledA;
  public static SqlColumn<Integer> isCEnabledN = basOrgGoodsvarTable.isCEnabledN;
  public static SqlColumn<Integer> isCEnabledM = basOrgGoodsvarTable.isCEnabledM;
  public static SqlColumn<Integer> isCEnabledO = basOrgGoodsvarTable.isCEnabledO;
  public static SqlColumn<Integer> isCEnabledP = basOrgGoodsvarTable.isCEnabledP;
  public static SqlColumn<Integer> isCEnabledC = basOrgGoodsvarTable.isCEnabledC;
  public static SqlColumn<Integer> isCEnabledE = basOrgGoodsvarTable.isCEnabledE;
  public static SqlColumn<Integer> isCEnabledF = basOrgGoodsvarTable.isCEnabledF;
  public static SqlColumn<Long> entId = basOrgGoodsvarTable.entId;
  public static SqlColumn<Long> orgId = basOrgGoodsvarTable.orgId;
  public static SqlColumn<Long> goodsVarId = basOrgGoodsvarTable.goodsVarId;
  public static SqlColumn<Long> goodsId = basOrgGoodsvarTable.goodsId;
  public static SqlColumn<Long> unitId = basOrgGoodsvarTable.unitId;
  public static SqlColumn<String> unitCode = basOrgGoodsvarTable.unitCode;
  public static SqlColumn<String> unitName = basOrgGoodsvarTable.unitName;
  public static SqlColumn<java.math.BigDecimal> unitRate = basOrgGoodsvarTable.unitRate;
  public static SqlColumn<Integer> isSale = basOrgGoodsvarTable.isSale;
  public static SqlColumn<Integer> isReturn = basOrgGoodsvarTable.isReturn;
  public static SqlColumn<Integer> isStockInv = basOrgGoodsvarTable.isStockInv;
  public static SqlColumn<Integer> isRet = basOrgGoodsvarTable.isRet;

  public static final class BasOrgGoodsvarTable extends SqlTable {
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

    public final SqlColumn<java.math.BigDecimal> badGoodsRate =
        column("bad_goods_rate", JDBCType.DECIMAL);
    public final SqlColumn<String> prodArea = column("prod_area", JDBCType.VARCHAR);
    public final SqlColumn<String> qualSituDesc = column("qual_situ_desc", JDBCType.VARCHAR);
    public final SqlColumn<String> supplyStateDesc = column("supply_state_desc", JDBCType.VARCHAR);
    public final SqlColumn<String> supplyTrendDesc = column("supply_trend_desc", JDBCType.VARCHAR);
    public final SqlColumn<Integer> isMustSale = column("is_must_sale", JDBCType.INTEGER);
    public final SqlColumn<String> mustSaleDesc = column("must_sale_desc", JDBCType.VARCHAR);
    public final SqlColumn<String> difference = column("difference", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsWrapDesc = column("goods_wrap_desc", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsEva = column("goods_eva", JDBCType.VARCHAR);
    public final SqlColumn<String> techDesc = column("tech_desc", JDBCType.VARCHAR);
    public final SqlColumn<Integer> isBEnabledC = column("is_b_enabled_c", JDBCType.INTEGER);
    public final SqlColumn<Integer> isCEnabledA = column("is_c_enabled_a", JDBCType.INTEGER);
    public final SqlColumn<Integer> isCEnabledN = column("is_c_enabled_n", JDBCType.INTEGER);
    public final SqlColumn<Integer> isCEnabledM = column("is_c_enabled_m", JDBCType.INTEGER);
    public final SqlColumn<Integer> isCEnabledO = column("is_c_enabled_o", JDBCType.INTEGER);
    public final SqlColumn<Integer> isCEnabledP = column("is_c_enabled_p", JDBCType.INTEGER);
    public final SqlColumn<Integer> isCEnabledC = column("is_c_enabled_c", JDBCType.INTEGER);
    public final SqlColumn<Integer> isCEnabledE = column("is_c_enabled_e", JDBCType.INTEGER);
    public final SqlColumn<Integer> isCEnabledF = column("is_c_enabled_f", JDBCType.INTEGER);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);
    public final SqlColumn<Long> orgId = column("org_id", JDBCType.BIGINT);
    public final SqlColumn<Long> goodsVarId = column("goods_var_id", JDBCType.BIGINT);
    public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);
    public final SqlColumn<Long> unitId = column("unit_id", JDBCType.BIGINT);
    public final SqlColumn<String> unitCode = column("unit_code", JDBCType.VARCHAR);
    public final SqlColumn<String> unitName = column("unit_name", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> unitRate = column("unit_rate", JDBCType.DECIMAL);
    public final SqlColumn<Integer> isSale = column("is_sale", JDBCType.INTEGER);
    public final SqlColumn<Integer> isReturn = column("is_return", JDBCType.INTEGER);
    public final SqlColumn<Integer> isStockInv = column("is_stock_inv", JDBCType.INTEGER);
    public final SqlColumn<Integer> isRet = column("is_ret", JDBCType.INTEGER);

    public BasOrgGoodsvarTable() {
      super("BasOrgGoodsvar");
    }
  }
}
