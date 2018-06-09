package de.adesso.wickedcharts.showcase;

import org.apache.wicket.core.request.mapper.MountedMapper;
import org.apache.wicket.request.Url;
import org.apache.wicket.request.component.IRequestablePage;
import org.apache.wicket.request.mapper.info.PageComponentInfo;
import org.apache.wicket.request.mapper.parameter.PageParametersEncoder;
import org.apache.wicket.util.string.Strings;

public class NoIDMount extends MountedMapper {

    NoIDMount(String path, Class<? extends IRequestablePage> pageClass) {
        super(path, pageClass, new PageParametersEncoder());
    }

    @Override protected void encodePageComponentInfo(Url url, PageComponentInfo info) {
        if (info != null) {
            String s = info.toString();
            if (!Strings.isEmpty(s)) {
                try{ //If the resulting parameter is not a number then we add it to the url
                    Integer.parseInt(s);
                }catch (NumberFormatException e){
                    Url.QueryParameter parameter = new Url.QueryParameter(s, "");
                    url.getQueryParameters().add(parameter);
                }
            }
        }
    }
}
