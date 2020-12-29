package easymall.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import easymall.dao.CartDao;
import easymall.po.Cart;
import easymall.pojo.MyCart;

@Service("cartService")
public class CartServiceImpl implements CartService {

	@Autowired
	private CartDao cartDao;
	
	
	@Override
	public Cart findCart(Cart cart) {
		// TODO Auto-generated method stub
		return cartDao.findCart(cart);
	}

	@Override
	public int addCart(Cart cart) {
		// TODO Auto-generated method stub
		return cartDao.addCart(cart);
	}

	@Override
	public int updateCart(Cart cart) {
		// TODO Auto-generated method stub
		return cartDao.updateCart(cart);
	}

	@Override
	public List<MyCart> showcart(int user_id) {
		// TODO Auto-generated method stub
		return cartDao.showCart(user_id);
	}

	@Override
	public void updateBuyNum(Cart cart) {
		cartDao.updateBuyNum(cart);
		
	}

	@Override
	public void delCart(Integer cartID) {
		cartDao.delCart(cartID);
		
	}

	@Override
	public MyCart findByCartID(Integer cartID) {
		// TODO Auto-generated method stub
		return cartDao.findByCartID(cartID);
	}

}
