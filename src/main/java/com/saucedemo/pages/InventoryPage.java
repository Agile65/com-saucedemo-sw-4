package com.saucedemo.pages;

import com.saucedemo.utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InventoryPage extends Utilities {

    By productsText=By.className("title");

    public String getProductText(){
        return getTextFromElement(productsText);
    }
    public int findActualNumberOfProducts(){
        List<WebElement> productList=findElementsFromWebPage(By.xpath("//img[starts-with(@class,'inventory_item_img')]"));
        return productList.size();
    }

}
