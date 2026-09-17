package intae.api.core.recommendation;

import lombok.AllArgsConstructor;import lombok.Getter;import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class Recommendation {

    private final int productId;
    private final int recommendationId;
    private final String author;
    private final int rate;
    private final String content;
    private final String serviceAddress;
}
