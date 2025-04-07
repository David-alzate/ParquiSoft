package co.parquisoft.application.secondaryports.repository.commons.impl;

import co.parquisoft.application.secondaryports.entity.commons.IdTypeEntity;
import co.parquisoft.application.secondaryports.repository.commons.IdTypeRepositoryCustom;
import co.parquisoft.crosscutting.exception.RepositoryParquiSoftException;
import co.parquisoft.crosscutting.helpers.ObjectHelper;
import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.Predicate;

import java.util.ArrayList;
import java.util.List;

public class IdTypeRepositoryCustomImpl implements IdTypeRepositoryCustom {

	private EntityManager entityManager;

	public IdTypeRepositoryCustomImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<IdTypeEntity> findByFilter(IdTypeEntity filter) {
		try {
			var criteriaBuilder = entityManager.getCriteriaBuilder();
			var query = criteriaBuilder.createQuery(IdTypeEntity.class);
			var result = query.from(IdTypeEntity.class);

			var predicates = new ArrayList<Predicate>();

			if (!ObjectHelper.isNull(filter)) {
				if (!UUIDHelper.isDefault(filter.getId())) {
					predicates.add(criteriaBuilder.equal(result.get("id"), filter.getId()));
				}

				if (!TextHelper.isEmpty(filter.getName())) {
					predicates.add(criteriaBuilder.equal(result.get("tipo"), filter.getName()));
				}
			}

			query.select(result).where(criteriaBuilder.and(predicates.toArray(new Predicate[0])));
			return entityManager.createQuery(query).getResultList();

		} catch (final Exception exception) {
			throw RepositoryParquiSoftException.create(null, null, exception);
		}
	}
}