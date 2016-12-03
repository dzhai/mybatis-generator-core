package mapper;

import java.util.List;
import model.SysMent;
import model.SysMentExample;
import org.apache.ibatis.annotations.Param;

public interface SysMentMapper {
    long countByExample(SysMentExample example);

    int deleteByExample(SysMentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysMent record);

    int insertSelective(SysMent record);

    SysMent selectOneByExample(SysMentExample example);

    List<SysMent> selectByExample(SysMentExample example);

    SysMent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysMent record, @Param("example") SysMentExample example);

    int updateByExample(@Param("record") SysMent record, @Param("example") SysMentExample example);

    int updateByPrimaryKeySelective(SysMent record);

    int updateByPrimaryKey(SysMent record);
}