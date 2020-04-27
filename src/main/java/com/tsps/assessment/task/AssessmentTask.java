package com.tsps.assessment.task;

import com.tsps.assessment.service.AssessmentTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/9 17:25
 * @description:
 * @modified :
 */
@Component
public class AssessmentTask {

    @Autowired
    private AssessmentTaskService assessmentTaskService;

    @Scheduled(cron = "0 0 0 28 * ?")
    public void assessment(){
        System.out.println("定时考核开始");
        try {
            assessmentTaskService.assessment();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("定时考核结束");
    }

}
