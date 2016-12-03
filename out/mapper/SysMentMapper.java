package mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import java.util.List;
import model.SysMent;
import model.SysMentExample;
import org.apache.ibatis.annotations.Param;

public interface SysMentMapper {
    long countByExample(SysMentExample example);

    int deleteByExample(SysMentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysMent record);

    int insertBatchSelective(List<SysMent> records);

    int insert(SysMent record);

    SysMent selectOneByExample(SysMentExample example);

    List<SysMent> selectByExample(SysMentExample example);

    PageList<SysMent> selectByExample(SysMentExample example, PageBounds pageBounds);

    SysMent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysMent record, @Param("example") SysMentExample example);

    int updateByExample(@Param("record") SysMent record, @Param("example") SysMentExample example);

    int updateByPrimaryKeySelective(SysMent record);

    int updateBatchByPrimaryKeySelective(List<SysMent> records);

    int updateByPrimaryKey(SysMent record);
}