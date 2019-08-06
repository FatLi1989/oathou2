package novli.nacos.spring.security.oauth2.server.mapper;

import novli.nacos.spring.security.oauth2.server.domain.TbPermission;
import org.apache.ibatis.annotations.Param;
import tk.mybaties.mapper.MyMapper;

import java.util.List;

/**
 * @author novLi
 * @date 2019年08月06日 14:31
 */
public interface TbPermissionMapper extends MyMapper<TbPermission> {
    List<TbPermission> selectByUserId(@Param("userId") Long userId);
}
