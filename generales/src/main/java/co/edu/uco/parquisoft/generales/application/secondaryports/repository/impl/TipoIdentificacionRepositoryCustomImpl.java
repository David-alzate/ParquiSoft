package co.edu.uco.parquisoft.generales.application.secondaryports.repository.impl;

import co.edu.uco.parquisoft.generales.application.secondaryports.entity.TipoIdentificacionEntity;
import co.edu.uco.parquisoft.generales.application.secondaryports.repository.TipoIdentificacionRepositoryCustom;
import co.edu.uco.parquisoft.generales.crosscutting.exception.enums.RepositoryGeneralesException;
import co.edu.uco.parquisoft.generales.crosscutting.helpers.ObjectHelper;
import co.edu.uco.parquisoft.generales.crosscutting.helpers.TextHelper;
import co.edu.uco.parquisoft.generales.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.Predicate;

import java.util.ArrayList;
import java.util.List;

public class TipoIdentificacionRepositoryCustomImpl implements TipoIdentificacionRepositoryCustom {

	private EntityManager entityManager;

	public TipoIdentificacionRepositoryCustomImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<TipoIdentificacionEntity> findByFilter(TipoIdentificacionEntity filter) {
		try {
			var criteriaBuilder = entityManager.getCriteriaBuilder();
			var query = criteriaBuilder.createQuery(TipoIdentificacionEntity.class);
			var result = query.from(TipoIdentificacionEntity.class);

			var predicates = new ArrayList<Predicate>();

			if (!ObjectHelper.isNull(filter)) {
				if (!UUIDHelper.isDefault(filter.getId())) {
					predicates.add(criteriaBuilder.equal(result.get("id"), filter.getId()));
				}

				if (!TextHelper.isEmpty(filter.getTipo())) {
					predicates.add(criteriaBuilder.equal(result.get("tipo"), filter.getTipo()));
				}
			}

			query.select(result).where(criteriaBuilder.and(predicates.toArray(new Predicate[0])));
			return entityManager.createQuery(query).getResultList();

		} catch (final Exception exception) {
			throw RepositoryGeneralesException.create(null, null, exception);
		}
	}
}