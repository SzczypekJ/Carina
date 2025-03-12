package com.solvd.carina.demo.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;
import org.skyscreamer.jsonassert.JSONCompareMode;

@Endpoint(url = "${base_url}/carts/${cart_id}", methodType = HttpMethodType.DELETE)
@ResponseTemplatePath(path = "api/carts/_delete/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class DeleteCartsMethodsDummy extends AbstractApiMethodV2 {

    public DeleteCartsMethodsDummy(int cartId) {
        super();
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
        replaceUrlPlaceholder("cart_id", String.valueOf(cartId));

        // Ustaw tryb “non-strict”:
    }
}
