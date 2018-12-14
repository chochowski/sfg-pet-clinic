package pl.chochowski.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import pl.chochowski.sfgpetclinic.model.Owner;
import pl.chochowski.sfgpetclinic.services.OwnerService;

import java.util.Set;

@Service
public class OwnerServiceMap extends  AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
