package az.iktlab.opendata.client;


import az.iktlab.opendata.model.GeoName;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "https://api.opendata.az/v1/json/map")
public interface GeoNamesClient {

    @GetMapping("/geographicnames")
    GeoName getGeoName();
}
