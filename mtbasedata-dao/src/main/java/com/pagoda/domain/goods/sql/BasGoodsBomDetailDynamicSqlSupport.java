package com.pagoda.domain.goods.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.goods.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * BOM投入商品明细表 实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasGoodsBomDetailDynamicSqlSupport {

  public static BasGoodsBomDetailTable basGoodsBomDetailTable = new BasGoodsBomDetailTable();
  public static SqlColumn<Long> id = basGoodsBomDetailTable.id;
  public static SqlColumn<Long> deleted = basGoodsBomDetailTable.deleted;
  public static SqlColumn<Date> createdAt = basGoodsBomDetailTable.createdAt;
  public static SqlColumn<String> creatorCode = basGoodsBomDetailTable.creatorCode;
  public static SqlColumn<String> creatorName = basGoodsBomDetailTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basGoodsBomDetailTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basGoodsBomDetailTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basGoodsBomDetailTable.modifierCode;
  public static SqlColumn<String> modifierName = basGoodsBomDetailTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basGoodsBomDetailTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basGoodsBomDetailTable.version;
  public static SqlColumn<Long> outputGoodsId = basGoodsBomDetailTable.outputGoodsId;
  public static SqlColumn<String> outputGoodsName = basGoodsBomDetailTable.outputGoodsName;
  public static SqlColumn<Long> feeId = basGoodsBomDetailTable.feeId;
  public static SqlColumn<Long> inputGoodsId = basGoodsBomDetailTable.inputGoodsId;
  public static SqlColumn<String> inputGoodsName = basGoodsBomDetailTable.inputGoodsName;
  public static SqlColumn<java.math.BigDecimal> inputGoodsQty =
      basGoodsBomDetailTable.inputGoodsQty;
  public static SqlColumn<Long> outDepotId = basGoodsBomDetailTable.outDepotId;
  public static SqlColumn<String> outDepotName = basGoodsBomDetailTable.outDepotName;
  public static SqlColumn<String> feeName = basGoodsBomDetailTable.feeName;
  public static SqlColumn<java.math.BigDecimal> feeAmt = basGoodsBomDetailTable.feeAmt;
  public static SqlColumn<Long> unitId = basGoodsBomDetailTable.unitId;
  public static SqlColumn<String> unitName = basGoodsBomDetailTable.unitName;
  public static SqlColumn<Integer> isEnabled = basGoodsBomDetailTable.isEnabled;
  public static SqlColumn<Integer> isDefault = basGoodsBomDetailTable.isDefault;
  public static SqlColumn<Integer> rankNum = basGoodsBomDetailTable.rankNum;
  public static SqlColumn<String> remark = basGoodsBomDetailTable.remark;
  public static SqlColumn<Long> entId = basGoodsBomDetailTable.entId;

  public static final class BasGoodsBomDetailTable extends SqlTable {
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

    public final SqlColumn<Long> outputGoodsId = column("output_goods_id", JDBCType.BIGINT);
    public final SqlColumn<String> outputGoodsName = column("output_goods_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> feeId = column("fee_id", JDBCType.BIGINT);
    public final SqlColumn<Long> inputGoodsId = column("input_goods_id", JDBCType.BIGINT);
    public final SqlColumn<String> inputGoodsName = column("input_goods_name", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> inputGoodsQty =
        column("input_goods_qty", JDBCType.DECIMAL);
    public final SqlColumn<Long> outDepotId = column("out_depot_id", JDBCType.BIGINT);
    public final SqlColumn<String> outDepotName = column("out_depot_name", JDBCType.VARCHAR);
    public final SqlColumn<String> feeName = column("fee_name", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> feeAmt = column("fee_amt", JDBCType.DECIMAL);
    public final SqlColumn<Long> unitId = column("unit_id", JDBCType.BIGINT);
    public final SqlColumn<String> unitName = column("unit_name", JDBCType.VARCHAR);
    public final SqlColumn<Integer> isEnabled = column("is_enabled", JDBCType.INTEGER);
    public final SqlColumn<Integer> isDefault = column("is_default", JDBCType.INTEGER);
    public final SqlColumn<Integer> rankNum = column("rank_num", JDBCType.INTEGER);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);

    public BasGoodsBomDetailTable() {
      super("BasGoodsBomDetail");
    }
  }
}
