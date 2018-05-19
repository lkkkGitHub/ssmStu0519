package controller;

import com.github.pagehelper.PageInfo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import until.SpringmvcTest;

import static org.junit.Assert.*;

public class EmployeeControllerTest extends SpringmvcTest {
    @Test
    public void getAllEmpl() throws Exception {
//        模拟请求  拿到返回值
        MvcResult mvcResult=mockMvc.perform(MockMvcRequestBuilders.get("/Employee/getAllEmpl")
                .param("pageNum","1")).andReturn();
        MockHttpServletRequest mockHttpServletRequest =mvcResult.getRequest();
        PageInfo pageInfo= (PageInfo) mockHttpServletRequest.getAttribute("pageInfo");
    }
}