package com.ra.oa.machinecoding.cricbuzz.service.premium.impl;

import com.ra.oa.machinecoding.cricbuzz.model.premium.PremiumPlan;
import com.ra.oa.machinecoding.cricbuzz.repository.premium.PremiumPlanRepository;
import com.ra.oa.machinecoding.cricbuzz.service.premium.PremiumService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PremiumServiceImpl implements PremiumService {

  @Autowired private PremiumPlanRepository premiumPlanRepository;

  @Override
  public List<PremiumPlan> getAllPremiumPlans() {
    return premiumPlanRepository.findAll();
  }
}
