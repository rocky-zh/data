package com.pagoda.test.domain.group.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.test.domain.group.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 商品定义实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasGoodsDynamicSqlSupport {

  public static BasGoodsTable basGoodsTable = new BasGoodsTable();
  public static SqlColumn<Long> id = basGoodsTable.id;
  public static SqlColumn<Long> deleted = basGoodsTable.deleted;
  public static SqlColumn<Date> createdAt = basGoodsTable.createdAt;
  public static SqlColumn<String> creatorCode = basGoodsTable.creatorCode;
  public static SqlColumn<String> creatorName = basGoodsTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basGoodsTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basGoodsTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basGoodsTable.modifierCode;
  public static SqlColumn<String> modifierName = basGoodsTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basGoodsTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basGoodsTable.version;
  public static SqlColumn<String> code = basGoodsTable.code;
  public static SqlColumn<String> name = basGoodsTable.name;
  public static SqlColumn<String> shortName = basGoodsTable.shortName;
  public static SqlColumn<String> traditName = basGoodsTable.traditName;
  public static SqlColumn<String> enName = basGoodsTable.enName;
  public static SqlColumn<Long> entId = basGoodsTable.entId;
  public static SqlColumn<String> goodsSpec = basGoodsTable.goodsSpec;
  public static SqlColumn<String> goodsOrigin = basGoodsTable.goodsOrigin;
  public static SqlColumn<Integer> goodsLevel = basGoodsTable.goodsLevel;
  public static SqlColumn<Integer> goodsType = basGoodsTable.goodsType;
  public static SqlColumn<String> searchWord = basGoodsTable.searchWord;
  public static SqlColumn<String> mnemWord = basGoodsTable.mnemWord;
  public static SqlColumn<Long> basUnitId = basGoodsTable.basUnitId;
  public static SqlColumn<String> basUnitCode = basGoodsTable.basUnitCode;
  public static SqlColumn<String> basUnitName = basGoodsTable.basUnitName;
  public static SqlColumn<Long> invUnitId = basGoodsTable.invUnitId;
  public static SqlColumn<String> invUnitName = basGoodsTable.invUnitName;
  public static SqlColumn<String> invUnitCode = basGoodsTable.invUnitCode;
  public static SqlColumn<java.math.BigDecimal> invRate = basGoodsTable.invRate;
  public static SqlColumn<Long> salUnitId = basGoodsTable.salUnitId;
  public static SqlColumn<String> salUnitCode = basGoodsTable.salUnitCode;
  public static SqlColumn<String> salUnitName = basGoodsTable.salUnitName;
  public static SqlColumn<java.math.BigDecimal> salRate = basGoodsTable.salRate;
  public static SqlColumn<Long> purUnitId = basGoodsTable.purUnitId;
  public static SqlColumn<String> purUnitCode = basGoodsTable.purUnitCode;
  public static SqlColumn<String> purUnitName = basGoodsTable.purUnitName;
  public static SqlColumn<java.math.BigDecimal> purRate = basGoodsTable.purRate;
  public static SqlColumn<Long> retUnitId = basGoodsTable.retUnitId;
  public static SqlColumn<String> retUnitCode = basGoodsTable.retUnitCode;
  public static SqlColumn<String> retUnitName = basGoodsTable.retUnitName;
  public static SqlColumn<java.math.BigDecimal> retRate = basGoodsTable.retRate;
  public static SqlColumn<java.math.BigDecimal> unitVolume = basGoodsTable.unitVolume;
  public static SqlColumn<java.math.BigDecimal> unitWeight = basGoodsTable.unitWeight;
  public static SqlColumn<String> barcode = basGoodsTable.barcode;
  public static SqlColumn<java.math.BigDecimal> taxRate = basGoodsTable.taxRate;
  public static SqlColumn<Integer> isEntLot = basGoodsTable.isEntLot;
  public static SqlColumn<Integer> shelfLifeType = basGoodsTable.shelfLifeType;
  public static SqlColumn<java.math.BigDecimal> shelfLifeQty = basGoodsTable.shelfLifeQty;
  public static SqlColumn<Integer> isEnabled = basGoodsTable.isEnabled;
  public static SqlColumn<Integer> isPur = basGoodsTable.isPur;
  public static SqlColumn<Integer> isSale = basGoodsTable.isSale;
  public static SqlColumn<Integer> isRet = basGoodsTable.isRet;

  public static final class BasGoodsTable extends SqlTable {
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

    public final SqlColumn<String> code = column("code", JDBCType.VARCHAR);
    public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);
    public final SqlColumn<String> shortName = column("short_name", JDBCType.VARCHAR);
    public final SqlColumn<String> traditName = column("tradit_name", JDBCType.VARCHAR);
    public final SqlColumn<String> enName = column("en_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> entId = column("ent_id", JDBCType.BIGINT);
    public final SqlColumn<String> goodsSpec = column("goods_spec", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsOrigin = column("goods_origin", JDBCType.VARCHAR);
    public final SqlColumn<Integer> goodsLevel = column("goods_level", JDBCType.INTEGER);
    public final SqlColumn<Integer> goodsType = column("goods_type", JDBCType.INTEGER);
    public final SqlColumn<String> searchWord = column("search_word", JDBCType.VARCHAR);
    public final SqlColumn<String> mnemWord = column("mnem_word", JDBCType.VARCHAR);
    public final SqlColumn<Long> basUnitId = column("bas_unit_id", JDBCType.BIGINT);
    public final SqlColumn<String> basUnitCode = column("bas_unit_code", JDBCType.VARCHAR);
    public final SqlColumn<String> basUnitName = column("bas_unit_name", JDBCType.VARCHAR);
    public final SqlColumn<Long> invUnitId = column("inv_unit_id", JDBCType.BIGINT);
    public final SqlColumn<String> invUnitName = column("inv_unit_name", JDBCType.VARCHAR);
    public final SqlColumn<String> invUnitCode = column("inv_unit_code", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> invRate = column("inv_rate", JDBCType.DECIMAL);
    public final SqlColumn<Long> salUnitId = column("sal_unit_id", JDBCType.BIGINT);
    public final SqlColumn<String> salUnitCode = column("sal_unit_code", JDBCType.VARCHAR);
    public final SqlColumn<String> salUnitName = column("sal_unit_name", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> salRate = column("sal_rate", JDBCType.DECIMAL);
    public final SqlColumn<Long> purUnitId = column("pur_unit_id", JDBCType.BIGINT);
    public final SqlColumn<String> purUnitCode = column("pur_unit_code", JDBCType.VARCHAR);
    public final SqlColumn<String> purUnitName = column("pur_unit_name", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> purRate = column("pur_rate", JDBCType.DECIMAL);
    public final SqlColumn<Long> retUnitId = column("ret_unit_id", JDBCType.BIGINT);
    public final SqlColumn<String> retUnitCode = column("ret_unit_code", JDBCType.VARCHAR);
    public final SqlColumn<String> retUnitName = column("ret_unit_name", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> retRate = column("ret_rate", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> unitVolume =
        column("unit_volume", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> unitWeight =
        column("unit_weight", JDBCType.DECIMAL);
    public final SqlColumn<String> barcode = column("barcode", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> taxRate = column("tax_rate", JDBCType.DECIMAL);
    public final SqlColumn<Integer> isEntLot = column("is_ent_lot", JDBCType.INTEGER);
    public final SqlColumn<Integer> shelfLifeType = column("shelf_life_type", JDBCType.INTEGER);
    public final SqlColumn<java.math.BigDecimal> shelfLifeQty =
        column("shelf_life_qty", JDBCType.DECIMAL);
    public final SqlColumn<Integer> isEnabled = column("is_enabled", JDBCType.INTEGER);
    public final SqlColumn<Integer> isPur = column("is_pur", JDBCType.INTEGER);
    public final SqlColumn<Integer> isSale = column("is_sale", JDBCType.INTEGER);
    public final SqlColumn<Integer> isRet = column("is_ret", JDBCType.INTEGER);

    public BasGoodsTable() {
      super("BasGoods");
    }
  }
}
