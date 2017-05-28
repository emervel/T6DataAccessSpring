package com.emervel.repository;

import com.emervel.domain.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by guopm on 27/05/2017.
 * Post indica la entidad y Long indica la clave que usaremos para buscar en la tabla
 * donde se guardan las entidades. Al extender de CrudRepository ya tienes todos los metodos para insertar, buscar, borrar
 * o modificar, pero lo ponemos asi por si quieres anadir mas
 */
public interface PostRepository extends CrudRepository<Post,Long> {

    /**
     * El metodo es solo findFirstByOrderBy pero JPA nos permite anadir directamente el atributo de la clase
     * por el que queremos ordenar y la direccion de esa ordencion. Sin picar nada!! Out of the box!!
     * Ahora entiendo porque necesito una interfaz que herede de crudrepository en lugar de usarla directamente
     * porque nosotros seremos quienes pondremos estos metodos
     * @return
     */
    Post findFirstByOrderByPostedOnDesc();

    List<Post> findAllByOrderByPostedOnDesc();

    Post findBySlug(String slug);
}
