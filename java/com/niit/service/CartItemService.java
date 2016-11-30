package com.niit.service;

import java.util.List;

import com.niit.model.Cart;
import com.niit.model.CartItem;

public interface CartItemService {

	  void addCartItem(CartItem cartItem);

	    void removeCartItem(CartItem cartItem);

	    void removeAllCartItems(Cart cart);

	    CartItem getCartItemByProductId(int pid);

}
