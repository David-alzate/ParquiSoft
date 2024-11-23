package co.edu.uco.parquisoft.generales.application.secondaryports.repository.impl;

import java.util.ArrayList;
import java.util.List;

import co.edu.uco.parquisoft.generales.application.secondaryports.entity.TipoVehiculoEntity;
import co.edu.uco.parquisoft.generales.application.secondaryports.repository.TipoVehiculoRepositoryCustom;
import co.edu.uco.parquisoft.generales.crosscutting.exception.enums.RepositoryGeneralesException;
import co.edu.uco.parquisoft.generales.crosscutting.helpers.ObjectHelper;
import co.edu.uco.parquisoft.generales.crosscutting.helpers.TextHelper;
import co.edu.uco.parquisoft.generales.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.Predicate;

public class TipoVehiculoRepositoryCustomImpl implements TipoVehiculoRepositoryCustom {

	private EntityManager entityManager;

	public TipoVehiculoRepositoryCustomImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<TipoVehiculoEntity> findByFilter(TipoVehiculoEntity filter) {
		try {
			var criteriaBuilder = entityManager.getCriteriaBuilder();
			var query = criteriaBuilder.createQuery(TipoVehiculoEntity.class);
			var result = query.from(TipoVehiculoEntity.class);

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
			throw RepositoryGeneralesException.create(null, null, exception);
		}
	}

}
