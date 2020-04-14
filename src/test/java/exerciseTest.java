import com.alibaba.fastjson.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.sql.Timestamp;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml", "file:src/main/resources/dispatcherServlet-servlet.xml"})
@WebAppConfiguration
public class exerciseTest {
    @Autowired
    WebApplicationContext context;

    MockMvc mockMvc;

    @Before
    public void initMockMvc() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }
//    @Test
//    public void testGetExerciseList() throws Exception{
//
//            JSONObject jsonObject = new JSONObject();
//            int employeeId = 100;
//            jsonObject.put("employeeId", employeeId);
//            String requestJson = JSONObject.toJSONString(jsonObject);
//            MvcResult result;
//            result = mockMvc.perform(MockMvcRequestBuilders.post("/content_manage/exercise").contentType("application/json").content(requestJson)).andReturn();
//            String string = result.getResponse().getContentAsString();
//            System.out.println(string);
//
//
//    }
    @Test
    public void addExam()throws Exception{
        JSONObject jsonObject = new JSONObject();
        Timestamp beginTime = new Timestamp(System.currentTimeMillis());
        Timestamp endTime = new Timestamp(System.currentTimeMillis());

        jsonObject.put("driverId",1);
        jsonObject.put("beginTime",beginTime);
        jsonObject.put("endTime",endTime);
        String requestJson = JSONObject.toJSONString(jsonObject);
        MvcResult result;
        result = mockMvc.perform(MockMvcRequestBuilders.post("/exam/addExam").contentType("application/json").content(requestJson)).andReturn();
        String string = result.getResponse().getContentAsString();
        System.out.println(string);


    }


}
