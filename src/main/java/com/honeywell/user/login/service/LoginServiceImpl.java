package com.honeywell.user.login.service;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.honeywell.user.login.entity.Session;
import com.honeywell.user.login.entity.User;
import org.springframework.core.io.ClassPathResource;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class LoginServiceImpl implements LognService {

    public String verifyAndLoginUser(User user) throws IOException {
        List<User> userList;
        try (InputStream in = new ClassPathResource("userDetail.json").getInputStream()) {
            ObjectMapper mapper = new ObjectMapper().configure(MapperFeature.USE_ANNOTATIONS, false);
            CollectionType collectionType = mapper.getTypeFactory().constructCollectionType(List.class, User.class);
            userList = mapper.readValue(in, collectionType);

            if (userList.contains(user)) {
                Session session = new Session(1,user.getUserName(),"1asqqwo");
                return "Session created";
            } else {
                return "user is not valid";
            }
        }

    }

    @Override
    public String clearSession() {
        Session session = new Session();
        return "session";
    }

    @Override
    public List<User> findAllUsers() {
        return null;
    }
}
