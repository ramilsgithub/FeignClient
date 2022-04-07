package az.iktlab.opendata.controller;

import az.iktlab.opendata.model.Response;
import az.iktlab.opendata.service.GeoNamesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GeographicalZones {

    private final GeoNamesService service;

    public GeographicalZones(GeoNamesService service) {
        this.service = service;
    }


    @GetMapping("/{id}")
    public Response getGeoName(@PathVariable Long id) {
        return service.getGeoNameById(id);
    }
}
