package co.parquisoft.application.secondaryports.repository.commons.impl;

import co.parquisoft.application.secondaryports.entity.commons.VehicleTypeEntity;
import co.parquisoft.application.secondaryports.repository.commons.VehicleTypeRepositoryCustom;
import co.parquisoft.crosscutting.exception.RepositoryParquiSoftException;
import co.parquisoft.crosscutting.helpers.ObjectHelper;
import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.Predicate;

import java.util.ArrayList;
import java.util.List;

public class VehicleTypeRepositoryCustomImpl implements VehicleTypeRepositoryCustom {

    private EntityManager entityManager;

    public VehicleTypeRepositoryCustomImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<VehicleTypeEntity> findByFilter(VehicleTypeEntity filter) {
        try {
            var criteriaBuilder = entityManager.getCriteriaBuilder();
            var query = criteriaBuilder.createQuery(VehicleTypeEntity.class);
            var result = query.from(VehicleTypeEntity.class);

            var predicates = new ArrayList<Predicate>();

            if (!ObjectHelper.isNull(filter)) {
                if (!UUIDHelper.isDefault(filter.getId())) {
                    predicates.add(criteriaBuilder.equal(result.get("id"), filter.getId()));
                }

                if (!TextHelper.isEmpty(filter.getName())) {
                    predicates.add(criteriaBuilder.equal(result.get("name"), filter.getName()));
                }
            }

            query.select(result).where(criteriaBuilder.and(predicates.toArray(new Predicate[0])));
            return entityManager.createQuery(query).getResultList();

        } catch (final Exception exception) {
            throw RepositoryParquiSoftException.create(null, null, exception);
        }
    }

}
