package springblack.common;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.time.LocalDateTime;

public class CustomDateSerializer extends JsonSerializer<LocalDateTime> {

    @Override
    public void serialize(LocalDateTime value, JsonGenerator gen, SerializerProvider arg2) throws IOException {

//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//        String formattedDate = formatter.format(value);

        gen.writeString(value.toString());

    }

}
