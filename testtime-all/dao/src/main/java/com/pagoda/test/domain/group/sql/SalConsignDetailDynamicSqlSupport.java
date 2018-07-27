package com.pagoda.test.domain.group.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.test.domain.group.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 发货单明细表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class SalConsignDetailDynamicSqlSupport {

  public static SalConsignDetailTable salConsignDetailTable = new SalConsignDetailTable();
  public static SqlColumn<Long> id = salConsignDetailTable.id;
  public static SqlColumn<Long> deleted = salConsignDetailTable.deleted;
  public static SqlColumn<Date> createdAt = salConsignDetailTable.createdAt;
  public static SqlColumn<String> creatorCode = salConsignDetailTable.creatorCode;
  public static SqlColumn<String> creatorName = salConsignDetailTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = salConsignDetailTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = salConsignDetailTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = salConsignDetailTable.modifierCode;
  public static SqlColumn<String> modifierName = salConsignDetailTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = salConsignDetailTable.modifierOrgCode;
  public static SqlColumn<Integer> version = salConsignDetailTable.version;
  public static SqlColumn<String> mnemWord = salConsignDetailTable.mnemWord;
  public static SqlColumn<String> registeBank = salConsignDetailTable.registeBank;

  public static final class SalConsignDetailTable extends SqlTable {
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

    public final SqlColumn<String> mnemWord = column("mnem_word", JDBCType.VARCHAR);
    public final SqlColumn<String> registeBank = column("registe_bank", JDBCType.VARCHAR);

    public SalConsignDetailTable() {
      super("SalConsignDetail");
    }
  }
}
