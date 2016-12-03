# mybatis-generator-core 扩展

1. 在Example中添加 limitStart和 limitEnd属性 用于根据index查询数据
2. 添加selectOneByExample方法 XXX selectOneByExample(XXXExample example);
3. 添加分页查询方法(miemiede的mybatis-paginator插件) 
   PageList<XXX> selectByExample(XXXExample example, PageBounds pageBounds);   
4. 添加insertBatchSelective方法 int insertBatchSelective(List<XXX> records);
5. 添加updateBatchByPrimaryKeySelective方法  int updateBatchByPrimaryKeySelective(List<XXX> records);;
