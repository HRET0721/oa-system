package org.hret.controller.personnel.assess;

import com.github.pagehelper.PageInfo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.hret.entity.personnel.assess.AssessTemplate;
import org.hret.pojo.JsonResult;
import org.hret.service.personnel.assess.AssessTemplateService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping(value = "assessTemplate")
@Tag(name = "考核模板方法", description = "考核模板方法")
public class AssessTemplateController {
    private final AssessTemplateService assessTemplateService;
    @RequestMapping(value = "findAssessTemplateListAndPage", method = RequestMethod.POST)
    @Operation(summary = "查询考核模板列表和分页",description = "查询考核模板列表和分页")
    public PageInfo<AssessTemplate> findAssessTemplateListAndPage(@RequestBody AssessTemplate assessTemplate)
    {
        return assessTemplateService.findAssessTemplateListAndPage(assessTemplate);
    }
    @RequestMapping(value = "addAssessTemplate",method = RequestMethod.POST)
    @Operation(summary = "添加考核模板",description = "添加考核模板")
    public JsonResult addAssessTemplate(@RequestBody AssessTemplate assessTemplate)
    {
        try {
            return assessTemplateService.addAssessTemplate(assessTemplate);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonResult.error("添加失败");
        }
    }
    @RequestMapping(value = "findAssessTemplateById",method = RequestMethod.POST)
    @Operation(summary = "根据考核模板id查询考核模板",description = "根据考核模板id查询考核模板")
    public AssessTemplate findAssessTemplateById(@RequestParam(value = "templateId") Long templateId)
    {
        return assessTemplateService.findAssessTemplateById(templateId);
    }
    @RequestMapping(value = "deleteAssessTemplate",method = RequestMethod.POST)
    @Operation(summary = "删除考核模板",description = "删除考核模板")
    public JsonResult deleteAssessTemplate(@RequestParam(value = "templateId") Long templateId)
    {
        try {
            return assessTemplateService.deleteAssessTemplate(templateId);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonResult.error("删除失败");
        }
    }
    @RequestMapping(value = "updateAssessTemplate",method = RequestMethod.POST)
    @Operation(summary = "修改考核模板",description = "修改考核模板")
    public JsonResult updateAssessTemplate(@RequestBody AssessTemplate assessTemplate)
    {
        try {
            return assessTemplateService.updateAssessTemplate(assessTemplate);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonResult.error("修改失败");
        }
    }
}
