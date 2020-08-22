package com.bikestore.gateway.repository;

        import com.bikestore.model.Bicicleta;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface BicicletaRepository extends JpaRepository<Bicicleta, Integer> {
}