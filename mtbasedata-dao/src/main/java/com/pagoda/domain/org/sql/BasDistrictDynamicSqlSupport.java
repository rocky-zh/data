package com.pagoda.domain.org.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.org.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * bas_district实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasDistrictDynamicSqlSupport {

  public static BasDistrictTable basDistrictTable = new BasDistrictTable();
  public static SqlColumn<Long> id = basDistrictTable.id;
  public static SqlColumn<Long> deleted = basDistrictTable.deleted;
  public static SqlColumn<Date> createdAt = basDistrictTable.createdAt;
  public static SqlColumn<String> creatorCode = basDistrictTable.creatorCode;
  public static SqlColumn<String> creatorName = basDistrictTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basDistrictTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basDistrictTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basDistrictTable.modifierCode;
  public static SqlColumn<String> modifierName = basDistrictTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basDistrictTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basDistrictTable.version;
  public static SqlColumn<Integer> districtLevel = basDistrictTable.districtLevel;
  public static SqlColumn<String> code = basDistrictTable.code;
  public static SqlColumn<String> parentCode = basDistrictTable.parentCode;
  public static SqlColumn<String> name = basDistrictTable.name;
  public static SqlColumn<String> searchWord = basDistrictTable.searchWord;
  public static SqlColumn<java.math.BigDecimal> adLat = basDistrictTable.adLat;
  public static SqlColumn<java.math.BigDecimal> adLng = basDistrictTable.adLng;

  public static final class BasDistrictTable extends SqlTable {
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

    public final SqlColumn<Integer> districtLevel = column("district_level", JDBCType.INTEGER);
    public final SqlColumn<String> code = column("code", JDBCType.VARCHAR);
    public final SqlColumn<String> parentCode = column("parent_code", JDBCType.VARCHAR);
    public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);
    public final SqlColumn<String> searchWord = column("search_word", JDBCType.VARCHAR);
    public final SqlColumn<java.math.BigDecimal> adLat = column("ad_lat", JDBCType.DECIMAL);
    public final SqlColumn<java.math.BigDecimal> adLng = column("ad_lng", JDBCType.DECIMAL);

    public BasDistrictTable() {
      super("BasDistrict");
    }
  }
}
