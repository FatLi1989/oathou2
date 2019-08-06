package novli.nacos.spring.security.oauth2.server.service;

import novli.nacos.spring.security.oauth2.server.domain.TbPermission;

import java.util.List;

public interface TbPermissionService {
    List<TbPermission> selectByUserId(Long userId);
}
