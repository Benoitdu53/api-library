package com.api.library.repository;

import com.api.library.model.Copy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CopyRepository extends JpaRepository<Copy, Long> {

    // Récupérer les exemplaires disponible
    @Query("SELECT DISTINCT  c, COUNT(c.format) AS numberCopy FROM Copy c WHERE c.book.id = :id")
    List<Copy> getCopyByIdBook(@Param("id") Long id);

    // Récupère l'exemplaire selon l'id
    @Query("SELECT c FROM Copy c WHERE c.id = :idCopy")
    Copy getCopyById(@Param("idCopy") Long idCopy);
}
