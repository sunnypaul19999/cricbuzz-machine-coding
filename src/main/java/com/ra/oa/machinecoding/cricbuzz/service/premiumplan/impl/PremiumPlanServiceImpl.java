package com.ra.oa.machinecoding.cricbuzz.service.premiumplan.impl;

import com.ra.oa.machinecoding.cricbuzz.model.PremiumPlan;
import com.ra.oa.machinecoding.cricbuzz.repository.PremiumPlanRepository;
import com.ra.oa.machinecoding.cricbuzz.service.premiumplan.PremiumPlanService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PremiumPlanServiceImpl implements PremiumPlanService {

  @Autowired private PremiumPlanRepository premiumPlanRepository;

  @Override
  public List<PremiumPlan> getAllPremiumPlans() {
    return premiumPlanRepository.findAll();
  }
}
