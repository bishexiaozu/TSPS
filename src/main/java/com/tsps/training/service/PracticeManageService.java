package com.tsps.training.service;

import com.tsps.common.ResultBean;
import com.tsps.training.dto.PracticeDTO;
import com.tsps.training.dto.ScoreDTO;

/**
 *  * @author : luxinnan
 *  *  * @date : 2020/4/11/17：59
 *  *  * @description :注册做题服务类
 *  *  * @modified :
 */

public interface PracticeManageService {
    void addPractice(PracticeDTO practiceDTO);
    ResultBean setScore(ScoreDTO scoreDTO);
    ResultBean getWrong(Integer driverId, Integer page);
    ResultBean getCollect(Integer driverId,Integer page);
    ResultBean getTotalWrong(Integer page);
    ResultBean getTotalCollect( Integer page);
}
