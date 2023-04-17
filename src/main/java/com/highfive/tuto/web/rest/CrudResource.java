package com.highfive.tuto.web.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


import com.highfive.tuto.Service.CrudService;


public abstract class CrudResource<T, ID> {
    
    private final CrudService<T, ID> crudService;

    public CrudResource(CrudService CrudResource){
        this.crudService = CrudResource ;
    }

    @GetMapping("/{id}")
    public Optional<T> get(ID id)
    {
        return crudService.get(id);
    }
    
    @GetMapping("")
    public List<T> getAll() {
        return crudService.getAll();
    }
   
    @PostMapping
    public T create(T entity){
        return crudService.create(entity);
    }

    @PutMapping("/{id}")
    public T update(ID id, T entity){
        return crudService.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public boolean delete(ID id) {
       return crudService.delete( id);
    }

}

