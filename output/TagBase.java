// auto-generated by get-my-vocadb-java-model at 2020-12-18T01:55:56.0057007
package dummy_package;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Getter @ToString
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Builder(toBuilder = true) @Jacksonized
public final class TagBase {

   String additionalNames;

   String categoryName;

   int id;

   String name;

   String urlSlug;

}
