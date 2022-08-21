
package com.portfolio.fjn.Repository;

import com.portfolio.fjn.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IpersonaRepository extends JpaRepository<Persona,Long>{
    
}
