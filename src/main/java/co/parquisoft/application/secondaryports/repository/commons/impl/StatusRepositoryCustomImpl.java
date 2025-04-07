package co.parquisoft.application.secondaryports.repository.commons.impl;

import java.util.ArrayList;
import java.util.List;

import co.parquisoft.application.secondaryports.entity.commons.StatusEntity;
import co.parquisoft.application.secondaryports.repository.commons.StatusRepositoryCustom;
import co.parquisoft.crosscutting.exception.RepositoryParquiSoftException;
import co.parquisoft.crosscutting.helpers.ObjectHelper;
import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.Predicate;

public class StatusRepositoryCustomImpl implements StatusRepositoryCustom {

	private EntityManager entityManager;

	public StatusRepositoryCustomImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<StatusEntity> findByFilter(StatusEntity filter) {
		try {
			var criteriaBuilder = entityManager.getCriteriaBuilder();
			var query = criteriaBuilder.createQuery(StatusEntity.class);
			var result = query.from(StatusEntity.class);

			var predicates = new ArrayList<>();

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
