package novli.nacos.spring.security.oauth2.server.service.impl;

import novli.nacos.spring.security.oauth2.server.mapper.TbRoleMapper;
import novli.nacos.spring.security.oauth2.server.service.TbRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author novLi
 * @date 2019年08月06日 14:50
 */
@Service
public class TbRoleServiceImpl implements TbRoleService {

    @Resource
    private TbRoleMapper tbRoleMapper;

}
