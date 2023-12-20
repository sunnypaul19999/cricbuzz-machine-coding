package com.ra.oa.machinecoding.cricbuzz.repository.premium;

import com.ra.oa.machinecoding.cricbuzz.model.premium.PremiumPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PremiumPlanRepository extends JpaRepository<PremiumPlan, Long> {}
