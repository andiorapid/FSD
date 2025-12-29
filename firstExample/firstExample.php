<?php

class ShopProduct
{
  public $title;
  public $price;
  public $productFirstName;
  public function myMethod() 
  {
      print $this->title;  
  }
}

$product1 = new ShopProduct;
$product1->title = "Mr Bigster";
$product1->myMethod();

