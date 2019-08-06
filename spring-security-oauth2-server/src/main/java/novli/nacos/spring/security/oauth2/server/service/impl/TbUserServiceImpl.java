package novli.nacos.spring.security.oauth2.server.service.impl;

import novli.nacos.spring.security.oauth2.server.domain.TbUser;
import novli.nacos.spring.security.oauth2.server.mapper.TbUserMapper;
import novli.nacos.spring.security.oauth2.server.service.TbUserService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;

/**
 * @author novLi
 * @date 2019年08月06日 14:28
 */
@Service
public class TbUserServiceImpl implements TbUserService {

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser getByUsername(String username) {
        Example example = new Example(TbUser.class);
        example.createCriteria().andEqualTo("username", username);
        return tbUserMapper.selectOneByExample(example);
    }

}
