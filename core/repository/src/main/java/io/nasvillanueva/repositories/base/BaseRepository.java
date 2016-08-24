package io.nasvillanueva.repositories.base;

import io.nasvillanueva.model.base.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * Created by jvillanueva on 8/24/16.
 */
@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity, ID extends Serializable>
        extends JpaRepository<T, ID>,
        CrudRepository<T, ID> {
}
