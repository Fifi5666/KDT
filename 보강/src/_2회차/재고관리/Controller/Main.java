package _2회차.재고관리.Controller;

import _2회차.재고관리.Model.Product;
import _2회차.재고관리.Service.ProductService;
import _2회차.재고관리.Service.ProductServiceImpl;

public class Main {
	
	public static void main(String[] args) {
		ProductService service = new ProductServiceImpl();

		
		// 메뉴 입력
		// 재고 정보 입력
		// 1. 재고 등록
		service.insert(new Product());
	}

}
