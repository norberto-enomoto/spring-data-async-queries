package com.infiniteskills.springdata.async.data.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Defines custom methods that will be shared across all of our Spring Data repositories
 * @param <T>
 * @param <ID>
 */
@NoRepositoryBean
@SuppressWarnings("unchecked")
public interface BaseRepository<T, ID extends Serializable> extends JpaRepository<T, ID>
{
    //@Async
    //CompletableFuture<List<T>> findByIds(ID... ids);

    // @Override
    //@Async("executor")
    List<T> findByIds(ID... ids);
}
