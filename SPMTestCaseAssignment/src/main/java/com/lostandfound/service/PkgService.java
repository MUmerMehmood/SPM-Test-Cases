package com.lostandfound.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lostandfound.repo.PkgRepo;

import antlr.collections.List;


@Service
public class PkgService {
	
	@Autowired
	private PkgRepo repo;

//    public List<Package> findAll() {
//        return repo.findAll();
//    }

    public Optional <Package> findById(Long id) {
        return repo.findById(id);
    }

    public Package save(Package pkg) {
        return repo.save(pkg);
    }

    public void deleteById(Long id) {
        repo.deleteById(id);
    }

}
