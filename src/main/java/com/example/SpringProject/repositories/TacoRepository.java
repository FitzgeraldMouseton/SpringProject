package com.example.SpringProject.repositories;

import com.example.SpringProject.dao.Taco;
import org.springframework.stereotype.Repository;

@Repository
public interface TacoRepository {

    Taco save(Taco taco);
}
