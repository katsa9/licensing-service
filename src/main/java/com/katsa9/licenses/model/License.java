package com.katsa9.licenses.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class License {
    private String id;
    private String organizationId;
    private String productName;
    private String licenseType;
}
