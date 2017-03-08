package com.cartisan.commerce.common.view;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MenuItem {
    private String url;
    private String name;
    private String icon;
    private String activeClass;

    private List<MenuItem> subMenuItems;
}
