package pl.chochowski.sfgpetclinic.services;

import pl.chochowski.sfgpetclinic.model.Owner;

public interface OwnerService  extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
