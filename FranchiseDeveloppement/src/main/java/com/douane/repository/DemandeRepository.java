package com.douane.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.douane.entite.Demande;
import com.douane.entite.FDossier;

public interface DemandeRepository extends CrudRepository<Demande, Long>{
	public List<Demande> findAll();
	public List<Demande> findByOrderByEtatDemandeAsc();
	public List<Demande> findByOrderByDateDepotAsc();
	public List<Demande> findByOrderByFcuo_nomAsc();
	public List<Demande> findByOrderByFrequerant_nomAsc();
}
