package com.cydeo.model;

import com.cydeo.model.common.UserPrincipal;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;



@Component
public class BaseEntityListener extends AuditingEntityListener {

    private final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

    public void onPrePersist(BaseEntity baseEntity){
        baseEntity.createdTime = LocalDateTime.now();
        baseEntity.updatedTime = LocalDateTime.now();
//        baseEntity.createdUserId = 1L;
//        baseEntity.updatedUserId = 1L;

        if(authentication != null && !authentication.getName().equals("anonymousUser")){
            Object principal = authentication.getPrincipal();
            baseEntity.createdUserId = ((UserPrincipal) principal).getId();
            baseEntity.updatedUserId = ((UserPrincipal) principal).getId();
        }
    }

    public void onPreUpdate(BaseEntity baseEntity){
        baseEntity.updatedTime = LocalDateTime.now();
//        baseEntity.updatedUserId = 1L;



        if(authentication != null && !authentication.getName().equals("anonymousUser")){
            Object principal = authentication.getPrincipal();
            baseEntity.updatedUserId = ((UserPrincipal) principal).getId();
        }
    }
}
