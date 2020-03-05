package net.atlassian.cmathtutor.adaptive.domain.data;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor(onConstructor = @__(@JsonCreator))
public class CreateQuestionDefinitionRuleData {

    @Schema(nullable = false)
    private Integer questionNumberFrom;

    private Integer questionNumberTo;

    @Schema(nullable = false)
    private Map<String, MinMarkRequirementData> minGradeMarkRequirements;

    @Schema(nullable = false)
    private List<Integer> questionIds;
    
    @Schema(nullable = false)
    private Integer testId;
}
