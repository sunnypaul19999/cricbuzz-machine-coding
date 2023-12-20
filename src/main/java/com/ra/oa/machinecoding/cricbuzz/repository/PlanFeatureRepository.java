package com.ra.oa.machinecoding.cricbuzz.repository;

import com.ra.oa.machinecoding.cricbuzz.model.PlanFeature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanFeatureRepository extends JpaRepository<PlanFeature, Long> {}
