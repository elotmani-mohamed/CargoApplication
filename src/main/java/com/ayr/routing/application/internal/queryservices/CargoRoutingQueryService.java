package com.ayr.routing.application.internal.queryservices;

import org.springframework.stereotype.Service;

import com.ayr.routing.domain.model.aggregates.Voyage;
import com.ayr.routing.infrastructure.repositories.VoyageRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Application Service class for the Cargo Routing Query service
 */
@Service
public class CargoRoutingQueryService {

    private VoyageRepository voyageRepository; // Inject Dependencies

    public CargoRoutingQueryService(VoyageRepository voyageRepository){
        this.voyageRepository = voyageRepository;
    }
    /**
     * Returns all Voyages
     * @return
     */
    @Transactional
    public List<Voyage> findAll(){
        return voyageRepository.findAll();
    }


}
