package com.shop.mapper;

import com.commons.entity.Shop;
import com.commons.entity.ShopType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShopMapper {
    Integer selectTypeIdByName(String typeName);

    boolean addShop(Shop shop);

    List<Shop> getShopListByHeat();

    List<Shop> getShopList();

    List<ShopType> getOneType();

    List<Shop> getShopListBySystem();

    List<Shop> getShopByName(String title);

    List<Shop> getShopListByType(Integer typeId);

    Shop getShopById(Integer id);

    boolean addShopPushById(Shop shop);

    ShopType getTypeByTypeName(String type);

    void addTypeByTypeName(ShopType typeName);

    int deleteShopById(Integer id);

    ShopType getTypeByTypeId(Integer typeId);

    void addShopVv(Integer id);
}
