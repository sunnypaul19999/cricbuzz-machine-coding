package com.ra.oa.machinecoding.cricbuzz.controller.premium;

import com.ra.oa.machinecoding.cricbuzz.model.premium.PremiumPlan;
import com.ra.oa.machinecoding.cricbuzz.service.premium.PremiumService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/premium")
public class PremiumController {

  @Autowired private PremiumService premiumPlanService;

  @GetMapping("/all-plans")
  public List<PremiumPlan> getPremiumPlans() {
    return premiumPlanService.getAllPremiumPlans();
  }
}
