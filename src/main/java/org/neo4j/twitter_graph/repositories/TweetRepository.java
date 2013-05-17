package org.neo4j.twitter_graph.repositories;

import java.util.Collection;

import org.neo4j.twitter_graph.domain.Tweet;
import org.springframework.data.neo4j.repository.GraphRepository;

/**
 * @author mh
 * @since 24.07.12
 */
public interface TweetRepository extends GraphRepository<Tweet> {
    Tweet findByTweetId(Long id);
    Collection<Tweet> findByTagsTag(String tag);
}
