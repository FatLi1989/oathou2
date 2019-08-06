package novli.nacos.spring.security.oauth2.server.service;

import novli.nacos.spring.security.oauth2.server.domain.TbUser;

public interface TbUserService {
    TbUser getByUsername(String username);
}
