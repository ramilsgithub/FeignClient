package az.iktlab.opendata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response{
    public int objectId;
    public String name;
    public Object nameEn;
}
