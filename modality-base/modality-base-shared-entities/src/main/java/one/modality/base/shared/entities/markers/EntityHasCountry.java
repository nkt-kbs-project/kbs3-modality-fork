package one.modality.base.shared.entities.markers;

import dev.webfx.stack.orm.entity.Entity;
import dev.webfx.stack.orm.entity.EntityId;
import one.modality.base.shared.entities.Country;

/**
 * @author Bruno Salmon
 */
public interface EntityHasCountry extends Entity, HasCountry {

    // Replace string literals with static constants
    String country = "country";

    @Override
    default void setCountry(Object value) { // Use consistent parameter naming
        setForeignField(country, value);
    }

    @Override
    default EntityId getCountryId() {
        return getForeignEntityId(country);
    }

    @Override
    default Country getCountry() {
        return getForeignEntity(country);
    }

}
