package com.pagoda.service.group.base;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.*;
import com.pagoda.api.group.*;
import com.pagoda.api.dto.group.*;
import com.pagoda.domain.group.*;
import com.pagoda.repo.group.*;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.validation.*;
import io.swagger.annotations.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.transaction.annotation.*;
import org.springframework.validation.annotation.Validated;

/**
 * 目录分类表服务实现类BasCatClassServiceImpl继承的父类,实现一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public abstract class BaseBasCatClassServiceImpl implements BasCatClassService, InitializingBean {

  @Autowired protected BasCatClassRepository repository;

  @Autowired protected BasCatClassTreeRepository treeRepository;

  /**
   * 服务初始化
   *
   * @throws Exception
   */
  @Override
  public void afterPropertiesSet() throws Exception {}

  /**
   * 查询所有记录
   *
   * @return
   */
  public Iterable<BasCatClassDTO> findAll() {
    return BasCatClass.batchConvert(repository.findAll());
  }

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  @Override
  public BasCatClassDTO create(
      @ApiParam(value = "entity", required = true) @Valid BasCatClassDTO entity)
      throws ServiceException {
    try {
      return repository.create(BasCatClass.convertDTO(entity));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /**
   * Create all given entities.
   *
   * @param entities
   * @return the saved entities
   * @throws IllegalArgumentException in case the given entity is {@literal null}.
   */
  @ApiOperation(value = "batchCreate", notes = "批量插入多条记录")
  @Override
  public Iterable<BasCatClassDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<BasCatClassDTO> entities)
      throws ServiceException {
    try {
      Iterable<BasCatClass> itor = repository.batchCreate(BasCatClass.batchConvertDTO(entities));
      return BasCatClass.batchConvert(itor);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /**
   * Update a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   */
  @ApiOperation(value = "update", notes = "更新一条记录")
  @Override
  public BasCatClassDTO update(@ApiParam(value = "entity", required = true) BasCatClassDTO entity)
      throws ServiceException {
    try {
      return repository.update(BasCatClass.convertDTO(entity));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /**
   * Update all given entities.
   *
   * @param entities
   * @return the saved entities
   * @throws IllegalArgumentException in case the given entity is {@literal null}.
   */
  @ApiOperation(value = "batchUpdate", notes = "批量更新多条记录")
  @Override
  public Iterable<BasCatClassDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<BasCatClassDTO> entities)
      throws ServiceException {
    try {
      Iterable<BasCatClass> itor = repository.batchUpdate(BasCatClass.batchConvertDTO(entities));
      return BasCatClass.batchConvert(itor);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /**
   * Deletes the entity with the given id.
   *
   * @param id must not be {@literal null}.
   * @throws IllegalArgumentException in case the given {@code id} is {@literal null}
   */
  @ApiOperation(value = "delete", notes = "删除一条记录")
  @Override
  public void delete(@ApiParam(value = "id", required = true) Long id) throws ServiceException {
    try {
      repository.delete(id);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /**
   * Deletes the entities in a batch with the given ids.
   *
   * @param ids must not be {@literal null}.
   * @throws IllegalArgumentException in case the given {@code ids} is {@literal null}
   * @throws ServiceException
   */
  @ApiOperation(value = "batchDelete", notes = "批量删除多条记录")
  @Override
  public void batchDelete(@ApiParam(value = "ids", required = true) Iterable<Long> ids)
      throws ServiceException {
    for (Long id : ids) {
      delete(id);
    }
  }

  /**
   * Retrieves an entity by its id.
   *
   * @param id must not be {@literal null}.
   * @return the entity with the given id or {@literal null} if none found
   * @throws IllegalArgumentException if {@code id} is {@literal null}
   */
  @ApiOperation(value = "getById", notes = "根据id查询记录")
  @Override
  public BasCatClassDTO getById(@ApiParam(value = "id", required = true) Long id)
      throws ServiceException {
    try {
      return repository.getById(id);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  @Override
  public Iterable<BasCatClassDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
      throws ServiceException {
    try {
      return BasCatClass.batchConvert(repository.batchGetByIds(idList));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /**
   * 新增一个叶子节点记录
   *
   * @param entity 节点记录
   * @param pid 父节点id
   * @param catId 目录id
   * @param entId 企业id
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "createLeafNode", notes = "新增一个叶子节点记录")
  @Transactional(rollbackFor = ServiceException.class)
  @Override
  public BasCatClassDTO createLeafNode(
      @ApiParam(value = "entity", required = true) @Valid BasCatClassDTO entity,
      @ApiParam(value = "pid", required = true) Long pid,
      @ApiParam(value = "catId", required = true) Long catId,
      @ApiParam(value = "entId", required = true) Long entId)
      throws ServiceException {
    // 一个节点可以加入多个树，treePath的路径需要用户自己填？
    BasCatClassDTO dto = repository.create(BasCatClass.convertDTO(entity));

    BasCatClassTree leaf = new BasCatClassTree();
    leaf.setPid(dto.getId());
    leaf.setCid(dto.getId());
    leaf.setEntId(entId);
    leaf.setCatId(catId);
    leaf.setDistance(0L);
    treeRepository.create(leaf);

    if (pid == null || pid == 0) {
      return dto;
    }
    List<BasCatClassTree> parents = treeRepository.getParents(pid, 0L, catId, entId);
    if (parents != null) {
      List<BasCatClassTree> relations = new ArrayList<>(parents.size());
      for (BasCatClassTree t : parents) {
        BasCatClassTree rel = new BasCatClassTree();
        rel.setPid(t.getPid());
        rel.setCid(dto.getId());
        rel.setEntId(entId);
        rel.setCatId(catId);
        // 新增节点和父节点的距离
        rel.setDistance(t.getDistance() + 1);
        relations.add(rel);
      }
      treeRepository.batchCreate(relations);
    }
    return dto;
  }

  /**
   * 修改cid节点的父节点，把cid节点对应的整个子树迁移到pid节点下面
   *
   * @param pid
   * @param cid
   * @param catId
   * @param entId
   * @throws ServiceException
   */
  @Transactional(rollbackFor = ServiceException.class)
  @ApiOperation(value = "moveSubTree", notes = "修改cid节点的父节点，把cid节点对应的整个子树迁移到pid节点下面")
  @Override
  public void moveSubTree(
      @ApiParam(value = "pid", required = true) Long pid,
      @ApiParam(value = "cid", required = true) Long cid,
      @ApiParam(value = "catId", required = true) Long catId,
      @ApiParam(value = "entId", required = true) Long entId)
      throws ServiceException {

    //  按节点距离递减，第一个是根节点
    List<BasCatClassTree> oldParents = treeRepository.getParents(cid, 1L, catId, entId);
    // 按节点距离递增，最后一个是叶子节点
    List<BasCatClassTree> children = treeRepository.getTreeNodes(cid, catId, entId);

    children.add(new BasCatClassTree(cid, cid, 0L, catId, entId));

    if (oldParents != null && oldParents.size() > 0) {
      List<Long> oldParentIds =
          oldParents.stream().map(o -> o.getPid()).collect(Collectors.toList());
      List<Long> childrenIds = children.stream().map(c -> c.getCid()).collect(Collectors.toList());
      // 删除与子树有关的父子关系
      treeRepository.deleteParentChildren(oldParentIds, childrenIds, catId, entId);
    }

    List<BasCatClassTree> parents = treeRepository.getParents(pid, 1L, catId, entId);
    List<Long> parentIds = parents.stream().map(o -> o.getPid()).collect(Collectors.toList());
    parentIds.add(pid);

    int dist = 0;
    for (int p = parentIds.size() - 1; p >= 0; p--) {
      dist++;
      long parentId = parentIds.get(p);
      for (BasCatClassTree c : children) {
        BasCatClassTree leaf = new BasCatClassTree();
        leaf.setPid(parentId);
        leaf.setCid(c.getCid());
        leaf.setDistance((long) (dist + c.getDistance()));
        leaf.setEntId(entId);
        leaf.setCatId(catId);
        treeRepository.create(leaf);
      }
    }
  }

  /**
   * 删除一个叶子节点记录
   *
   * @param id
   * @param catId
   * @param entId
   * @throws ServiceException
   */
  @ApiOperation(value = "deleteLeafNode", notes = "删除一个叶子节点记录")
  @Transactional(rollbackFor = ServiceException.class)
  @Override
  public void deleteLeafNode(
      @ApiParam(value = "id", required = true) Long id,
      @ApiParam(value = "catId", required = true) Long catId,
      @ApiParam(value = "entId", required = true) Long entId)
      throws ServiceException {
    List<BasCatClassTree> children = treeRepository.getChildren(id, catId, entId);
    if (children != null && children.size() > 0) {
      throw new ServiceException(String.format("id=%d, catId=%d不是叶子节点", id, catId));
    } else {
      treeRepository.deleteLeafNode(id, catId, entId);
    }
  }

  /**
   * 删除节点对应的整个子树
   *
   * @param id
   * @param catId
   * @param entId
   */
  @ApiOperation(value = "deleteSubTree", notes = "删除节点对应的整个子树")
  @Transactional(rollbackFor = ServiceException.class)
  @Override
  public void deleteSubTree(
      @ApiParam(value = "id", required = true) Long id,
      @ApiParam(value = "catId", required = true) Long catId,
      @ApiParam(value = "entId", required = true) Long entId) {
    // 查询子树上的所有节点
    List<BasCatClassTree> nodes = treeRepository.getTreeNodes(id, catId, entId);
    List<Long> idList = new ArrayList<>();
    idList.add(id);
    if (nodes != null && nodes.size() > 0) {
      nodes.forEach(n -> idList.add(n.getCid()));
    }

    treeRepository.deleteSubTree(idList, catId, entId);
  }

  /**
   * 查询父节点
   *
   * @param id 查询id对应的节点的父节点
   * @param catId
   * @param entId
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "getParentNode", notes = "获取id节点的父节点记录")
  @Override
  public BasCatClassDTO getParentNode(
      @ApiParam(value = "id", required = true) Long id,
      @ApiParam(value = "catId", required = true) Long catId,
      @ApiParam(value = "entId", required = true) Long entId)
      throws ServiceException {
    return repository.getParentNode(id, catId, entId);
  }

  /**
   * 查询直接子节点
   *
   * @param id
   * @param catId
   * @param entId
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "getChildren", notes = "取得id之下的所有直接子节点")
  @Override
  public Iterable<BasCatClassDTO> getChildren(
      @ApiParam(value = "id", required = true) Long id,
      @ApiParam(value = "catId", required = true) Long catId,
      @ApiParam(value = "entId", required = true) Long entId)
      throws ServiceException {
    return repository.getChildren(id, catId, entId);
  }

  /**
   * 取得id之下的子树中的所有叶子节点
   *
   * @param id
   * @param catId
   * @param entId
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "getLeafNodes", notes = "取得id之下的子树，以一个树形结构返回")
  @Override
  public List<BasCatClassDTO> getLeafNodes(
      @ApiParam(value = "id", required = true) Long id,
      @ApiParam(value = "catId", required = true) Long catId,
      @ApiParam(value = "entId", required = true) Long entId)
      throws ServiceException {
    try {
      BasCatClassDTO node = getById(id);
      if (node == null) {
        throw new ServiceException("不存在指定节点，id=" + id);
      }
      // 查询子树上的所有节点
      List<BasCatClassTree> nodes = treeRepository.getTreeNodes(id, catId, entId);
      if (nodes == null || nodes.size() == 0) {
        // 没有子节点
        return Collections.emptyList();
      }
      List<Long> idList = nodes.stream().map(n -> n.getCid()).collect(Collectors.toList());
      // 查询非叶子节点
      List<BasCatClassTree> parentNodes = treeRepository.getChildren(idList, catId, entId);
      if (parentNodes != null) {
        Set<Long> nonLeaf = parentNodes.stream().map(p -> p.getPid()).collect(Collectors.toSet());
        // 删除非叶子节点id
        idList.removeAll(nonLeaf);
      }
      // 根据id查找所有叶子节点
      return idList.stream().map(leafId -> getById(leafId)).collect(Collectors.toList());
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /**
   * 取得id之下的子树，以一个树形结构返回。
   *
   * @param id
   * @param catId
   * @param entId
   * @return
   */
  @ApiOperation(value = "getTree", notes = "取得id之下的子树，以一个树形结构返回")
  @Override
  public BasCatClassDTO getTree(
      @ApiParam(value = "id", required = true) Long id,
      @ApiParam(value = "catId", required = true) Long catId,
      @ApiParam(value = "entId", required = true) Long entId)
      throws ServiceException {
    try {
      BasCatClassDTO node = getById(id);
      if (node == null) {
        throw new ServiceException("不存在指定节点，id=" + id);
      }
      // 查询子树上的所有节点
      List<BasCatClassTree> nodes = treeRepository.getTreeNodes(id, catId, entId);
      if (nodes == null || nodes.size() == 0) {
        // 没有子节点，返回叶子节点
        return node;
      }
      Set<Long> ids = nodes.stream().map(n -> n.getCid()).collect(Collectors.toSet());
      // 将所有节点放入map中，方便查询
      List<BasCatClass> chidrenNodes = repository.findAll(ids);
      Map<Long, BasCatClassDTO> nodeMap =
          chidrenNodes.stream().collect(Collectors.toMap(BasCatClass::getId, u -> u.toDTO()));
      nodeMap.put(id, node);

      // 遍历父子关系，构建树形结构
      List<BasCatClassTree> relation = treeRepository.getParentChild(ids, catId, entId);
      for (BasCatClassTree r : relation) {
        BasCatClassDTO parent = nodeMap.get(r.getPid());
        BasCatClassDTO child = nodeMap.get(r.getCid());
        if (parent != null && child != null) {
          parent.addChild(child);
        }
      }
      return node;

    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  @Override
  public Page<BasCatClassDTO> findBy(
      @ApiParam("fullName") String fullName,
      @ApiParam("isLeaf") String isLeaf,
      @ApiParam("levelNum") Integer levelNum,
      @ApiParam("parentCatClassCode") String parentCatClassCode,
      @ApiParam("parentCatClassId") Integer parentCatClassId,
      @ApiParam("parentCatClassName") String parentCatClassName,
      @ApiParam("path") String path,
      @ApiParam("sourceId") Integer sourceId,
      @ApiParam("code") String code,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findBy(
          fullName,
          isLeaf,
          levelNum,
          parentCatClassCode,
          parentCatClassId,
          parentCatClassName,
          path,
          sourceId,
          code,
          pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /**
   * 根据非空的字段进行查询
   *
   * @param example
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findByExample", notes = "根据非空字段查询")
  @Override
  public Page<BasCatClassDTO> findByExample(
      @ApiParam("example") BasCatClassDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findByExample(BasCatClass.convertDTO(example), pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /*  // 动态sql演示，正式的sql需要在开发平台定义 ， 参考 https://blog.olowolo.com/post/new-mybatis-dynamic-sql/
   public Page<BasCatClassDTO> dynamicSqlSelectTest(@ApiParam("nameVal") String nameVal){
        // 开发测试
        // 方法 1, 注意生产环境不要使用字符串拼接构造sql，避免注入攻击
        Page<BasCatClassDTO> result1 = repository.dynamicSelectPage(SqlWrapper.asSelect("select * from bas_cat_class"), new PageParam(0, 10), BasCatClassDTO.class);
        System.out.println(result1);
        // 方法 2
        SelectStatementProvider selectStatement = select(id)
                .from(basCatClassTable)
                .build()
                .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
        Page<BasCatClassDTO> result2 =  repository.dynamicSelectPage(selectStatement, new PageParam(0, 10), BasCatClassDTO.class);
        System.out.println(result2);
        return result1;
   }

   @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
   public void dynamicSqlUpdateTest(@ApiParam("idVal")Long idVal, @ApiParam("nameVal") String nameVal) {
      // 开发测试sql更新
      // 方法 1，注意生产环境不要使用字符串拼接构造sql，避免注入攻击
      int ret1 = repository.dynamicUpdate(SqlWrapper.asUpdate("update bas_cat_class set name=\"" + nameVal + "\" where id=" + idVal));

      // 方法 2
      UpdateStatementProvider updateStatement = SqlBuilder.update(basCatClassTable).set(name).equalTo(nameVal).where(id, isEqualTo(idVal))
              .build()
              .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
      int ret2 = repository.dynamicUpdate(updateStatement);
  }
   */
}
