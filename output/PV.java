// auto-generated by get-my-vocadb-java-model at 2020-12-18T01:55:55.9747821
package dummy_package;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Getter @ToString
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Builder(toBuilder = true) @Jacksonized
public final class PV {

   String author;

   int createdBy;

   boolean disabled;

   PVExtendedMetadata extendedMetadata;

   int id;

   int length;

   String name;

   String publishDate;

   String pvId;

   String service;

   String pvType;

   String thumbUrl;

   String url;

}
