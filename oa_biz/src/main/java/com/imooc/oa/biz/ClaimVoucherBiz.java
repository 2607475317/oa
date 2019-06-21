package com.imooc.oa.biz;

import com.imooc.oa.entity.ClaimVoucher;
import com.imooc.oa.entity.ClaimVoucherItem;
import com.imooc.oa.entity.DealRecord;

import java.util.List;

public interface ClaimVoucherBiz {
     //创建报销单
    void save(ClaimVoucher claimVoucher, List<ClaimVoucherItem> items);
    //报销单
    ClaimVoucher get(int id);
    //报销单条目
    List<ClaimVoucherItem> getItems(int cvid);
    //记录
    List<DealRecord> getRecords(int cvid);




    //获取个人报销单
    List<ClaimVoucher> getForSelf(String sn);
    //获取待处理报销单
    List<ClaimVoucher> getForDeal(String sn);
    //修改报销单
    void update(ClaimVoucher claimVoucher, List<ClaimVoucherItem> items);
    //根据报销单id提交报销单，
    void submit(int id);
    //处理，通过审核记录处理
    void deal(DealRecord dealRecord);
}
