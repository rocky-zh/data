package com.pagoda.domain.goods.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.goods.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 生产工艺明细表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasGoodsProcessDetailDynamicSqlSupport {

  public static BasGoodsProcessDetailTable basGoodsProcessDetailTable =
      new BasGoodsProcessDetailTable();
  public static SqlColumn<Long> id = basGoodsProcessDetailTable.id;
  public static SqlColumn<Long> deleted = basGoodsProcessDetailTable.deleted;
  public static SqlColumn<Date> createdAt = basGoodsProcessDetailTable.createdAt;
  public static SqlColumn<String> creatorCode = basGoodsProcessDetailTable.creatorCode;
  public static SqlColumn<String> creatorName = basGoodsProcessDetailTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basGoodsProcessDetailTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basGoodsProcessDetailTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basGoodsProcessDetailTable.modifierCode;
  public static SqlColumn<String> modifierName = basGoodsProcessDetailTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basGoodsProcessDetailTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basGoodsProcessDetailTable.version;
  public static SqlColumn<Long> goodsProcId = basGoodsProcessDetailTable.goodsProcId;
  public static SqlColumn<String> goodsProcCode = basGoodsProcessDetailTable.goodsProcCode;
  public static SqlColumn<String> goodsProcName = basGoodsProcessDetailTable.goodsProcName;
  public static SqlColumn<String> feeCode = basGoodsProcessDetailTable.feeCode;
  public static SqlColumn<String> feeName = basGoodsProcessDetailTable.feeName;
  public static SqlColumn<java.math.BigDecimal> feeAmt = basGoodsProcessDetailTable.feeAmt;
  public static SqlColumn<String> remark = basGoodsProcessDetailTable.remark;
  public static SqlColumn<Integer> rankNum = basGoodsProcessDetailTable.rankNum;
  public static SqlColumn<Long> entId = basGoodsProcessDetailTable.entId;

  public static final class BasGoodsProcessDetailTable extends SqlTable {
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

    public final SqlColumn<Long> goodsProcId = column("goods_proc_id", JDBCType.BIGINT);
    public final SqlColumn<String> goodsProcCode = column("goods_proc_code", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsProcName = column("goods_proc_name", JDBCType.VARCHAR);
    public final SqlColumn<String> feeCode = column("fee_code", JDBCType.VARCHAR);
    public final SqlColumn<String> feeName = column("fee_name", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> feeAmt = column("fee_amt", JDBCType.DECIMAL);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);
    public final SqlColumn<Integer> rankNum = column("rank_num", JDBCType.INTEGER);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);

    public BasGoodsProcessDetailTable() {
      super("BasGoodsProcessDetail");
    }
  }
}
