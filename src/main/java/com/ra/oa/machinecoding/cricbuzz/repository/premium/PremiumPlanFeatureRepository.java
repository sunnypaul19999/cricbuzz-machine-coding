package com.ra.oa.machinecoding.cricbuzz.repository.premium;

import com.ra.oa.machinecoding.cricbuzz.model.premium.PremiumPlanFeature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PremiumPlanFeatureRepository extends JpaRepository<PremiumPlanFeature, Long> {}
