package org.fundacionjala.at04.moviesrestapi.repository;

import org.springframework.data.repository.CrudRepository;

import org.fundacionjala.at04.moviesrestapi.model.Movie;

/**
 * Created by Marcos.
 */
public interface MovieCrudRepository extends CrudRepository<Movie, String> {

    /**
     * {@inheritDoc}
     */
    @Override
    Movie findOne(String field);

    /**
     * {@inheritDoc}
     */
    @Override
    void delete(Movie movie);
}
