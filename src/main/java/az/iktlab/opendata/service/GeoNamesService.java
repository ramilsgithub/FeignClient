package az.iktlab.opendata.service;

import az.iktlab.opendata.client.GeoNamesClient;
import az.iktlab.opendata.model.GeoName;
import az.iktlab.opendata.model.Response;
import org.springframework.stereotype.Service;

@Service
public class GeoNamesService {

    private final GeoNamesClient geoNamesClient;

    public GeoNamesService(GeoNamesClient geoNamesClient) {
        this.geoNamesClient = geoNamesClient;
    }


    public Response getGeoNameById(Long id) {

        GeoName geoName = geoNamesClient.getGeoName();

        for (Response response : geoName.getResponse())
            if (response.getObjectId() == id)
                return response;

        return null;
    }
}
