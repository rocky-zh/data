package com.pagoda.domain.goods.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.goods.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 商品分类(基本分类的一级分类)与代码规则关系表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasGoodsClassCodeRuleDynamicSqlSupport {

  public static BasGoodsClassCodeRuleTable basGoodsClassCodeRuleTable =
      new BasGoodsClassCodeRuleTable();
  public static SqlColumn<Long> id = basGoodsClassCodeRuleTable.id;
  public static SqlColumn<Long> deleted = basGoodsClassCodeRuleTable.deleted;
  public static SqlColumn<Date> createdAt = basGoodsClassCodeRuleTable.createdAt;
  public static SqlColumn<String> creatorCode = basGoodsClassCodeRuleTable.creatorCode;
  public static SqlColumn<String> creatorName = basGoodsClassCodeRuleTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basGoodsClassCodeRuleTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basGoodsClassCodeRuleTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basGoodsClassCodeRuleTable.modifierCode;
  public static SqlColumn<String> modifierName = basGoodsClassCodeRuleTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basGoodsClassCodeRuleTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basGoodsClassCodeRuleTable.version;
  public static SqlColumn<Long> codeRuleId = basGoodsClassCodeRuleTable.codeRuleId;
  public static SqlColumn<String> name = basGoodsClassCodeRuleTable.name;
  public static SqlColumn<Long> goodsClassId = basGoodsClassCodeRuleTable.goodsClassId;
  public static SqlColumn<String> goodsClassCode = basGoodsClassCodeRuleTable.goodsClassCode;
  public static SqlColumn<String> goodsClassName = basGoodsClassCodeRuleTable.goodsClassName;
  public static SqlColumn<Integer> isEnabled = basGoodsClassCodeRuleTable.isEnabled;
  public static SqlColumn<Integer> isDefault = basGoodsClassCodeRuleTable.isDefault;
  public static SqlColumn<String> remark = basGoodsClassCodeRuleTable.remark;

  public static final class BasGoodsClassCodeRuleTable extends SqlTable {
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

    public final SqlColumn<Long> codeRuleId = column("code_rule_id", JDBCType.BIGINT);
    public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);
    public final SqlColumn<Long> goodsClassId = column("goods_class_id", JDBCType.BIGINT);
    public final SqlColumn<String> goodsClassCode = column("goods_class_code", JDBCType.VARCHAR);
    public final SqlColumn<String> goodsClassName = column("goods_class_name", JDBCType.VARCHAR);
    public final SqlColumn<Integer> isEnabled = column("is_enabled", JDBCType.INTEGER);
    public final SqlColumn<Integer> isDefault = column("is_default", JDBCType.INTEGER);
    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);

    public BasGoodsClassCodeRuleTable() {
      super("BasGoodsClassCodeRule");
    }
  }
}
