package com.example.nameservice2;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NameMapper {

    @Select("SELECT * FROM names WHERE name NOT LIKE CONCAT(#{prefix}, '%')")
    List<Name> findByNameStartingWith(String prefix);
}
