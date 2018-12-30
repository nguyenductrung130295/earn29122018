package vn.datset2.trung95.earn29122018.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import vn.datset2.trung95.earn29122018.entities.Category;
@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long>, QuerydslPredicateExecutor<Category>{

}
